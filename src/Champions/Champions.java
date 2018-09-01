package Champions;
import java.util.Scanner;

public class Champions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Teams [] totalTeam(){
		
		Scanner in = new Scanner(System.in);
		
		Teams [ ] total  = new Teams[32];
		
		
		
		for (int i = 0; i < 32; i ++) {
			
			System.out.println("please intert the name of the team.");
			
			Teams team = new Teams(in.nextLine());
			
			System.out.println("insert the name of the Team");
			
			team.setName(in.nextLine());
			
			System.out.println("Insert the team´s country");
			
			team.setCountry(in.nextLine());
			
			System.out.println("insert the team´s uefa coeficient");
			
			team.setUefaCoeficient(in.nextInt());
			
			total[i] = team;
			
			
		}
		
		System.out.println("you have been create the general pot");
		
		
		return total;
	}

}
