package expoo;

import java.util.Scanner;

public class Vendeur extends Employes {

	private double chiffreAffaire;
	private final double FACTEUR = 0.2;
	private final double BONUS_VENDEUR = 400;
	
	
	public Vendeur() {
		super();
	}


	public Vendeur(String nom, String prenom, int age, String dateentree, double chiffreAffaire) {
		super(nom, prenom, age, dateentree);
		this.chiffreAffaire = chiffreAffaire;
	}





	@Override
	public double calculerSalaire() {
		return chiffreAffaire * FACTEUR + BONUS_VENDEUR;
	}
	
	
	public String getNom() {
		return "Le vendeur " + this.prenom + " " + this.nom;
	}
	

	
}
