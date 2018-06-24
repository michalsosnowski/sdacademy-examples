package pl.sdacademy.hr;

import javax.swing.table.DefaultTableModel;

public class HrManagerSwingAdapter {
	HrMenager hrMenager;

	public HrManagerSwingAdapter(HrMenager hrMenager) {
		this.hrMenager = hrMenager;
	}

	void addNewEmployee(DefaultTableModel tableModel, String firstName, String lastName, String
		  dateOfBirth) {
		Employee newEmployee = hrMenager.create(firstName,lastName,dateOfBirth);
		tableModel.addRow(new Object[]{newEmployee.getFirstName(),newEmployee.getLastName(),newEmployee.getDateOfBirth()});

	}
}
