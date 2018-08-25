package primerosEjer;
import java.util.Scanner;
import java.text.DecimalFormat;


public class LongCircle {

	public static void main(String[] args) {
		/*
		 * This class calculate the long of  a circle with the radius.
		 * */

		double r,l;
		
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Please insert the radius of the circle");
		
		r = in.nextDouble();
		
		l = 2 * Math.PI * r;

		
		System.out.println("the long of your cicle is " + l);
		
		//trying with double format
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		//out 
		System.out.println("the long of your cicle is " + df.format(l));
		
	}

}
