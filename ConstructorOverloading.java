package programs;

public class Employer {

	String name = "hima";
	int age = 24;     // variable declaration
	int ID = 146;
	int Salary = 3000;
	
	Employer(){  // constructor class default
		System.out.println("Constructor method:");
		System.out.println("");
	}
	
	Employer(String a, int b, int c, int d){
		name=a;
		age = b;   // constructor parameterized
		ID = c;
		Salary = d;
		
	}
	
	
public static void main(String[]args) {
	Employer obj1 = new Employer();
System.out.println("name:"+ obj1.name);
System.out.println("age:"+ obj1.age);
System.out.println("ID:"+ obj1.ID);
System.out.println("Salary:"+ obj1.Salary);
System.out.println("");

	Employer obj2 = new Employer("Bindu", 20, 156, 5000);
	System.out.println("name:"+ obj2.name);
	System.out.println("age:"+ obj2.age);
	System.out.println("ID:"+ obj2.ID);
	System.out.println("Salary:"+ obj2.Salary);
	
	

}




}