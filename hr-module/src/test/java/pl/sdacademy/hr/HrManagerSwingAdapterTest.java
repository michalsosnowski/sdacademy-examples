package pl.sdacademy.hr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.table.DefaultTableModel;

import static org.assertj.core.api.Assertions.*;

public class HrManagerSwingAdapterTest {
	@DisplayName("Should add to table model new row matching employee by HrManager given Adam Mialczynski, " +
		"11-12-1934")
	@Test
	void test00(){
		//given
		// create empty table model
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of Birth");
		HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeHrManager());

		//when
		adapter.addNewEmployee(tableModel, "Adam",
			"Mialczynski", "11-12-1934");
		//then
		assertThat(tableModel.getValueAt(0,0)).isEqualTo("Zoltan");
		assertThat(tableModel.getValueAt(0,1)).isEqualTo("Michnik");
		assertThat(tableModel.getValueAt(0,2)).isEqualTo("11-01-1002");
	}

	private HrMenager fakeHrManager() {
		return new HrMenager(){
			@Override
			Employee create(String firstName, String lastName, String dateOfBirth) {
				if(firstName.equals("Adam")&&lastName.equals("Mialczynski")&&dateOfBirth.equals
					("11-12-1934"))
				return new Employee("Zoltan", "Michnik", "11-01-1002");
				throw new IllegalArgumentException("Bad Arguments");
			}
		};


	}
}
