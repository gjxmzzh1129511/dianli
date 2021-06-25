package com.example.service.Impl;

import com.example.dao.mapper.User1Mapper;
import com.example.model.studentmanager.User1;
import com.example.model.studentmanager.User1Example;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    User1Mapper user1Mapper;
    @Override
    public List<User1> getUserById(Integer id){
        //通过数据库查询系统用户
        System.out.println("查询用户"+id);
        //新建查询对象
        User1Example user1Example=new User1Example();
        //创建具体的查询条件实例
        User1Example.Criteria criteria=user1Example.createCriteria();
        //设置具体的查询条件
        criteria.andIdEqualTo(id.toString());
        //执行查询并返回
        return user1Mapper.selectByExample(user1Example);
    }

    @Override
    public int userRegister(User1 user1) {
        int result=user1Mapper.insert(user1);
        return result;
    }

    @Override
    public List<User1> userLogin(User1Example example) {

        return user1Mapper.selectByExample(example);
    }

    @Override
    public int updatePassword(User1 user1) {
        User1 user=new User1();
        user.setPassword(user1.getPassword());
        //新建查询对象
        User1Example user1Example=new User1Example();
        //创建具体的查询条件实例
        User1Example.Criteria criteria=user1Example.createCriteria();
        //设置具体的查询条件
        criteria.andEmailEqualTo(user1.getEmail());
        return user1Mapper.updateByExampleSelective(user1,user1Example);
    }

//    @Override
//    public List<User1> userListOrderby(String orderby,String limitstart,String limitend) {
//        User1Example user1Example=new User1Example();
//        user1Example.setLimitStart(limitstart);
//        user1Example.setLimitEnd(limitend);
//        return user1Mapper.selectByExample(user1Example);
//    }

    @Override
    public List<User1> findByEmail(String email) {
        //通过数据库查询系统用户
        System.out.println("查询用户"+email);
        //新建查询对象
        User1Example user1Example=new User1Example();
        //创建具体的查询条件实例
        User1Example.Criteria criteria=user1Example.createCriteria();
        //设置具体的查询条件
        criteria.andEmailEqualTo(email);
        //执行查询并返回
        return user1Mapper.selectByExample(user1Example);
    }
}
