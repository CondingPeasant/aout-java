import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class LogAnalyzerTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"fileWithBadExtention.foo", false},
			{"fileWithGoodExtention.slf", true},
			{"fileWithGoodExtention.SLF", true}
		});
	}
	
	private String fileName;
	
	private boolean expectResult;
	
	public LogAnalyzerTest(String fileName, boolean expectResult) {
		this.fileName = fileName;
		this.expectResult = expectResult;
	}
	
	@Test
	public void isValidFileName() {
		LogAnalyzer analyzer = new LogAnalyzer();
		boolean actualResult = analyzer.isValidFileName(fileName);
		assertEquals(expectResult, actualResult);
	}
	
}
