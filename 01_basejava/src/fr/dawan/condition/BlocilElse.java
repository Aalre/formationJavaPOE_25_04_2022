package fr.dawan.condition;

import java.util.Scanner;

public class BlocilElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner (System.in);
		int nbre = 0;
		
		System.out.print("entrer un nombre:");
		nbre = clavier.nextInt();
		
		if (nbre >0) {
			System.out.print("le nombre est positif");
		} else {
			System.out.println("le nombre est négatif ou egal à zero");
		}
		
			
		
		}

}
