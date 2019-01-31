package mvcdesign;

public class EmployeeController {
	private EmployeeModel employeeModel;
	private EmployeeView employeeView;
	public EmployeeController(EmployeeModel employeeModel, EmployeeView employeeView) {
		super();
		this.employeeModel = employeeModel;
		this.employeeView = employeeView;
	}
	public void updateSalary(double incrementFactor) {
		EmployeeService empService = new EmployeeService();
		empService.updateSalaryService(employeeModel,incrementFactor);
	}
	public EmployeeModel getEmployeeModel() {
		return employeeModel;
	}
	public void setEmployeeModel(EmployeeModel employeeModel) {
		this.employeeModel = employeeModel;
	}
	public EmployeeView getEmployeeView() {
		return employeeView;
	}
	public void setEmployeeView(EmployeeView employeeView) {
		this.employeeView = employeeView;
	}
	public void showView() {
		employeeView.showEmployee(employeeModel.getEmpName(),employeeModel.getEmpID(), employeeModel.getEmpDesignation(), employeeModel.getEmpSalary());// TODO Auto-generated method stub
	}
	public void showUpdate() {
		employeeView.showUpdatedSalary(employeeModel.getEmpSalary());// TODO Auto-generated method stub
		
	}
	

}
