package myJavaPackage;

class Employee{
	private int salary;
	private String name;
	
	//Getter Methods -----
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
	}
	
	//Setter Methods--------
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
}

public class AccessSpecifier {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
//		employee.salary=20000;
//		employee.name="Kaleen Bhaiya";
//		System.out.println("Name : "+employee.name);
//		System.out.println("Salary : "+employee.salary);
//They will only run when the attributes are public otherwise they will throw error

		employee.setName("Kaleen Bhaiya");
		employee.setSalary(10000);
		System.out.println("Name : "+employee.getName());
		System.out.println("Name : "+employee.getSalary());
		
		
	}

}
