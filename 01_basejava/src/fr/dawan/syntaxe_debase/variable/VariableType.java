package fr.dawan.syntaxe_debase.variable;

public class VariableType {
	public static void main(String[] args) {
		//Type caract�re: char
		char c='a';
		char c1;
		c1='b';
				
		//Type Entier:byte, short, int, long
		byte b=1;
		short s=2;
		int i=3;
		long l=4;
		
		//on peut forcer une valeur � etre inter comm un entier long
		//en suffixant la valeur L ou l
		long l2=100L;
		
		//on peut s�parer les milier pour lisibilit�
		long l3=1_000_000_000;
		System.out.println("le contenu de l3:" + 13);
		
		//les type � virgule flottante ou r�el: float double
		double d1=5;
		System.out.println("cont d:" +d1);
		
		//var float faut suffixer valeur par F ou f 
		float f=0.5F;
		
		
		//Type complexe
		String str="dawan_";
		int[] tab= {200, 300, 50};
		
		
	}
	
}
