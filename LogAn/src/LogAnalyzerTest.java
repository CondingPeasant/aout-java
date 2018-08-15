import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogAnalyzerTest {

	@Test
	void isValidFileName_BacExtention_ReturnFalse() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean result = analyzer.isValidFileName("fileWithBadExtention.foo");
		assertFalse(result);
	}

}
