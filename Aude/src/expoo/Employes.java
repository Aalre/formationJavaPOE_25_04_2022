package expoo;

import java.time.LocalDate;

public abstract class Employes {
	
	protected String nom;
	protected String prenom;
	protected int age;
	protected String dateentree;
	
	
	public Employes() {
		super();
	}
	
	public Employes(String nom, String prenom, int age, String dateentree) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateentree = dateentree;
	}
	
	public abstract double calculerSalaire();
	
	public String getNom() {
		return "L'employe " + this.prenom + " " + this.nom;
	}
	
}
	