// Employee

public class Employee {
	// attributes
	private int empNo;
	private String name;
	private double yearlySalary;

	// constructor
	public Employee() {
		this.name = "Unknown";
		this.empNo = -1;
		this.yearlySalary = 0;
	}

	public Employee(String aName, int num, double yearlySalary) {
		this.name = aName;
		this.empNo = num;
		this.yearlySalary = yearlySalary;
	}

	// accessors
	public String getName() {
		return this.name;
	}

	public int getEmpNo() {
		return this.empNo;
	}

	public double getYearlySalary() {
		return this.yearlySalary;
	}

	// mutators
	public void setName(String aName) {
		this.name = aName;
	}

	public void setEmpNo(int num) {
		this.empNo = num;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	@Override
	public String toString() {
		return "\t\tDirector Name : " + this.getName() + "\n\t\t" +
				"Director Emp #: " + this.getEmpNo() + "\n\t\t" +
				"Director Yearly Salary: " + this.getYearlySalary();

	}
}
