package com.DemoApplication.DemoApplication.Controller;


import com.DemoApplication.DemoApplication.Entity.ShareDtl;
import com.DemoApplication.DemoApplication.Entity.Users;
import com.DemoApplication.DemoApplication.Service.IService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

            @Autowired
            IService service;

            @GetMapping("/api/user/getAll")
            List<Users> getDetails(){
                return  service.getAllUsers();
            }

            @PostMapping("/getdeatailsByUserName")
            Users getdeatailsByUserName(@RequestParam("userCode") String userCode){
                return  service.getUserDtlByCode(userCode);
            }

            @PutMapping("/updateUser")
            String UpdateUser(@RequestBody Users users){
                return null;
            }

        /*    @PostMapping("/updateUserShare")
            String updateUserShare(@RequestBody ShareDtl shareDtl){
                return  service.updateUserDtl();
            }
*/
            @PostMapping("/createUsers")
            List<Users> createUsers(@RequestBody List<Users> users){

                return  service.createUsers(users);
            }

            @DeleteMapping("/deleteUsers")
            String deleteUser(@RequestParam("UserCode") String usercode,@RequestParam("password") String passowrd){
                return  "working";
            }



}
