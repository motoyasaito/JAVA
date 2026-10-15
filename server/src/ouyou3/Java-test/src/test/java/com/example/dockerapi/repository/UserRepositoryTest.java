package com.example.dockerapi.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.springframework.jdbc.core.RowMapper;
import com.example.dockerapi.model.User;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserRepositoryTest {
  @Mock
  private JdbcTemplate jdbcTemplate;
  @InjectMocks
  private UserRepository userRepository;

  @Test
  void getUserId() {
    User user = new User(1, "Tanaka", "abcd@example.com");
    when(jdbcTemplate.queryForObject(anyString(), any(RowMapper.class), eq(1))).thenReturn(user);
    User result = userRepository.getUserId(1);
    assertEquals(user, result);
  }

  @Test
  void testPost() {
    User user = new User(3, "Shimada", "abcde@example.com");
    User result = userRepository.postRegistration(user);
    assertEquals(user, result);
  }

  @Test
  void testPut() {
    User user = new User(3, "Shimada", "abcde@example.com");
    User result = userRepository.putUpdate(user, 1);
    assertEquals(user, result);
  }

  @Test
  void testDelete() {
    String message = "削除しました";
    String result = userRepository.deleteUser(1);
    assertEquals(message, result);
  }
}
