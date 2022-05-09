package fr.dawan.syntaxe_debase.operateur;

public class FormatageChaineCaract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividende = 25;
		int diviseur = 11;
		
		System.out.println("["+ dividende + "/" + diviseur + "]");
		System.out.printf("[%d/%d]", dividende, diviseur);
		
		String str = String.format("[%d/%d]", dividende, diviseur);
		System.out.println(str);
		
		
		System.out.println(Math.PI);
		
		System.out.printf("%f%n", Math.PI);//pour formater
		System.out.printf("%.2f%n", Math.PI);//2chiffres après la virgule
	}

}
