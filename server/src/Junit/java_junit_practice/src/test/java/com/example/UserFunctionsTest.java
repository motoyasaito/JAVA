package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;

public class UserFunctionsTest {
  UserFunctions userFunctions;

  @BeforeEach
  void testBefore() {
    userFunctions = new UserFunctions();
    userFunctions.setName("TestUser");
  }

  @Test
  void male20PassingTest() {
    userFunctions.setAge(20);
    userFunctions.setFitnessScore(60);
    userFunctions.setGender("MALE");
    assertTrue(userFunctions.isFitnessTestPassed());
  }

  @Test
  void under19FailedTest() {
    userFunctions.setAge(19);
    userFunctions.setFitnessScore(79);
    assertFalse(userFunctions.isFitnessTestPassed());
  }

  @Test
  void female20FailedTest() {
    userFunctions.setAge(20);
    userFunctions.setGender("FEMALE");
    userFunctions.setFitnessScore(54);
    assertFalse(userFunctions.isFitnessTestPassed());
  }

  @AfterEach
  void testAfter() {
    userFunctions = null;
  }
}
