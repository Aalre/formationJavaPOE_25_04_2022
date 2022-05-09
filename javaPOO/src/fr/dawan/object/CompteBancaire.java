package fr.dawan.object;

import java.util.Objects;

public class CompteBancaire {

	
	private String nomProprietaire;
	private String numeroCompte;
	private double solde;
	
	//def constr non def
	public CompteBancaire() {
		
	}
	
	
	
	public CompteBancaire(String nomProprietaire, String numeroCompte, double solde) {
		this.nomProprietaire = nomProprietaire;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public String getNomProprietaire() {
		return this.nomProprietaire;
		
	}
	
	public void setNomProprietaire (String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	
	public String getNumeroCompte () {
		return this.numeroCompte;
		
	}
	
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte =  numeroCompte;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public void setSolde(double newsolde) {
		solde = newsolde;
	}
	@Override
	public String toString() {
		return "Compte bancaire de " + this.nomProprietaire + "\nSolde actuel :"  + this.solde  + " e ";
	}



	@Override
	public int hashCode() {
		return Objects.hash(nomProprietaire, numeroCompte, solde);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		return Objects.equals(nomProprietaire, other.nomProprietaire)
				&& Objects.equals(numeroCompte, other.numeroCompte)
				&& Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
		
		//compare chacun des elements a comparer (les attributs un à un
	}
	//@Override
	//generation directe par eclipse
	
}


