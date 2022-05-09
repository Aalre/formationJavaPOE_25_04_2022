package fr.dawan.constructeur;

public class Utilisateurtest {
	
	
	//visibilite : public donc les autres classes pourront acc�der � ses attributs
	// variables d'instance(pas static) pour acceder = Instance.Variable
	
	
	
	public String nom;
	public String prenom;
	public int age;
	
	
	//variable de classe = Classe.Variable
	public static int nbrUtilisateur;
	
	//constructeur par defaut (sans param�tre)
	public Utilisateur() {
		nbreutilisateur++;
		
		
	}
	//constructeur avec deux parametre (nom et prenom)
	public Utilisateur(String nom, String prenom) {
		//this fait ref � l'objet en cours et represente l'obj dans leq on se trouve
		// on peut faire appel � this pour acceder � un attribut de la m�me classe
		this.nom = nom;
		this.prenom = prenom;
		
		Utilisateur user2 = new Utilisateur ("dupont","pierre");
		System.out.println("nomUser2 : " + user2.nom);
		
	}
	
	public Utilisateur(String nom, String prenom, int age) {
		//this():un constructeur peut appeler un autre constructeur de la meme classe en utilisant la methode this()
		//this.nom = nom;
		//this.prenom = prenom;
		this(nom, prenom);
		this.age = age;
		
	}

}
