package primerosEjer;

public class Objects {

	public static void main(String[] args) {
		/*
		 * with this main class we will manage the object of the class Car
		 * */
		
		// initialice the objet Car
		Car newcar = new Car();
		
		
		// set the values to the object
		newcar.setBrand("Audi");
		newcar.setHorse(150);
		newcar.setModel("A7");
		
		//get the imformation of this objet.
		
		System.out.println(newcar.getBrand());
		System.out.println(newcar.getModel());
		System.out.println(newcar.getHorse());
		
		newcar.setBrand("mercedes");
		
		System.out.println(newcar.getBrand());
		
	}

}
