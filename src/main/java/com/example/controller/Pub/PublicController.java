package com.example.controller.Pub;

import com.example.util.Mail.Mail;
import com.example.util.Mail.SendMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
//用来指定处理请求路径
@RequestMapping("/api/public")
public class PublicController {
//    返回数据Json类型
    @ResponseBody
    @RequestMapping(value = "/emailhint", method = RequestMethod.POST)
//    HttpServletRequest 用来接收请求的参数
    public void emailHint(HttpServletRequest request) throws Exception {
        Mail mail=new Mail();
        String usermail = request.getParameter("usermail");
        mail.setEmail(usermail);
        String type=request.getParameter("type");
        if(type.equals("1")){
            //注册
            mail.setTitle("注册使用！");
        }else if (type.equals("2")){
            //找回密码
            mail.setTitle("找回密码！");
        }else {
            //别乱写
        }
        String code=mail.makeCode();
        System.out.println(code);
        mail.setCode(code);
        //session 保存生成的验证码
        HttpSession session = request.getSession();
        session.setAttribute(usermail, code);
        session.setMaxInactiveInterval(20);
//        session.invalidate();
//        SendMail.sendMail(mail);


    }
//    返回数据Json类型
    @ResponseBody
    @RequestMapping(value = "/emailenter", method = RequestMethod.GET)
//    HttpServletRequest 用来接收请求的参数
    public void emailHint1(HttpServletRequest request) throws Exception {
        String userInputCode = request.getParameter("emailenter");
        String usermail = request.getParameter("usermail");
        //从session 获取对应用户邮箱的验证码
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute(usermail));
        System.out.println(userInputCode);
        if(session.getAttribute(usermail)==null){
            System.out.println("验证码失效，请重新获取");
        }else if(session.getAttribute(usermail).equals(userInputCode)){
            System.out.println("验证码匹配成功");
        }else {
            System.out.println("验证码输入不正确");
        }
    }

}
