import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(JUnitParamsRunner.class)
class LogAnalyzerTest {

	/*
	@Test
	void isValidFileName_BadExtention_ReturnFalse() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean result = analyzer.isValidFileName("fileWithBadExtention.foo");
		assertFalse(result);
	}
	
	@Test
	void isValidFileName_GoodExtentionLowerCase_ReturnTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean result = analyzer.isValidFileName("fileWithBadExtention.slf");
		assertTrue(result);
	}
	
	@Test 
	void isValidFileName_GoodExtentionUpperCase_ReturnTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean result = analyzer.isValidFileName("fileWithBadExtention.SLF");
		assertTrue(result);
	}
	*/

	/*
	@Parameters
	public static Object[][] data() {
		return new Object[][] {
			{"fileWithBadExtention.foo", false},
			{"fileWithGoodExtention.slf", true},
			{"fileWithGoodExtention.SLF", true}
		};
	}
	
	@Parameter(0)
	public String fileName;
	
	@Parameter(1)
	public boolean expectResult;
	*/
	@Test
	@Parameters({
		"fileWithBadExtention.foo, false",
		"fileWithGoodExtention.slf, true",
		"fileWithGoodExtention.SLF, true"})
	public void isValidFileNameString fileName, boolean expectResult() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean actualResult = analyzer.isValidFileName(fileName);
		assertEquals(expectResult, actualResult);
	}
	
}
