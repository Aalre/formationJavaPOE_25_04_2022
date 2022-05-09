package fr.dawan.polymorphisme;

import java.util.ArrayList;

public class appli {

	public static void main(String[] args) {
		
		ArrayList<EtreHumain> tab = new ArrayList<EtreHumain>();
		
		tab.add(new Homme());
		tab.add(new Femme());
		tab.add(new Femme());
		tab.add(new Homme());

		for (EtreHumain etreHumain : tab) {
			etreHumain.uriner();
			
		}
	}

}
