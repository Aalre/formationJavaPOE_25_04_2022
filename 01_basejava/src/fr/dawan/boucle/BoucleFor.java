package fr.dawan.boucle;

public class BoucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// exemple 1:
		
		System.out.println("le double de 1 est: " + 1*2);
		System.out.println("le double de 2 est: " + 2*2);
		System.out.println("le double de 3 est: " + 3*2);
		System.out.println("le double de 4 est: " + 4*2);
		
		// l'écriture est fastidieuse
		
		//solution: utiliser les boucle: for, while, do while
		
		// Solution utilisation de la boucle for 
		
		for (int i=1; i<= 10; i++) {
			System.out.println("le double de " + i + " est " + i*2);
		}
		
		
		
	}

}
