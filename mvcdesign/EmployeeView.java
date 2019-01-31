package mvcdesign;

public class EmployeeView {
	public void showEmployee(String empName,String empID,String empDesignation,double empSalary) {
		System.out.println("Employee Details");
		System.out.println("\tName : "+empName);
		System.out.println("\tID : "+empID);
		System.out.println("\tDesignation : "+empDesignation);
		System.out.println("\tSalary : "+empSalary);
	}
	public void showUpdatedSalary(double newSalary) {
		System.out.println("Updated Salary is " + newSalary);
	}

}
