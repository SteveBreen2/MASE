package agileDesignAndTesting;

public class NameValidator {
	public static boolean isValid(String s) {
		if (s.length() < 21 && s.length() > 2) {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}