// Department

public class Department {
	// attributes
	private String nameDept;
	private Employee mgr;
	private Division div1;
	private Division div2;

	// constructor
	public Department() {
		this.nameDept = "Unknown";
	}

	public Department(String aName, Employee emp, Division div1, Division div2) {
		this.nameDept = aName;
		this.mgr = emp;
		this.div1 = div1;
		this.div2 = div2;
	}

	// accessors
	public String getNameDept() {
		return this.nameDept;
	}

	// mutators
	public void setNameDept(String aName) {
		this.nameDept = aName;
	}

	// print dept info
	public void print() {
		System.out.println("Department Name: " + nameDept);
		System.out.println(mgr.toString());
		System.out.println();

		System.out.println("\tDivision Name1: " + div1.getNameDiv());
		System.out.println(div1.getDir().toString());
		System.out.println();

		System.out.println("\tDivision Name2: " + div2.getNameDiv());
		System.out.println(div2.getDir().toString());
		System.out.println();

	}
}