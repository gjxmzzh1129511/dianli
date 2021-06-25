package com.example.service;


import com.example.model.studentmanager.User1;
import com.example.model.studentmanager.User1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserService {
    List<User1> getUserById(Integer id);
    int userRegister(User1 user1);
    List<User1> userLogin(User1Example example);
    int updatePassword(User1 user1);
//    List<User1> userListOrderby(String orderby,String limitstart,String limitend);
    List<User1> findByEmail(String email);
}
