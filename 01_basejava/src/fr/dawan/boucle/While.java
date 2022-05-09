package fr.dawan.boucle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner clavier = new Scanner(System.in);
			int age = 0;
			
			while(age<=0) {
				System.out.println("entrer votre age");
				age = clavier.nextInt();
				if(age<=0) {
					System.out.println("l'age doit etre positif");
				}
				}
				System.out.println("vous avez" + age + " ans");
			
	
		
		
		
		
		
		
	}

}
