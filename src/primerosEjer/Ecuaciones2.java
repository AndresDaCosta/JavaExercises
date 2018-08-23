package primerosEjer;
import java.util.Scanner;
public class Ecuaciones2 {

	public static void main(String[] args) {
		/*this main class obtain the coefficients of a second degree equation 
		 * and provides to the user the possibles results. If the result doesn´t exist
		 * the program needs indicate to the user
		 * 
		 * @author: Jorge da costa 
		 * 
		 * */
		
		//we creates the Input and the variables.
		Scanner in = new Scanner(System.in);
		double a,b,c;
		double x1,x2,d;
		
		System.out.println("Please insert the first coefficient or a");
		
		a = in.nextDouble();
		
		System.out.println("Please insert the second coefficient or b");
		
		b = in.nextDouble();
		
		System.out.println("Please insert the thirt coefficient or c");
		
		c = in.nextDouble();
		
		d = (((b * b)-(4 * a * c)));
		
		if(d == 0) {
			
			x1 =(-b+Math.sqrt(d))/(2*a);
			x2 =(-b+Math.sqrt(d))/(2*a);
			
			System.out.println(x1);
			System.out.println(x2);
			
			
		}else {
			
			System.out.println("this equation doesn´t have any solution");
			
		}
		
		
		
		
		
	}

}
