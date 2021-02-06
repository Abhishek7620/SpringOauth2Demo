package com.DemoApplication.DemoApplication.Service;

import com.DemoApplication.DemoApplication.Entity.Users;


import java.util.List;

public interface IService {

    List<Users> getAllUsers();
    Users getUserDtlByCode(String userCode);
    List<Users> updateUserDtl(List<Users> users);
    String deleteUserDtl(String usercode,String password);
    List<Users>createUsers(List<Users> users);

}
