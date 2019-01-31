package mvcdesign;

public class EmployeeService {

	public void updateSalaryService(EmployeeModel employeeModel, double incrementFactor) {
		employeeModel.setEmpSalary(employeeModel.getEmpSalary()*incrementFactor);
	}

}
