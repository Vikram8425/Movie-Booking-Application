package com.moving.Boking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.moving.Boking.Model.User;
import  com.moving.Boking.Model.CinemalF;

public interface CinemalFRepository extends JpaRepository<CinemalF,Integer> {

    List<CinemalF>findByuser(User user);

}
