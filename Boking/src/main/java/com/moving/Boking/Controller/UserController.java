package com.moving.Boking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.moving.Boking.Payload.*;
import  com.moving.Boking.Service.*;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;
    @PostMapping("/createuser")
    ResponseEntity<UserDto>createUser(@RequestBody UserDto userDto){
        Date date=new Date();
        userDto.setCreateAt(date);
        UserDto user=this.userService.createUser(userDto);
        return new ResponseEntity<UserDto>(user,HttpStatus.CREATED);
    }

}
