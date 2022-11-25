package com.moving.Boking.Service.UserServiceImp;

import com.moving.Boking.Model.CinemalF;
import com.moving.Boking.Model.Moive;
import com.moving.Boking.Repository.CinemalFRepository;
import com.moving.Boking.Repository.MovieRespositry;
import com.moving.Boking.Repository.UserRepository;
import com.moving.Boking.Service.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.moving.Boking.Model.User;
import com.moving.Boking.Payload.UserDto;
import java.util.*;
import java.util.stream.Collectors;

import com.moving.Boking.Payload.CinemalFDto;
import com.moving.Boking.Payload.MoiveDto;
import com.moving.Boking.Payload.MovieDto;
@Service
public class MovieServiceImp implements MovieService {
    @Autowired
    private MovieRespositry movieRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private CinemalFRepository cinemalFRepository;
    @Override
    public List<MoiveDto> viewall(String email) {
                
            User user=this.userRepo.findByuserEmail(email);
            List<Moive> findByMoive = this.movieRepo.findByuser(user);
           List<MoiveDto> movieDto=findByMoive.stream().map(each ->this.modelMapper.map(each,MoiveDto.class)).collect(Collectors.toList());  
          
            
//            UserDto userDto=this.modelMapper.map(user,UserDto.class);
//            List<CinemalF> fill=this.cinemalFRepository.findByuser(user);
//             
//            List<CinemalFDto> film=fill.stream().map(each ->this.modelMapper.map(each,CinemalFDto.class)).collect(Collectors.toList());
//            film.stream().forEach(each ->{
//            	each.setUserDto(userDto);
//            });
//            film.stream().forEach(each ->{
//            System.out.println(each.getScreenDto().getId());
//            });
            return movieDto;
    }
}
