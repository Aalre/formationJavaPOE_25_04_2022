package exercicesp151;

import java.util.Random;
import java.util.Scanner;

public class Exercice83 {

	public static void main(String[] args) {

		int nbressai=0;
		int ordi=0;
		int nbrSaisi = 0;
		Random rd = new Random();
		
		ordi=rd.nextInt(1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir un nombre entre 0 et 1000");
		
		do {
		nbrSaisi = sc.nextInt();
		nbressai++;
		
		if (nbrSaisi<ordi) {
			System.out.println("non, c'est plus");
		}else if(nbrSaisi>ordi){
			System.out.println("non, c'est moins");
		}
		
		
		}
		while (nbrSaisi!=ordi);
		System.out.println("bravo vous avez trouvé en " + nbressai + "essai(s)");
		}
}