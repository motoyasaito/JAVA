package com.example.dockerapi.controller;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import com.example.dockerapi.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.example.dockerapi.service.UserService;

@ExtendWith(MockitoExtension.class)

public class HelloControllerTest {
  @Mock
  private UserService userService;

  @InjectMocks
  private HelloController helloController;

  @Test
  void testGet() {
    User user = new User(1, "Tanaka", "abcd@example.com");
    when(userService.getUserId(1)).thenReturn(user);
    User result = helloController.getUserId(1);
    assertEquals(user, result);
  }

  @Test
  void testPost() {
    User user = new User(3, "Shimada", "abcde@example.com");
    when(userService.postRegistration(user)).thenReturn(user);
    User result = helloController.postRegistration(user);
    assertEquals(user, result);
  }

  @Test
  void testPut() {
    User user = new User(1, "newTanaka", "abcd@example.com");
    when(userService.putUpdate(user, 1)).thenReturn(user);
    User result = helloController.putUpdate(user, 1);
    assertEquals(user, result);
  }

  @Test
  void testDelete() {
    String message = "削除しました";
    when(userService.deleteUser(1)).thenReturn(message);
    String result = helloController.deleteUser(1);
    assertEquals(message, result);
  }
}
