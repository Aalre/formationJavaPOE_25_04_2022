package fr.dawan.interf_task1;

public class App {

	public static void main(String[] args) {
		
		//polymorphisme
		Animal animal1 = new Chat();
		Animal animal2 = new Chien();
		
		animal1.communiquer();
		animal2.communiquer();
		
	}

}
