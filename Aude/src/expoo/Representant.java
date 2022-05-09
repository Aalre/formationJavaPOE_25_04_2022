package expoo;

import java.util.Scanner;

public class Representant extends Employes {

	private double chiffreAffaire;
	private final double FACTEUR = 0.2;
	private final double COMMISSION = 800;
	
	
	public Representant() {
		super();
	}

	public Representant(String nom, String prenom, int age, String dateentree, double chiffreAffaire) {
		super(nom, prenom, age, dateentree);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public double calculerSalaire() {
		return chiffreAffaire * FACTEUR + COMMISSION;
	}
		
	public String getNom() {
		return "Le Representant " + this.prenom + " " + this.nom;
	}
	

	
}
