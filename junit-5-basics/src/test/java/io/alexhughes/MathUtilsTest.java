package io.alexhughes;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;


@DisplayName("From MathUtils class")
class MathUtilsTest {
	private MathUtils mathUtils;

	@BeforeAll
	static void beforeAll() {
		System.out.print("This is outputted before instances initalized.");
	}

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@Test
	@DisplayName("Divides 2 numbers")
	void divide() {
		assumeTrue(false);
		assertEquals(25, mathUtils.div(5, 5), () -> "the div method should divide two numbers");
	}
	
	@Test
	@DisplayName("Divides a number by 0")
	void divideByZero() {
		assertThrows(ArithmeticException.class, () -> mathUtils.div(6, 0), () -> "the div method divides two numbers");
	}

	@Nested
	class AddTest {
		@Test
		@DisplayName("Testing a method for +")
		void addPositiveTest() {
			assertEquals(2, mathUtils.add(1, 1), () -> "the add method should add two numbers.");
		}

		@Test
		@DisplayName("Test a method for -")
		void addNegativeTest() {
			assertEquals(-2, mathUtils.add(-1, -1), () -> "the add method should add two numbers.");
		}
	}

	@Tag("test")
	@RepeatedTest(3)
	@DisplayName("Testing a method to multiply two numbers")
	void multiply() {
		assertAll(() -> assertEquals(6, mathUtils.mult(2, 3), () -> "the mult method should multiply two numbers."),
				() -> assertEquals(25, mathUtils.mult(5, 5), () -> "the mult method should multiply two numbers."),
				() -> assertEquals(81, mathUtils.mult(9, 9), () -> "the mult method should multiply two numbers."));
	}
}
