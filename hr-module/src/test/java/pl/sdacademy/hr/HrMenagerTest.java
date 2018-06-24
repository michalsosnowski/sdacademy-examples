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
	@DisplayName("should check database contains all employees")
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
	@DisplayName("should find every employees with given last name")
	@Test
	void test03(){
		//given
		Employee adam =  hrMenager.create("Jacek", "Plackowski", "14-10-1950");
		Employee gorge =  hrMenager.create("Gorge", "Nowak", "17-04-1933");
		Employee john =  hrMenager.create("John", "Nowak", "11-04-1963");

		//when
		List<Employee> foundEmployees = hrMenager.searchByLastName("Nowak");

		//then
		assertThat(foundEmployees).containsOnly(gorge,john);

	}
	@DisplayName("Should find no employee when there is no employee with given last name")
	@Test
	void test04(){
		//given
		Employee adam =  hrMenager.create("Jacek", "Plackowski", "14-10-1950");
		Employee gorge =  hrMenager.create("Gorge", "Nowak", "17-04-1933");
		Employee john =  hrMenager.create("John", "Nowak", "11-04-1963");

		//when
		List<Employee> foundEmployees = hrMenager.searchByLastName("Kszmierski");

		//then
		assertThat(foundEmployees).isEmpty();

	}
	@DisplayName("Should two employee when their first name matches given search phrase" )
	@Test
	void test05(){
		//given
		Employee adam =  hrMenager.create("Jacek", "Plackowski", "14-10-1950");
		Employee gorge =  hrMenager.create("Jacek", "Nowak", "17-04-1933");
		Employee john =  hrMenager.create("John", "Nowak", "11-04-1963");

		//when
		List<Employee> foundEmployees = hrMenager.searchByPhrase("Jacek");

		//then
		assertThat(foundEmployees).containsOnly(adam,gorge);

	}
	@DisplayName("Should two employee when their last name matches given search phrase" )
	@Test
	void test06(){
		//given
		Employee adam =  hrMenager.create("Jacek", "Plackowski", "14-10-1950");
		Employee gorge =  hrMenager.create("Jacek", "Nowak", "17-04-1933");
		Employee john =  hrMenager.create("John", "Nowak", "11-04-1963");

		//when
		List<Employee> foundEmployees = hrMenager.searchByPhrase("Nowak");

		//then
		assertThat(foundEmployees).containsOnly(john,gorge);

	}@DisplayName("Should two employee when their date of birth matches given search phrase" )
	@Test
	void test07(){
		//given
		Employee adam =  hrMenager.create("Jacek", "Plackowski", "11-04-1963");
		Employee gorge =  hrMenager.create("Jacek", "Nowak", "17-04-1933");
		Employee john =  hrMenager.create("John", "Nowak", "11-04-1963");

		//when
		List<Employee> foundEmployees = hrMenager.searchByPhrase("11-04-1963");

		//then
		assertThat(foundEmployees).containsOnly(john,adam);

	}@DisplayName("Should sort by first name ascending " )
	@Test
	void test08(){
		//given
		Employee gorge =  hrMenager.create("Gorge", "Nowak", "17-04-1933");
		Employee adam =  hrMenager.create("Adam", "Plackowski", "11-04-1963");
		Employee john =  hrMenager.create("John", "Nowak", "11-04-1963");

		//when
		List<Employee> sortedEmployees = hrMenager.sortByFirstName();

		//then
		assertThat(sortedEmployees).containsSequence(adam,gorge,john);

	}


}