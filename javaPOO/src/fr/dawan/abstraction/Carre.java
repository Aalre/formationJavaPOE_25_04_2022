package fr.dawan.abstraction;

public class Carre extends Forme{

	protected int cote = 4;
	
	public int prop1 = 20;
	
	
	//pour appeler constructeur classe parent, faut utiliser la cle super
	//super sans 
	public Carre() {
		super();
		System.out.println("je suis dans classe carre");
	}

	@Override
	public double aire() {
		return cote * cote;
	}
	
}

