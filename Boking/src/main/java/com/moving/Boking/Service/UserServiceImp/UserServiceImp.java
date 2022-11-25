package com.moving.Boking.Service.UserServiceImp;

import com.moving.Boking.Payload.UserDto;
import com.moving.Boking.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import  com.moving.Boking.Repository.UserRepository;
import  com.moving.Boking.Model.*;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Autowired(required = true)
    private ModelMapper modelMapper ;
    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDto createUser(UserDto newuser){
           User user= this.modelMapper.map(newuser,User.class);
           User save=this.userRepo.save(user);
           UserDto toDto=this.modelMapper.map(save,UserDto.class);
    return toDto;
    }
}
