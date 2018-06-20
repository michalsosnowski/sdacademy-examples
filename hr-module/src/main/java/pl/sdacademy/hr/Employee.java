package pl.sdacademy.hr;

 class Employee {

	private final String firstName;
	private final String lastName;
	private final String dateOfBirth;

	 Employee(String firstName, String lastName, String dateOfBirth) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;

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
		 return firstName + " "+lastName +", "+dateOfBirth;
	 }
 }
