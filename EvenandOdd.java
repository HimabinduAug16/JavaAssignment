package programs;

public class FindOutEvenOrOdd {


		
		// Even number is divisible by 2 and gives a remainder zero whereas odd number leaves a remainder  

		public static void main(String[] args) {
			
			int a = 400; // Declare and initialize the variable 
			// using if else if decision making to check whether the input is even or odd
			
			if(a%2==0){
				System.out.println("Number entered is an even.");	
				// executes if the number is even
			}else if(a%2!=0){
				System.out.println("Number entered is odd.");
				// executes if the number entered is odd
			}
			
				
		}

	

	}