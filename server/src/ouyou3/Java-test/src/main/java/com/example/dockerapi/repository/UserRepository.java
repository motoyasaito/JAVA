package com.example.dockerapi.repository;

import com.example.dockerapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public User getUserId(int id) {
    return jdbcTemplate.queryForObject(
        "SELECT * FROM users WHERE id = ?",
        (rs, rownum) -> new User(rs.getInt("id"), rs.getString("name"), rs.getString("email")),
        id);
  }

  public User postRegistration(User post) {
    jdbcTemplate.update("INSERT INTO users (id, name, email) VALUES (?, ?, ?)",
        post.id(), post.name(), post.email());
    return post;
  }

  public User putUpdate(User put, int id) {
    jdbcTemplate.update("UPDATE users SET name = ?, email = ? WHERE id = ?",
        put.name(), put.email(), id);
    return put;
  }

  public String deleteUser(int id) {
    jdbcTemplate.update("DELETE FROM users WHERE id = ?",
        id);
    return "削除しました";
  }
}
