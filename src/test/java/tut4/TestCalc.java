package tut4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalc {
	@Test
	public void testAdd(){
		int A = 5;
		int B = 5;
		int answer = A + B;
		assertEquals(Calc.Add(A,B), answer);
	}
	@Test
	public void testSubtract(){
		int A = 5;
		int B = 5;
		int answer = A - B;
		assertEquals(Calc.Subtract(A,B), answer);
	}
}