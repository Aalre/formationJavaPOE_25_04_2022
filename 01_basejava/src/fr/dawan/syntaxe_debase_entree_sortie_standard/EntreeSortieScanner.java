package fr.dawan.syntaxe_debase_entree_sortie_standard;

import java.util.Scanner;

public class EntreeSortieScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in); //pour instancier une classe il faut new+constructeur ccdessous
		int n=0;
		double var1=0.0;
		
		System.out.println("entrer un nbre");
		n=clavier.nextInt();
		System.out.println("le carré de " + n + " est " + n*n);

		System.out.println("entrer un nombre réel");
		var1 = clavier.nextDouble();
		System.out.println("vous avez entré : " + var1);
		
	}

}
