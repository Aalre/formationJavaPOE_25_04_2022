package fr.dawan.constructeur;

public class Utilisateur {

	public static void main(String[] args) {
		// obj est créé avec le mot clé "new+constructeur"
		
		Utilisateur user1 = new Utilisateur();
		user1.nom = "toto";
		user1.prenom = "tata";
		System.out.println("NomUser1: " + user1.nom);
		
		Utilisateur user2 = new Utilisateur ("dupont","pierre");
		System.out.println("nomUser2 : " + user2.nom);
		
		Utilisateur user3 = new Utilisateur("Rudd", "emily", 27);
		System.out.println("age emily :" + user3.age);
		
		System.out.println("nbr utilisateur : " +Utilisateur.nbrUtilisateur);
		
	}

}
