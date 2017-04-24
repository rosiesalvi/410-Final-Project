package car_dealership;

import java.util.Scanner;

public class View {
	
	Scanner scan = new Scanner(System.in);
	Controller c = new Controller();

	
	public void prompt(){
		
		boolean loop = true;
		
		while(loop == true){
		System.out.println("Select:\n 1 for new department\n 2 for new employee\n 3 end");
		int response = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		
			//New Department
			if (response == 1){
				Department d = new Department();
				
				System.out.println("What is the name of the Department?");
				String deptName = scan.nextLine();
				d.setName(deptName);
				
		    	c.insertDepartment(d);
			}
			
			//New Employee
			else if (response == 2){
				Employee e = new Employee();
				
				System.out.println("First Name?");
				String fName = scan.nextLine();
				e.setFirstName(fName);
				
				System.out.println("Last Name?");
				String lName = scan.nextLine();
				e.setLastName(lName);
				
				System.out.println("SSN?");
				int ssn = scan.nextInt();
				scan.nextLine();
				e.setSsn(ssn);
				
				System.out.println("Address?");
				String address = scan.nextLine();
				e.setAddress(address);
				
				System.out.println("State?");
				String state = scan.nextLine();
				e.setState(state);
				
				System.out.println("Zip?");
				int zip = scan.nextInt();
				scan.nextLine();
				e.setZip(zip);
				
				System.out.println("DOB?");
				String dob = scan.nextLine();
				e.setDob(dob);
				
				System.out.println("Department ID?");
				String dID = scan.nextLine();
				e.setDeptId(Integer.parseInt(dID));
				
				System.out.println("Department Name?");
				String dName = scan.nextLine();
				e.setDeptName(dName);
				
				c.insertEmployee(e);
			}
			else if (response == 3){
				c.viewEmployee();
			}
			else{
				System.out.println("End");
				loop = false;
			}
		
		
	}
	}

}
