package primerosEjer;
import java.util.Scanner;

public class NumbersEqual {
	
	
	/*
	 * this class determines that two numbers are equals 
	 * 
	 * */
	
	public static void main (String[] args) {
		
		int a,b;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("insert the first Number ");
		
		a = in.nextInt();
		
		System.out.println("insert the second number ");
		
		b = in.nextInt();
		
		if(a == b) {
			
			System.out.println("the numbers are equals");
			
			
		}else {
			
			
			System.out.println("the numbers aren´t equals");
			
		}
		
	}
	
	

}
