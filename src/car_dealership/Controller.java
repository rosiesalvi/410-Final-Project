package car_dealership;

public class Controller {
	
	Database d = new Database();
	GUID guid = new GUID();
	
	public void insertDepartment(Department dept){
		int deptId = guid.generateId();
		dept.setId(deptId);
		d.insertNewDepartment(dept);
	}
	
	public void insertEmployee(Employee employee){
		int empId = guid.generateId();
		employee.setId(empId);
		d.insertNewEmployee(employee);
	}
	
	public void viewEmployee(){
		
		d.findEmployee();
	}

}
