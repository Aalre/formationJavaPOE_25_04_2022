package fr.dawan.boucle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner Clavier = new Scanner(System.in);
			int age=0;
		
			do {
				System.out.println("entrer age :");
				age = Clavier.nextInt();
				if(age<=0) {
					System.out.println("age doit être positif");
				}
				
				
			} while (age<0);
			
			System.out.println("vous avez " + age + " ans");
			

		
		
		
		
	}

}
