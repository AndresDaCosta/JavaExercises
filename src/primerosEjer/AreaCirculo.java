package primerosEjer;
import java.util.Scanner;
public class AreaCirculo {

	public static void main(String[] args) {
		/*
		 * this class calculate the area of the circle.
		 * 
		 * */

		Scanner in = new Scanner(System.in);
		
		double r,a;
		
		double pi = 3.1416;
		
		System.out.println("Please insert the radius of the circle ");
		
		r = in.nextDouble();
		
		a = (pi * (r * r));
		
		System.out.println("The area of your circle is" + a);
		
		
	}

}
