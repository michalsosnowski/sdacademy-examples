package pl.sdacademy.hr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.table.DefaultTableModel;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HrManagerSwingAdapterTest {
	@DisplayName("Should add to empty table model new row matching employee by HrManager given Adam Mialczynski")
	@Test
	void test00(){
		//given
		// create empty table model
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of Birth");
		HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeCreatorHrManager());

		//when
		adapter.addNewEmployee(tableModel, "Adam",
			"Mialczynski", "11-12-1934");
		//then
		assertThat(tableModel.getValueAt(0,0)).isEqualTo("Zoltan");
		assertThat(tableModel.getValueAt(0,1)).isEqualTo("Michnik");
		assertThat(tableModel.getValueAt(0,2)).isEqualTo("11-01-1002");
	}

	private HrMenager fakeCreatorHrManager() {
		return new HrMenager() {
			@Override
			Employee create(String firstName, String lastName, String dateOfBirth) {
				if (firstName.equals("Adam") && lastName.equals("Mialczynski") && dateOfBirth.equals("11-12-1934"))

					return new Employee("Zoltan", "Michnik", "11-01-1002");
				throw new IllegalArgumentException("Bad Arguments");
			}
		};
	}
		@DisplayName("should add two rows to empty table model matching sorted HrManager data ")
		@Test
		void test02(){
			//given
			// create empty table model
			DefaultTableModel tableModel = new DefaultTableModel();
			tableModel.addColumn("First Name");
			tableModel.addColumn("Last Name");
			tableModel.addColumn("Date of Birth");
			HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeSortHrManager());
			//when
			adapter.sortByLastName(tableModel);
			//then
			//row 0
			Object firstNameFromTableModel = tableModel.getValueAt(0, 0);
			assertThat(firstNameFromTableModel).isEqualTo("Tomek");
			Object lastNameFromTableModel = tableModel.getValueAt(0, 1);
			assertThat(lastNameFromTableModel).isEqualTo("Tomczuk");
			Object dateOfBirth = tableModel.getValueAt(0, 2);
			assertThat(dateOfBirth).isEqualTo("09-09-1999");
			// row1
			Object firstNameFromTableMode2 = tableModel.getValueAt(1, 0);
			assertThat(firstNameFromTableMode2).isEqualTo("Igor");
			Object lastNameFromTableMode2 = tableModel.getValueAt(1, 1);
			assertThat(lastNameFromTableMode2).isEqualTo("Nowak");
			Object dateOfBirth2 = tableModel.getValueAt(1, 2);
			assertThat(dateOfBirth2).isEqualTo("08-08-1899");
		}



		@DisplayName("zakladajac ze table model nie jest pusty, powinien zostac zastapiony table modelem zwroconym " +
			"przez metode sort z HrManagera")
		@Test
		void test03 (){
			//given
			// create empty table model
			DefaultTableModel tableModel = new DefaultTableModel();
			tableModel.addColumn("First Name");
			tableModel.addColumn("Last Name");
			tableModel.addColumn("Date of Birth");
			tableModel.addRow(new Object[]{"George", "Martin", "11-01-2010"});
			HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeSortHrManager());
			//when
			adapter.sortByLastName(tableModel);
			//then
			//row 0
			Object firstNameFromTableModel = tableModel.getValueAt(0, 0);
			assertThat(firstNameFromTableModel).isEqualTo("Tomek");
			Object lastNameFromTableModel = tableModel.getValueAt(0, 1);
			assertThat(lastNameFromTableModel).isEqualTo("Tomczuk");
			Object dateOfBirth = tableModel.getValueAt(0, 2);
			assertThat(dateOfBirth).isEqualTo("09-09-1999");
			// row1
			Object firstNameFromTableMode2 = tableModel.getValueAt(1, 0);
			assertThat(firstNameFromTableMode2).isEqualTo("Igor");
			Object lastNameFromTableMode2 = tableModel.getValueAt(1, 1);
			assertThat(lastNameFromTableMode2).isEqualTo("Nowak");
			Object dateOfBirth2 = tableModel.getValueAt(1, 2);
			assertThat(dateOfBirth2).isEqualTo("08-08-1899");
		}

	private HrMenager fakeSortHrManager() {
		return new HrMenager() {
			@Override
			public List<Employee> sortByLastName() {
				return Arrays.asList(new Employee("Tomek","Tomczuk","09-09-1999"),
					new Employee("Igor","Nowak","08-08-1899"));

			}
		};


	}

}
