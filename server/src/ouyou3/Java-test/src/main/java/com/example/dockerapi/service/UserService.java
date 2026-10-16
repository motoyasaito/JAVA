package com.example.dockerapi.service;

import com.example.dockerapi.model.User;
import org.springframework.stereotype.Service;
import com.example.dockerapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User getUserId(int id) {
    return userRepository.getUserId(id);
  }

  public User postRegistration(User post) {
    return userRepository.postRegistration(post);
  }

  public User putUpdate(User put, int id) {
    return userRepository.putUpdate(put, id);
  }

  public String deleteUser(int id) {
    return userRepository.deleteUser(id);
  }

}
