package com.bridgelabz.EmployeePayRoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRoll_Service {

	public enum IOService{CONSOLE_TO, FILE_TO, DB_TO, REST_TO}
	private List<EmployeeData> employeePayRollList;
	
	public EmployeePayRoll_Service() {
		
	}

	public EmployeePayRoll_Service(List<EmployeeData> employeePayRollList) {
		super();
		this.employeePayRollList = employeePayRollList;
	}
	
	public static void main(String[] args) {
	
		ArrayList<EmployeeData> employeePayrollList = new ArrayList<>();
		EmployeePayRoll_Service employeePayRoll_Service = new EmployeePayRoll_Service(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRoll_Service.readEmployeeData(consoleInputReader);
		employeePayRoll_Service.writeEmployeeData();
	}

	private void writeEmployeeData() {
		
		System.out.println("\nWriting Employee Payroll Roaster to console\n"+ employeePayRollList);
		
	}

	private void readEmployeeData(Scanner consoleInputReader) {
		
		System.out.println("Enter Employee ID:");
		int id=consoleInputReader.nextInt();
		System.out.println("Enter Employee Name:");
		String name=consoleInputReader.next();
		System.out.println("Enter Employee Salary");
		double salary=consoleInputReader.nextDouble();
		employeePayRollList.add(new EmployeeData(id, name, salary));
		
	}

}
