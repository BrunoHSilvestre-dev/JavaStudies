package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Employee;

public class ArraysSource {
	public static void execute() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer employeeAmount = sc.nextInt();
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		for (int i = 0; i < employeeAmount; i++) {
			Integer id = i + 1;
			String name = sc.nextLine();
			Double salary = sc.nextDouble();
			
			employeeList.add(new Employee(id, name, salary));
		}
		
		sc.close();
	}
}
