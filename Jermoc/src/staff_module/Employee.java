package staff_module;

public class Employee {
	final int id;
	String firstName;
	String lastName;
	boolean isMale;
	private int birthYear;
	String profession;

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String firstName, String lastName, boolean isMale, int birthYear, String profession) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isMale = isMale;
		setBirthYear(birthYear);
		this.profession = profession;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		if (birthYear > 1919) {
			this.birthYear = birthYear;
		} else {
			System.out.println("You have entered incorrect BirthYear, please enter right one");
		}
	}
}
