package primerosEjer;
import java.util.Scanner;

public class PositivoNega {

	public static void main (String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int a;
		
		
		System.out.println("Please insert the first number ");
		
		a = in.nextInt();
		
		
		
		if( a > 0) {
			
			System.out.println("this number is positive");
		}else{
			
			System.out.println("this number is negative ");
		}
		
		
		
	}
	
	
	
}
