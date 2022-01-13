package basics;

public class Employee {
	private String dateOfBirth;


	private String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		String age = dateOfBirth + "";
		return 18;
	}

}
