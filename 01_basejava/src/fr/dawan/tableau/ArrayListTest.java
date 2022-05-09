package fr.dawan.tableau;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		
	
		tab1.add(20);
		
		tab1.set(0, 60);
		System.out.println(tab1.get(0));
		
		tab1.add(980);
		
		tab1.remove(1);
		
		System.out.println("taille" + tab1.size());
		
		
	}

}
