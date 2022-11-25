package com.moving.Boking.Repository;
import com.moving.Boking.Model.Moive;
import com.moving.Boking.Model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRespositry extends JpaRepository<Moive,Integer> {
	

public  List<Moive>findByuser(User user);
}
