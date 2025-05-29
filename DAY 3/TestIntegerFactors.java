import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
public class TestIntegerFactors{

	@Test
	public void TestThatFunctionExists(){
		IntegerFactors.factorOfNumber(20);
	}

	@Test
	public void TestThatFunctionTakesInInteger(){
		IntegerFactors.factorOfNumber(20);
	}

	@Test
	public void TestThatFunctionReturnsCorrectCount(){
		int actual = IntegerFactors.factorOfNumber(20);
		int expected = 6;
	assertEquals(actual , expected);
	}


}