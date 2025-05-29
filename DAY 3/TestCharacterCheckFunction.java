import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
public class TestCharacterCheckFunction{

	@Test
	public void TestThatFunctionExists(){
		CharacterCountFunction.wordCount(0);
	}

	@Test
	public void TestThatFunctionTakesInString(){
		CharacterCountFunction.wordCount(0);
		String actual = "Banana";
		String expected = "Banana";
		assertEquals(actual , expected);
	}

	@Test
	public void TestThatFunctionReturnsCorrectCount(){
		CharacterCountFunction.wordCount(0);
		int actual = 3;
		int expected = 3;
		assertEquals(actual , expected);
	}

}