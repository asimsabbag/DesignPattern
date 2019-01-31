package mvcdesign;

public class Main {
    private static EmployeeModel getEmployee() {
    	EmployeeModel employee = new EmployeeModel();
    	employee.setEmpName("Jon Snow");
    	employee.setEmpID("007");
    	employee.setEmpDesignation("Wardan of the North");
    	employee.setEmpSalary(677678);
    	return employee;
    }
	public static void main(String[] args) {
		EmployeeModel employee = getEmployee();
		EmployeeView empview = new EmployeeView();
		EmployeeController econtrol = new EmployeeController(employee, empview);
		econtrol.showView();
		econtrol.updateSalary(1.1);
		econtrol.showUpdate();

	}

}
