package programs;

class EmployerDetails {
	
	String name;
	String gender; // Initialization of variables
	int age;
	int salary;
	String dept;
	int ID;
	
	EmployerDetails(String name,String gender,int age,int salary,String dept,int ID){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.ID= ID;
	}
			
	
	public static void main(String[]args) {
		EmployerDetails obj =new EmployerDetails("Bindu", "Female",27, 2000, "sales", 12345);
		System.out.println("name:" +obj.name);
		System.out.println("gender:" +obj.gender);
		System.out.println("age:"+obj.age);
		System.out.println("salary:"+obj.salary);
		System.out.println("dept:"+obj.dept);
		System.out.println("ID:" +obj.ID);
		
	
		
	}
	

}