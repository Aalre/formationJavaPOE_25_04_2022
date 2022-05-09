package fr.dawan.syntaxe_debase_entree_sortie_standard;

import java.util.Scanner;

	public class InstructionSwich {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner clavier = new Scanner (System.in);
			int jours = 7;
					
			System.out.println("saisir le num du jour");
			jours = clavier.nextInt();
			
			if(jours==1) {
				System.out.println("lundi");
			}else if (jours==2) {
				System.out.println("mardi");
			}else if (jours==3) {
				System.out.println("mercredi");
				
			}else if (jours==4) {
				System.out.println("jeusi");
			}else if (jours==5) {
				System.out.println("vendredi");
			}else if (jours==6) {
				System.out.println("samedi");
			}else if (jours==7) {
				System.out.println("dimanche");
			}else {
				System.out.println("entree invalide" + " entre 1 et 7");
			}
			
			//deuxieme solution: switch
			//switch est une variante du if/else
			//deux mots clés associé à l'util du swuch, break pour sortir du bloc quand un des cas est vérifié et default precise le traitement à effectuer
			//dans le cas où la variable n'est egale à aucune valeur repertoriée par chaque case
			
			switch(jours) {
				case 1:
					System.out.println("lundi");
					break;
				case 2:
					System.out.println("mardi");
					break;
				case 3:
					System.out.println("mercredi");
					break;
				case 4:
					System.out.println("jeudi");
					break;
				case 5:
					System.out.println("vend");
					break;
				case 6:
					System.out.println("sam");
					break;
				case 7:
					System.out.println("dim");
					break;
				default:
					System.out.println("entrée invalide"+" entre 1 et 7");
				
			}
			
			switch (jours) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("semaine");
				break;
			case 6:
			case 7:
				System.out.println("week end");
				break;
			default:
				System.out.println("erreur" + "entre 1 et 7");
			}
		}
	
}
