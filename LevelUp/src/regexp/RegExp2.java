package regexp;

import java.util.regex.Pattern;

//import java.util.regex.Pattern;
//import java.util.regex.Matcher;

public class RegExp2 {
	public static void main(String[] args) {

		Pattern p = Pattern.compile("(?:\\(\\d{3}\\)|\\d{3}[-]*)\\d{3}[-]*\\d{4}");
		for (String str : testStrings) {
			if (p.matcher(str).matches()) {
				System.out.printf("%s is valid%n", str);
			} else {
				System.out.printf("%s is not valid%n", str);
			}
		}
	}

	static String[] testStrings = {
			/* Following are valid phone number examples */
			"(123)4567890", "1234567890", "123-456-7890", "(123)456-7890",
			/* Following are invalid phone numbers */
			"(1234567890)", "123)4567890", "12345678901", "(1)234567890", "(123)-4567890", "1", "12-3456-7890",
			"123-4567", "Hello world" };
}
