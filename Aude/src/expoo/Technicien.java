package expoo;

public class Technicien extends Employes{
	
	public int nbrunites = 1000;
	private final int FACTEUR_UNITE = 5;
	
	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, int age, String dateentree, int nbrunites) {
		super(nom, prenom, age, dateentree);
		this.nbrunites = nbrunites;
	}

	@Override
	public double calculerSalaire() {
		return FACTEUR_UNITE * nbrunites;
	}
	
	public String getNom() {
		return "Le Technicien " + this.prenom + " " + this.nom;
	}
}