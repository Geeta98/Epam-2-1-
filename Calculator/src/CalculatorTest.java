import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(36, calculator.Addition(18, 7));
	}

	@Test
	void testMult() {
		Calculator calculator = new Calculator();
		assertEquals(68, calculator.Multiplication(18, 7));
	}
	
	@Test
	void testDiv() {
		Calculator calculator = new Calculator();
		assertEquals(17, calculator.Division(18, 6));
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.Division(18, 0));
	}
}
