package recursion;

public class Recursion {
	 static int i = 0;

	public static void main(String[] args) {
		recursion();
	}

	public static void recursion() {
		System.out.println(++i);
		if (i < 100) {
			recursion();
		}
	}

}
