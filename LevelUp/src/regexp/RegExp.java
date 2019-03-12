package regexp;

//import java.util.regex.Pattern;
//import java.util.regex.Matcher;

public class RegExp {
	public static void main(String[] args) {
		System.out.println("The result is " + regexp());
	}

	public static boolean regexp() {
		String regex = "^/d(?:-/d{3}){3}/d$";
		String input = "(123)4567890";
//		Pattern pat = Pattern.compile(regex);
//		Matcher match = pat.matcher(input);
		boolean ret;
		if (input.matches(regex))
		/*if (match.matches()) */{
			System.out.println("true");
			ret = true;
		} else {
			System.out.println("false");
			ret = false;
		}
		return ret;
	}
}