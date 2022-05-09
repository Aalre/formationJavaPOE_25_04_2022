package fr.dawan.syntaxe_debase.transtypage;

public class Introduction {
	
	public static void main(String[] args) {
		int var1=4;
		int var2=10;
		
		double quotient = var1/var2;
		System.out.println("quotient = " + quotient); //0
		
		double _var1=4;
		double _var2=10;
		
		double quotient2 = _var1 / _var2;
		System.out.println("quotient = " + quotient2);
		
		double quotient3 = (double) _var1 / _var2;
		System.out.println("quotient = " + quotient3);
		
		
	}

}
