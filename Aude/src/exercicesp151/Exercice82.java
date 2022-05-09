package exercicesp151;

import java.util.Random;

public class Exercice82 {

	public static void main(String[] args) {
		
		int nbreTentative = 0;
		int nbr1, nbr2, nbr3;
		Random rd = new Random();
		
		do {
			nbr1 = rd.nextInt(1000);
			nbr2 = rd.nextInt(1000);
			nbr3 = rd.nextInt(1000);
			
			//incrementation du nombre de tentative
			
			nbreTentative++;
			
			//affichage nombre tentative
			System.out.println("nombre1 : "+ nbr1 + "nombre2 : " + nbr2 + "nombre3 : " + nbr3);
			
		}while (nbr1%2==1 || nbr2%2==1 || nbr3%2==0);
		
		System.out.println("le resultat obtenu en " + nbreTentative + "essai(s)");
		
		
	}

}
