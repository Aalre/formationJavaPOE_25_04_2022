package fr.dawan.getteursetteur;

public class utilisateurtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Un objet est crée avec le mot clé "new + constructeur"
        Utilisateur user1 = new Utilisateur();
        user1.nom = "toto";
        user1.prenom = "tata";
        System.out.println("NomUser1 : " + user1.nom);
        
        Utilisateur user2 = new Utilisateur("Dupont", "Pierre");
        System.out.println("NomUser2 : " + user2.nom);
        
        Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
        System.out.println("Age Emily : " + user3.age);
        
        System.out.println("Nombre d'utilisateur : " + Utilisateur.nbreUtilisateur);
	}

}
