package fr.dawan.abstraction;

public class Triangle extends Forme{

	protected double hauteur = 2;
	protected double base = 4;
	
	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}

}
