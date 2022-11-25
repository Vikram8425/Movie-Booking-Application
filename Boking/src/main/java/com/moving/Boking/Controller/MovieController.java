package com.moving.Boking.Controller;

import com.moving.Boking.Model.CinemalF;
import com.moving.Boking.Model.User;

import com.moving.Boking.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.moving.Boking.Payload.UserDto;
import com.moving.Boking.Service.MovieService;
import  com.moving.Boking.Payload.CinemalFDto;
import com.moving.Boking.Payload.MoiveDto;
import com.moving.Boking.Payload.MovieDto;

import  java.util.*;
@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieService movieService;
   @GetMapping("/view")
    public List<MoiveDto> viewUser(@RequestBody UserDto userDto){
                String email=userDto.getUserEmail();
                List<MoiveDto> fetch=this.movieService.viewall(email);
        return fetch;
    }

}
