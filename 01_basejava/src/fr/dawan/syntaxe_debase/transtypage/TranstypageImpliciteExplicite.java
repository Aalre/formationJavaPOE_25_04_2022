package fr.dawan.syntaxe_debase.transtypage;

public class TranstypageImpliciteExplicite {

	public static void main(String[] args) {
		
		int i = 42;
		double d = i;
		System.out.println(d);
		
		
		int i1=123;
		short s=(short)i1;
		
		double d1=44.95;
		int i2 = (int) d1;
		System.out.println("i2 = " +i2);
		
		int i3 = 130 ;
		byte b = (byte) i3;
		System.out.println(i3);
		
		
	}

}
