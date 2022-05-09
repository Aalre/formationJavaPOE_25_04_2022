package fr.dawan.syntaxe_debase.operateur;

public class OperateursDincrementation {

	public static void main(String[] args) {
		
		int c = 10;
		c++;
		System.out.println(c);
		//augmente de 1
		
		int d = 15;
		d--;
		System.out.println(d);
		
		int e = 10;
		System.out.println("post inc : " + e++);
		System.out.println("pré inc : " + ++e);
		
		int f = 10;
		System.out.println("pré inc : " + ++f);
		System.out.println("post inc : " + f++);

		int m = 7;
		int n = 7;
		int a = 2* ++m;
		int b = 2 * n++;
		System.out.println("a : " + a);
		System.out.println(" b : " + b);


	}

}
