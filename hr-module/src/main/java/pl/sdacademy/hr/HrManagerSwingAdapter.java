package pl.sdacademy.hr;
import java.util.List;


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
	public void clearFilters(DefaultTableModel tableModel){
		tableModel.getDataVector().clear();
		List<Employee> allEmployees = hrMenager.findAll();
		fillAllRows(tableModel, allEmployees);
	}


	public void sortByFirstName(DefaultTableModel tableModel) {
		tableModel.getDataVector().clear();
		List<Employee> allEmployees = hrMenager.sortByFirstName();
		fillAllRows(tableModel, allEmployees);
	}

	public void sortByLastName(DefaultTableModel tableModel) {
		tableModel.getDataVector().clear();
		List<Employee> allEmployees = hrMenager.sortByLastName();
		fillAllRows(tableModel, allEmployees);
	}
	public  void fillAllRows(DefaultTableModel tableModel, List<Employee> allEmployees){
		for (Employee employee : allEmployees){
			tableModel.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee
				.getDateOfBirth()});
		}
	}
}
