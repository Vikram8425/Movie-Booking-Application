package com.moving.Boking.Service;
import com.moving.Boking.Model.CinemalF;
import com.moving.Boking.Model.User;

import com.moving.Boking.Payload.UserDto;
import java.util.*;
import com.moving.Boking.Payload.CinemalFDto;
import com.moving.Boking.Payload.MoiveDto;
import com.moving.Boking.Payload.MovieDto;
public interface MovieService {

   public List<MoiveDto> viewall(String email);
}
