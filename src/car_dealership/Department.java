package car_dealership;

public class Department {

	private int id;
	private String name;
	
	public Department(){	
	}
	
	public Department(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}


	
	
}
