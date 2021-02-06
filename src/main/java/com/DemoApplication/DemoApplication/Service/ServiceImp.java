package com.DemoApplication.DemoApplication.Service;

import com.DemoApplication.DemoApplication.Dao.IRepoUsers;
import com.DemoApplication.DemoApplication.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp  implements IService{

    @Autowired
    IRepoUsers repo;


    @Override
    public List<Users> getAllUsers() {
        List<Users> users = repo.findAll();
        return users;
    }

    @Override
    public Users getUserDtlByCode(String userCode) {
        return repo.findByUserCode(userCode) ;
    }

    @Override
    public List<Users> updateUserDtl(List<Users> users) {
        return repo.saveAll(users);
    }

    @Override
    public String deleteUserDtl(String usercode, String password) {
        return null;
    }

    @Override
    public List<Users> createUsers(List<Users> users) {
        return repo.saveAll(users);
    }
}
