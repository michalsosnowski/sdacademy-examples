package pl.sdacademy.hr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CommendLineRunnerTest {
	@DisplayName("should reject input data when only first name is not given")
	@Test
	void test00(){
		//given
		HrMenager hrMenager =new HrMenager();

		String args[]={"lastName=Kowalski","dateOfBirth=11-04-1258","nothing"};

		//when
		//przekazujemy funkcje, ktora bedzie wywolana pozniej
		assertThatThrownBy(() -> CommendLineRunner.load(args, hrMenager))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}
	@DisplayName("should check if first name, lastname and date of birth is given then database isn't empty")
	@Test
	void test01(){
		//given
		HrMenager hrMenager =new HrMenager();
		String args[]={"firstName=Adam","lastName=Kowalski","dateOfBirth=11-04-1258"};

		//when
		CommendLineRunner.load(args, hrMenager);

		//then
		assertThat(hrMenager.findAll()).isNotEmpty();
	}
	@DisplayName("should reject input data when only last name is not given")
	@Test
	void test02(){
		//given
		HrMenager hrMenager =new HrMenager();

		String args[]={"firstName=Adam","dateOfBirth=11-04-1258","nothing"};

		//when
		//przekazujemy funkcje, ktora bedzie wywolana pozniej
		assertThatThrownBy(() -> CommendLineRunner.load(args, hrMenager))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}
	@DisplayName("should reject input data when only date of birth is not given")
	@Test
	void test03(){
		//given
		HrMenager hrMenager =new HrMenager();

		String args[]={"firstName=Adam","lastName=Kowalski","nothing"};

		//when
		//przekazujemy funkcje, ktora bedzie wywolana pozniej
		assertThatThrownBy(() -> CommendLineRunner.load(args, hrMenager))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}
	@DisplayName("should check if first name, lastname and date of birth isn't empty than database contains " +
		"simple employee with the same properties")
	@Test
	void test04(){
		//given
		HrMenager hrMenager =new HrMenager();
		String args[]={"firstName=Adam","lastName=Kowalski","dateOfBirth=11-04-1258"};

		//when
		CommendLineRunner.load(args, hrMenager);

		//then
		Employee employee=hrMenager.findAll().get(0);
		assertThat(employee.getFirstName()).isEqualTo("Adam");
		assertThat(employee.getLastName()).isEqualTo("Kowalski");
		assertThat(employee.getDateOfBirth()).isEqualTo("11-04-1258");
	}
	@DisplayName("Should return list of text representation of all Employees from database")
	@Test
	void test05(){
	//given
		HrMenager hrMenager =new HrMenager();
	String args[]={"firstName=Adam","lastName=Kowalski","dateOfBirth=11-04-1258"};
	CommendLineRunner.load(args,hrMenager);

	//when
		List<String> allEmployees = CommendLineRunner.list( hrMenager);

	//then
	assertThat(allEmployees).containsOnly("Adam Kowalski, 11-04-1258");

}
}
