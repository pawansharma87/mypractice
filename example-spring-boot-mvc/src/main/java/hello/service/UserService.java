package hello.service;

import hello.domain.User;

import java.util.List; 

public interface UserService {

    User save(User user);

    List<User> getList();

}
