package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PricingServiceTest {
  PricingService pricingService;

  @BeforeEach
  void setUp() {
    pricingService = new PricingService();
  }

  @Test
  @Tag("Guard_Boundary")
  void discountRateBelowMinTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      pricingService.calculateDiscount(100, -1);
    });
  }

  @Test
  @Tag("Guard_Boundary")
  void discountRateAboveMaxTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      pricingService.calculateDiscount(100, 101);
    });
  }

  static Stream<Arguments> boundaryValue() {
    return Stream.of(
        Arguments.of(1000, 0, 0),
        Arguments.of(1000, 100, 1000),
        Arguments.of(999, 10, 99));
  }

  @ParameterizedTest
  @MethodSource("boundaryValue")
  @Tag("Calculation_Full")
  void discountRateTest(int originPrice, int discountRate, int discountAmount) {
    assertEquals(discountAmount, pricingService.calculateDiscount(originPrice, discountRate));
  }
}
