package com.user.service;

import com.user.entity.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
//fake user list
  List<User> list= List.of(
      new User(1311L,"Durgesh","4672666"),
    new User(1312L,"Ankita","7994566"),
    new User(1313L,"Aman","12345678")
);
  @Override
  public User getUser(Long id) {
    return list.stream().filter(e->e.getUserId().equals(id)).findAny().orElse(null);
  }
}
