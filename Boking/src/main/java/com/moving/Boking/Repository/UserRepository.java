package com.moving.Boking.Repository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.moving.Boking.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer>{

public User findByuserEmail( String userEmail);

}
