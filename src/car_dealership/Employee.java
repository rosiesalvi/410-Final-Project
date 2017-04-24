package car_dealership;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String dob;
	private int ssn;
	private String address;
	private String state;
	private int zip;
	private int deptId;
	private String deptName;
	
	public Employee(){	
	}

	public Employee(int id, String firstName, String lastName, String dob, int ssn, String address, String state,
			int zip, int deptId, String deptName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.ssn = ssn;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.deptId = deptId;
		this.deptName = deptName;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setDeptId(int dID) {
		this.deptId = dID;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", ssn="
				+ ssn + ", address=" + address + ", state=" + state + ", zip=" + zip + ", deptId=" + deptId
				+ ", deptName=" + deptName + "]";
	}
}

