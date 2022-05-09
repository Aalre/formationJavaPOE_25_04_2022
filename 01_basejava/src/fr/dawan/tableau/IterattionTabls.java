package fr.dawan.tableau;

public class IterattionTabls {

	public static void main(String[] args) {

		int[] tab = {200, 300, 50};
		double[] tab2 = {25.0, 6.54, 100.01, 91};
		
		
		for(int i =0; i<7; i++) {
			System.out.println("elem à la position" + i + " : " + tab[i]);
		}
		
		System.out.println("\ntaille"+tab.length + "\n");
		
		for(double element : tab) {
			System.out.println(element);
		}
		
		
	}

}
