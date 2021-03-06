package fr.dawan.encapsulation;

public class utilisateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Visibilit? : public 
        //Cela veut dire que les autres classes pourront acceder ? ces 
        //attributs.
        //Variable d'instance = Instance.Variable
        public String nom;
        public String prenom;
        public int age;
        
        //Variable de classe ==> Classe.Variable
        public static int nbreUtilisateur;
        public static final int NBR_MAX_OR=2;
        
        
        //Constructeur par defaut (sans param?tre)
        public Utilisateur() {
                nbreUtilisateur++;
        }
        
        //Constructeur avec deux param?tre (nom et prenom)
        public Utilisateur(String nom, String prenom) {
                //this fait reference ? l'objet courant (en cours) 
                //this represente l'objet dans lequel nous nous trouvons
                //On peut faire appel ? this pour acceder ? un attribut 
                //de la m?me classe
                this();
                this.nom = nom;
                this.prenom = prenom;
                
        }
        
        public Utilisateur(String nom, String prenom, int age) {
                //this()  : Un constructeur peut appeler un autre constructeur
                //de la m?me classe en utilisant la methode this()
//                this.nom = nom;
//                this.prenom = prenom;
                this(nom, prenom);
                this.age = age;
        }
        

        
 


	}

}
