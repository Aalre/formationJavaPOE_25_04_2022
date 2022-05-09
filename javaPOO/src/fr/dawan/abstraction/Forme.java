package fr.dawan.abstraction;

public abstract class Forme {
	
	private String chaine;
	public int prop1 = 5;
	
	
	public Forme() {
		System.out.println("je suis un constructeur de classe forme");
	}
	
	public Forme(String chaine) {
		this.chaine = chaine;
		System.out.println(this.chaine);
	}
	
	//methode abstraite pour l'aire dc faut redef les sous classes
	
	public abstract double aire();
	
	
	
	
}
