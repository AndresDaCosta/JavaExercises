package primerosEjer;
import java.util.Scanner;
public class DiagonalMatriz {

	public static void main(String[] args) {
		/*
		 * this class calculate the diagonal and the iverse diagonal of a multidimensional array
		 * 
		 * @author jorge da costa 
		 * 
		 * */
		
		Scanner in = new Scanner(System.in);
		
		int [][] array = new int [5] [5];
		
		
		for(int x = 0; x < 5; x ++){
			
			for (int y = 0; y < 5; y ++){
				
				System.out.println("please type some number ");
				
				array [x] [y] = in.nextInt();
				
				
				
			}
			
			
		}
		
		
		for (int z = 0; z < 5; z++) {
			
			
			System.out.println(array [z] [z]);
			
			
		}
		for (int z = 4; z < -1; z--){
			
			System.out.println(array [z][z]);
			
		}

	}

}
