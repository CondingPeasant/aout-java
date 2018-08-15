public class LogAnalyzer {
	public boolean isValidFileName(String fileName) {
		if (fileName.toUpperCase().endsWith(".SLF")) {
			return true;
		}
		return false;
	}
}
