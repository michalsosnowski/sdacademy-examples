package pl.sdacademy.hr;

class Employee implements Comparable<Employee> {

	private final String firstName;
	private final String lastName;
	private final String dateOfBirth;

	Employee(String firstName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;

	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	String getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", " + dateOfBirth;
	}

	boolean matches(String phrase) {
		return firstName.contains(phrase) || lastName.contains(phrase) || dateOfBirth.contains
			(phrase);
	}

	@Override
	public int compareTo(Employee other) {
		return firstName.compareTo(other.firstName);
	}
}
