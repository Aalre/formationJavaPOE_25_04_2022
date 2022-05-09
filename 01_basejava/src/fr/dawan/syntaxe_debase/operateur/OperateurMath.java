package fr.dawan.syntaxe_debase.operateur;

public class OperateurMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 4;
		int var2;
		//System.out.println("var2 " + var2);
		
		var2 = 10;
		
		int somme = var1 + var2;
		System.out.println("somme = " + somme);

		
		int sub = var1 - var2;
		System.out.println("sub=" + sub);
		
		int mult = var1*var2;
		System.out.println("mult=" + mult);
		
		int div = var1/var2;
		System.out.println("div=" + div);
		
		int modulo = var2%var1;
		System.out.println("result:"+ modulo);
	}

}
