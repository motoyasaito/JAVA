package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyInt;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;

public class UserFunctionsTest {
  UserFunctions userFunctions;
  ScoreValidator mockedScoreValidator;

  @BeforeEach
  void testBefore() {
    userFunctions = new UserFunctions();
    userFunctions.setName("TestUser");
    userFunctions.setAge(19);
    userFunctions.setGender("MALE");
    userFunctions.setFitnessScore(60);
    mockedScoreValidator = mock(ScoreValidator.class);
    when(mockedScoreValidator.validate(anyInt())).thenReturn(true);
    when(mockedScoreValidator.validate(0)).thenReturn(false);
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

  @Test
  void testMethodCompletesInTime() {
    assertTimeout(Duration.ofMillis(1), () -> {
      userFunctions.add(1, 3);
    });
  }

  @Test
  void division0Test() {
    ArithmeticException exceptionClass = assertThrows(ArithmeticException.class, () -> {
      userFunctions.divide(100, 0);
    });
    assertEquals("/ by zero", exceptionClass.getMessage());
  }

  // 最終応用練習問題
  @Test
  void check50TrueTest() {
    assertTrue(userFunctions.checkAndPass(50, mockedScoreValidator));
  }

  @Test
  void check49FalseTest() {
    assertFalse(userFunctions.checkAndPass(49, mockedScoreValidator));
  }

  @Test
  void check0FalseTest() {
    assertFalse(userFunctions.checkAndPass(0, mockedScoreValidator));
  }

  @Test
  void testCaseC1() {
    userFunctions.checkAndPass(60, mockedScoreValidator);
    verify(mockedScoreValidator).validate(60);
  }

  @Test
  void getterCheckTest() {
    assertEquals("TestUser", userFunctions.getName());
    assertEquals(19, userFunctions.getAge());
    assertEquals("MALE", userFunctions.getGender());
    assertEquals(60, userFunctions.getFitnessScore());
  }

  @Test
  void divideNormalCheckTest() {
    assertEquals(10, userFunctions.divide(20, 2));
  }

  @Test
  void male20FalseTest() {
    userFunctions.setAge(20);
    userFunctions.setFitnessScore(59);
    userFunctions.setGender("MALE");
    assertFalse(userFunctions.isFitnessTestPassed());
  }

  @Test
  void female20TrueTest() {
    userFunctions.setAge(20);
    userFunctions.setFitnessScore(55);
    userFunctions.setGender("FEMALE");
    assertTrue(userFunctions.isFitnessTestPassed());
  }

  @Test
  void under19TrueTest() {
    userFunctions.setAge(19);
    userFunctions.setFitnessScore(80);
    assertTrue(userFunctions.isFitnessTestPassed());
  }

  @Test
  void genderOtherFalseTest() {
    userFunctions.setAge(20);
    userFunctions.setFitnessScore(100);
    userFunctions.setGender("OTHER");
    assertFalse(userFunctions.isFitnessTestPassed());
  }

  @Test
  void noGenderFalseTest() {
    userFunctions.setAge(20);
    userFunctions.setFitnessScore(100);
    userFunctions.setGender(null);
    assertFalse(userFunctions.isFitnessTestPassed());
  }

  @Test
  void male70TrueTest() {
    userFunctions.setAge(20);
    userFunctions.setFitnessScore(70);
    userFunctions.setGender("MALE");
    assertTrue(userFunctions.isFitnessTestPassed());
  }

  @Test
  void male70FalseTest() {
    userFunctions.setAge(19);
    userFunctions.setFitnessScore(70);
    userFunctions.setGender("MALE");
    assertFalse(userFunctions.isFitnessTestPassed());
  }

  @AfterEach
  void testAfter() {
    userFunctions = null;
  }
}
