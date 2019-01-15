package levelUpFirst;

public class First {
	public static void main(String[] args) {
		String a = "barlus";
		System.out.println(a);
		printInputWord("jamanak");
		System.out.println(joinStrings ("barlus","ashxarh"));


	}
	public static void printInputWord (String input) {
//		input = "print  word";
		System.out.println(input);
	}
	public static String joinStrings (String s1, String s2) {
		String total = s1+' '+s2;
		return total;
	}

}
