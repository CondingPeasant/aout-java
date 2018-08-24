import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class LogAnalyzerTest {

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
	
	@Test
	public void isValidFileName() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean actualResult = analyzer.isValidFileName(fileName);
		assertEquals(expectResult, actualResult);
	}
	
}
