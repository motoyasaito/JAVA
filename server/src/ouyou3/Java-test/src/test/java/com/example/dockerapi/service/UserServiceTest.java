package com.example.dockerapi.service;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import com.example.dockerapi.model.User;
import com.example.dockerapi.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class UserServiceTest {
  @Mock
  private UserRepository userRepository;
  @InjectMocks
  private UserService userService;

  @Test
  void testGet() {
    User user = new User(1, "Tanaka", "abcd@example.com");
    when(userRepository.getUserId(1)).thenReturn(user);
    User result = userService.getUserId(1);
    assertEquals(user, result);
  }

  @Test
  void testPost() {
    User user = new User(3, "Shimada", "abcde@example.com");
    when(userRepository.postRegistration(user)).thenReturn(user);
    User result = userService.postRegistration(user);
    assertEquals(user, result);
  }

  @Test
  void testPut() {
    User user = new User(1, "newTanaka", "abcd@example.com");
    when(userRepository.putUpdate(user, 1)).thenReturn(user);
    User result = userService.putUpdate(user, 1);
    assertEquals(user, result);
  }

  @Test
  void testDelete() {
    String message = "削除しました";
    when(userRepository.deleteUser(1)).thenReturn(message);
    String result = userService.deleteUser(1);
    assertEquals(message, result);
  }
}
