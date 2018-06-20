package pl.sdacademy.hr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HrMenagerTest {
 private HrMenager hrMenager;
 @BeforeEach
 void setup(){
	 hrMenager =new HrMenager();
 }

	@DisplayName("should create non-null employee when given first name, surname and date of birth")
	@Test
	void checkNewUser(){
		//given
		String firstName="Jacek";
		String lastName="Plackowski";
		String dateOfBirth="14-10-1950";

		//when
		Employee employee =  hrMenager.create(firstName, lastName, dateOfBirth);

		//then
		assertThat(employee).isNotNull();

	}

	@DisplayName("should create new employee with all fields: first name, surname and date of birth")
	@Test
	void checkUser(){
		//given
		String firstName="Jacek";
		String lastName="Plackowski";
		String dateOfBirth="14-10-1950";

		//when
		Employee employee =  hrMenager.create(firstName, lastName, dateOfBirth);

		//then
		assertThat(employee.getFirstName()).isEqualTo(firstName);
		assertThat(employee.getLastName()).isEqualTo(lastName);
		assertThat(employee.getDateOfBirth()).isEqualTo(dateOfBirth);


	}
	@DisplayName("should check if new Employee is added to the database")
	@Test
	void saveUser(){
		//given
		String firstName="Jacek";
		String lastName="Plackowski";
		String dateOfBirth="14-10-1950";
		Employee newEmployee =  hrMenager.create(firstName, lastName, dateOfBirth);
		//when
		List<Employee> allEmployees = hrMenager.findAll();

		//then
		assertThat(allEmployees).containsOnly(newEmployee);

	}
	@DisplayName("should check database contains two all employees")
	@Test
	void findUser(){
		//given
		Employee adam =  hrMenager.create("Jacek", "Plackowski", "14-10-1950");
		Employee gorge =  hrMenager.create("Gorge", "Nowak", "17-04-1933");

		//when
		List<Employee> allEmployees = hrMenager.findAll();

		//then
		assertThat(allEmployees).containsOnly(adam,gorge);

	}


}