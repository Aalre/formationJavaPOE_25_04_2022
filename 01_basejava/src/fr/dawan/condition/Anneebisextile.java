package fr.dawan.condition;

import java.util.Scanner;

public class Anneebisextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner (System.in);
		int annee;
		
				
		System.out.println("quelle est l'année");
		annee = clavier.nextInt();
		
		int modulo4 = annee%4;
		int modulo100 = annee%100;
		int modulo400 = annee%400;
		
		if ((modulo4==0 && modulo100!=0) || (modulo400==0)) {
			System.out.println("bissextile");
		}else {
			
			System.out.println("normal");
		}	
	}

}
