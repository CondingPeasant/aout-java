import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogAnalyzerTest {

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

}
