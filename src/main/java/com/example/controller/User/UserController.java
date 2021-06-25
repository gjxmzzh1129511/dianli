package com.example.controller.User;

import com.example.model.studentmanager.User1;
import com.example.model.studentmanager.User1Example;

import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/api/user1")
public class UserController {
    @Resource
    //相当于UserService =new UserService()
    UserService userService;
    //返回数据json类型
    @ResponseBody
    @RequestMapping(value = "/user1list",method = RequestMethod.GET)
    //HttpServletRequest 用来接受请求的参数
    public Map<String, Object> userListById(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        List<User1> user1List=userService.getUserById(Integer.parseInt(request.getParameter("id")));
        Map<String,Object> map =new HashMap<>();
        map.put("user1List",user1List);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/email",method = RequestMethod.POST)
    public Map<String, Object> emailJudge(HttpServletRequest request){
        String email=request.getParameter("email");
        List<User1> user1List=userService.findByEmail(email);
        Map<String,Object> map=new HashMap<>();
        map.put("user",user1List);
        if (user1List.size()!=0){
            map.put("message","该邮箱已存在，请重新输入！");
            map.put("code",0);
        }else {
            map.put("message", "该邮箱不存在");
            map.put("code", 1);
        }
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map<String,Object> userRegister(HttpServletRequest request){
        String uid= UUID.randomUUID().toString().replace("-","");
        String username=request.getParameter("username");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        User1 user1=new User1();
        user1.setTs(new Date());
        user1.setId(uid);
//        user1.setId(5);
        user1.setUsername(username);
        user1.setPhone(phone);
        user1.setEmail(email);
        user1.setPassword(password);
        Map<String,Object> map=new HashMap<>();
        int result=userService.userRegister(user1);
        if(result==1){
            map.put("message","用户注册成功");
            map.put("code",result);
        }else {
            map.put("message","用户注册失败");
            map.put("code",result);
        }

        map.put("userList1",result);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/login",method =RequestMethod.POST )
    public Map<String,Object> userLogin(HttpServletRequest request){
//        String uid= UUID.randomUUID().toString().replace("-","");
        String email=request.getParameter("email");
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        User1Example user1Example = new User1Example();
        User1Example.Criteria criterion = user1Example.createCriteria();

        Map<String,Object> map=new HashMap<>();
        Map<String,Object> mapResult=new HashMap<>();
        criterion.andEmailEqualTo(email);
        List<User1> result = userService.userLogin(user1Example);
        if (result.size()==0) {
            map.put("message","email不匹配！");
        }else {
            System.out.println(result.size());
            criterion.andEmailEqualTo(email);
            criterion.andUsernameEqualTo(username);
            List<User1> result1 = userService.userLogin(user1Example);
            System.out.println("1"+result1.size());
            if(result1.size()==0){
            map.put("message","该用户名不匹配！");
        }else {
                criterion.andEmailEqualTo(email);
                criterion.andUsernameEqualTo(username);
                criterion.andPasswordEqualTo(password);
                List<User1> result2 = userService.userLogin(user1Example);
                System.out.println("2"+result2.size());
            if(result2.size()==0){
                map.put("message","密码不匹配！");
            }else {
                mapResult.put("username", result.get(0).getUsername());
                mapResult.put("phone", result.get(0).getPhone());
                mapResult.put("email", result.get(0).getEmail());
                if (result.size() == 1) {
                    map.put("code", "1");
                    map.put("message", "登陆成功");
                    map.put("userInfo", mapResult);
                } else {
                    map.put("code", "0");
                    map.put("message", "登陆失败");
                }
            }
        }
        }
//        List<User1> result = userService.userLogin(user1Example);
//        Map<String,Object> map=new HashMap<>();
//        Map<String,Object> mapResult=new HashMap<>();
        System.out.println(result.size());
//        if(result.size()==0){
//            map.put("message","密码与用户名不匹配");
//        }else {
//            mapResult.put("username", result.get(0).getUsername());
//            mapResult.put("phone", result.get(0).getPhone());
//            mapResult.put("email", result.get(0).getEmail());
//            if (result.size() == 1) {
//                map.put("code", "1");
//                map.put("message", "登陆成功");
//                map.put("userInfo", mapResult);
//            } else {
//                map.put("code", "0");
//                map.put("message", "登陆失败");
//            }
//        }
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/updatepassword",method = RequestMethod.POST)
    public Map<String, Object> userUpdatePassword(HttpServletRequest request){
        String username=request.getParameter("username");
        String usermail=request.getParameter("usermail");
        String userInputCode=request.getParameter("emailenter");
        String password=request.getParameter("password");

        User1Example user1Example = new User1Example();
        User1Example.Criteria criterion = user1Example.createCriteria();
        criterion.andUsernameEqualTo(username);
        criterion.andEmailEqualTo(usermail);
        List<User1> result1 = userService.userLogin(user1Example);
        Map<String,Object> map=new HashMap<>();
        System.out.println(result1.size());
        if (result1.size()==0){
            map.put("message","用户名和邮箱不匹配！");
        }else {
            //从session 获取对应用户邮箱的验证码
            HttpSession session = request.getSession();
            System.out.println(session.getAttribute(usermail));
            System.out.println(userInputCode);
            //code==0失败
            //code==1成功
            //code==2验证码不正确
            if (session.getAttribute(usermail) == null) {
                map.put("code", 2);
                map.put("message", "验证码失效，请重新获取");
                System.out.println("验证码失效，请重新获取");
                return map;
            } else if (session.getAttribute(usermail).equals(userInputCode)) {
                map.put("message", "验证码匹配成功");
                System.out.println("验证码匹配成功");
            } else {
                map.put("code", 2);
                map.put("message", "验证码输入不正确");
                System.out.println("验证码输入不正确");
                return map;
            }
            User1 user1 = new User1();
            user1.setEmail(usermail);
            user1.setPassword(password);
            int result = userService.updatePassword(user1);
            if (result == 1) {
                map.put("message", "密码更新成功");
                map.put("code", result);
            } else {
                map.put("message", "密码更新失败");
                map.put("code", result);
            }
        }
        return map;
    }

//    @ResponseBody
//    @RequestMapping(value = "/userlistorderby",method = RequestMethod.GET)
//    public Map<String, Object> userlistorderby(HttpServletRequest request){
//        String orderby=request.getParameter("orderby");
//        String limitStart=request.getParameter("limitstart");
//        String limitEnd=request.getParameter("limitend");
//
//        Map<String,Object> map=new HashMap<>();
//        List<User1> result =userService.userListOrderby(orderby,limitStart,limitEnd);
//        if(result!=null){
//            map.put("message","成功");
//            map.put("code",result);
//        }else {
//            map.put("message","失败");
//            map.put("code",result);
//        }
//        return map;
//    }


//    public String userListById(Map<String,Object> map){
////        List<User1> userList=userService.getUserById(2);
////        map.put("userList",userList);
//        return "user1list";
//    }
    //返回数据json类型
//    @ResponseBody
//    @RequestMapping(value = "/user1list",method = RequestMethod.GET)
//    public Map<String,Object> userListById1(HttpServletRequest request){
//        List<User1> userList=userService.getUserById(Integer.parseInt(request.getParameter("id")));
//        Map<String,Object> map =new HashMap<>();
//        map.put("userList",userList);
//        System.out.println("执行接口");
//        return map;
//    }
}
