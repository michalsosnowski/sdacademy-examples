package pl.sdacademy.hr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommendLineRunner {
	public static void load(String[] args, HrMenager hrMenager) {
		if (containsAllArguments(args)) {
			createEmployee(args, hrMenager);
		}
		else {
			throw new IllegalArgumentException("Podaj wyszystkir dane");
		}

	}

	private static void createEmployee(String[] args, HrMenager hrMenager) {
		hrMenager.create(extractArgument(args[0], "firstName"), extractArgument(args[1], "lastName"),
			extractArgument(args[2], "dateOfBirth"));
	}

	private static boolean containsAllArguments(String[] args) {
		return Stream.of(args).allMatch(arg -> arg.contains("firstName") || arg.contains("lastName") || arg
			.contains("dateOfBirth")) && args.length == 3;
	}

	private static String extractArgument(String argument, String argumentKey) {
		return argument.split(argumentKey + "=")[1];
	}

	public static List<String> list( HrMenager hrMenager) {
		return hrMenager.findAll().stream().map(Employee::toString).collect(Collectors.toList());



	}
}