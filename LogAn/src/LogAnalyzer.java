public class LogAnalyzer {
	public boolean isValidFileName(String fileName) {
		if (fileName.endsWith(".SLF")) {
			return false;
		}
		return true;
	}
}
