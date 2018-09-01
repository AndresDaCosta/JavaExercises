package Champions;

public class Teams {
	
	/*
	 * this class creates the objets of the teams that participate on the champios leage
	 * */
	
	private String name;
	private String country;
	private int uefaCoeficient;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getUefaCoeficient() {
		return uefaCoeficient;
	}
	public void setUefaCoeficient(int uefaCoeficient) {
		this.uefaCoeficient = uefaCoeficient;
	}
	public Teams (String name) {
		
		System.out.println("the object " + name + " has been create");
		
	}
	
	
}
