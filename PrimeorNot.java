package programs;

 public class PrimeOrNot {
	/* A prime number is a whole number greater than 1,
	*whose only two whole-number factors are 1 and itself.*/
	
	public boolean isPrimeNumber(int number){
		
	/* Allocates a Boolean object representing the value argument.
	 * Boolean is a binary variable having two values true or false	
	 */
        
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
        PrimeOrNot pon = new PrimeOrNot();// Create object
        System.out.println("Is 28 prime number? "+pon.isPrimeNumber(80));
        
}

}