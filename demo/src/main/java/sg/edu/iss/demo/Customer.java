package sg.edu.iss.demo;

public class Customer {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
	public Customer(String id, String name) {
	super();
	this.id = id;
	this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public Customer() {
	super();
	// TODO Auto-generated constructor stub
	}
}
