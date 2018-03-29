public class Employee {
	private String name;
	private Integer salary;

	

	public boolean isBetweenSalary(int lowerSalary, int upperSalary) {
		return (salary < upperSalary && salary > lowerSalary);
	}
	
	public boolean hasBiggerSalary(Employee otherEmployee) {
		return salary<otherEmployee.salary;
	}
	public double getTax() {
		return salary*0.16;
	}

	public void raiseSalary(int raise) {
		salary += raise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}