package car_dealership;

public class Manager {
	private int id;
	private String firstName;
	private String lastName;
	//private String dob;
	//private int ssn;
	//private String address;
	//private String state;
	//private int zip;
	private int empId;
	private int deptId;
	//private String deptName;
	
	public Manager (){	
	}

	public Manager(int id, String firstName, String lastName, int empId, int deptId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.dob = dob;
		//this.ssn = ssn;
		//this.address = address;
		//this.state = state;
		this.empId = empId;
		this.deptId = deptId;
		//this.deptName = deptName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getDob() {
//		return dob;
//	}
//
//	public void setDob(String dob) {
//		this.dob = dob;
//	}
//
//	public int getSsn() {
//		return ssn;
//	}
//
//	public void setSsn(int ssn) {
//		this.ssn = ssn;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}

	public int getempId() {
		return empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}
	public void setDeptId(int dID) {
		this.deptId = dID;
	}

	public int getDeptId() {
		return deptId;
	}

//	public String getDeptName() {
//		return deptName;
//	}
//
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", empid=" + empId + ", deptId=" + deptId
				+ "]";
	}
}


