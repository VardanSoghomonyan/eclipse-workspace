public class RegistrationForm {
	
	private String firstName;
	private String lastName;
	private String passportID;
	private String email;
	private int dateOfBirth;
	private boolean isMale;
	
	public RegistrationForm setFirstName (String firstName) {
		this.firstName=firstName;
		return this;
	}
	public RegistrationForm setLastName (String lastName) {
		this.lastName=lastName;
		return this;
	}
	public RegistrationForm setPassportID (String passportID) {
		this.passportID = passportID;
		return this;
	}
	public RegistrationForm setEmail(String email) {
		this.email=email;
		return this;
	}
	public RegistrationForm setDateOfBirth (int dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
		return this;
	}
	public RegistrationForm setIsMale (boolean isMale) {
		this.isMale=isMale;
		return this;
	}
}
