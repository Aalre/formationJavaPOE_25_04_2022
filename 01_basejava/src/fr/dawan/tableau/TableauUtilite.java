package fr.dawan.tableau;

import java.util.Scanner;

public class TableauUtilite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner clavier = new Scanner(System.in);
			int age1, age2;
			double moyenne;
			
			System.out.println("entre age 1:");
			age1 =clavier.nextInt();
			
			System.out.println("entrer age2:");
			age2 = clavier.nextInt();
			
			moyenne = (age1 + age2)/2;
			System.out.println("la moyenne est " + moyenne);
		
		
		
	}

}
