package primerosEjer;
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("insert the first number ");
		
		a = in.nextInt();
		
		System.out.println("insert the second number ");
		
		b = in.nextInt();
		
		if ((a % b) == 0 ){
			
			
			System.out.println(b + " is a multiple number of " + a);
			
			
		}else {
			
			System.out.println(b + " isn´t a multiple numeber of " + a);
		}
		

	}

}
