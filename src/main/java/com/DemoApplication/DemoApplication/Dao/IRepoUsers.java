package com.DemoApplication.DemoApplication.Dao;

import com.DemoApplication.DemoApplication.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoUsers extends JpaRepository<Users,Integer> {

    Users findByUserCode(String userCode);
}
