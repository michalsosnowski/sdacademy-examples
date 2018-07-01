package pl.sdacademy.hr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

class HrMenager {

	private final List<Employee> allEmployees = new ArrayList<>();
	private  static  final Path PATH =Paths.get("employees.txt");

	Employee create(String firstName, String lastName, String dateOfBirth)  {
		Employee employee = new Employee(firstName, lastName, dateOfBirth);
		allEmployees.add(employee);
		try {
			Files.write(PATH, allEmployees.stream().map(Employee::toString).collect
				(Collectors.toList()));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return employee;
	}

	/*Employee create(String firstName, String lastName, String dateOfBirth) {
		Employee employee = new Employee(firstName, lastName, dateOfBirth);
		allEmployees.add(employee);
		return employee;
	}*/

	List<Employee> findAll() {

		try {
			return Files.readAllLines(PATH).stream().map(line ->{
				String[] splitLine =line.split(" ");
				Employee employee=new Employee(splitLine[0],splitLine[1],splitLine[2]);
				return employee;
			})
				.collect(Collectors.toList());
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}

		}

	List<Employee> searchByLastName(String lastName) {

		return allEmployees.stream().filter(employee -> employee.getLastName().contains(lastName)).collect
			(Collectors.toList());
		// bierzemy wcześniej utworzoną listę allEmployee.otwieramy strem, czytaj ciąg wszystkiego z tej listy.
		// Wszystkich. Dając możliwość operowania na każdym elemencie.
		// filtrujemy tworząc lambdę. Tworzymy lokalnie zmienną employee typu Employee.
		// geterem wyciągamy wszystkich pracowników i sprawdzamy czy w ich lastName jest nasz lastName
		// po czym collect (zbieramy) w listę, a return ją zwraca.
	}

	public List<Employee> searchByPhrase(String phrase) {
		return allEmployees.stream().filter(employee -> employee.matches(phrase)).collect(Collectors.toList());
	}

	public List<Employee> sortByFirstName() {
		return allEmployees.stream().sorted().collect(Collectors.toList());
	}

	public List<Employee> sortByFirstNameWithBubble() {
		for (int j = 0; j < allEmployees.size() - 1; j++) {
			for (int i = 0; i < allEmployees.size()-j - 1; i++) {

				if (allEmployees.get(i).getFirstName().compareTo(allEmployees.get(i + 1).getFirstName
					()) < 0) {
					Employee temp = allEmployees.get(i);
					allEmployees.set(i, allEmployees.get(i + 1));
					allEmployees.set(i + 1, temp);
				}
			}
		}
		return allEmployees;

	}
	public List<Employee> sortByLastName() {
		/*return allEmployees.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors
			.toList()); */
		// return allEmployees.stream().sorted().collect(Collectors.toList());
		//QuickSort
		quickSort(allEmployees, 0, allEmployees.size() - 1);

		return allEmployees;
	}

	public List<Employee> quickSort(List<Employee> employees, int low, int high){
		if (low < high)
		{
			int pi = partition(employees, low, high);

			quickSort(employees, low, pi - 1);
			quickSort(employees, pi + 1, high);
		}
		return employees;
	}

	private int partition(List<Employee> employees, int low, int high) {
		Employee pivot = employees.get(high);
		int i = low - 1;
		for (int j = low; j <= high - 1; j++){
			if(employees.get(j).getLastName().compareTo(pivot.getLastName()) <= 0){
				i++;
				Employee temp = employees.get(j);
				employees.set(j, employees.get(i));
				employees.set(i, temp);
			}
		}
		Employee temp = employees.get(i + 1);
		employees.set(i + 1, employees.get(high));
		employees.set(high, temp);
		return i + 1;


}
	}

