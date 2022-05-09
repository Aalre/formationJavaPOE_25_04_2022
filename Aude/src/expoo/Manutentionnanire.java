package expoo;

public class Manutentionnanire extends Employes{
	
	public double nbrheure;
	private final int FACTEUR_CALCUL = 65;
	
	
	
	public Manutentionnanire() {
		super();
	}

	public Manutentionnanire(double nbrheure) {
		super();
		this.nbrheure = nbrheure;
	}

	public Manutentionnanire(String nom, String prenom, int age, String dateentree, double nbrheure) {
		super(nom, prenom, age, dateentree);
		this.nbrheure = nbrheure;
	}
	
	@Override
	public double calculerSalaire() {
		return FACTEUR_CALCUL * nbrheure;
	}
	
	
	public String getNom() {
		return "Le manutentionnaire " + this.prenom + " " + this.nom;
	}
	

}
