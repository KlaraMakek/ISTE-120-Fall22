// Division

public class Division {
	// attributes
	private String nameDiv;
	private Employee dir;

	// constructor
	public Division() {
			this.nameDiv = "Unknown";
	}
	public Division(String aName, Employee emp) {
		this.nameDiv = aName;
		this.dir = emp;
	}

	// accessors
	public String getNameDiv() {
		return this.nameDiv;
	}

	public Employee getDir() {
		return this.dir;
	}

	//mutators
	public void setNameDiv(String aName) {
		this.nameDiv = aName;
	}

	public void setDir(Employee emp) {
		this.dir = emp;
	}
}