package fr.dawan.object;

public class appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompteBancaire cb1 = new CompteBancaire ("toto", "12000541", 55412);
		System.out.println(cb1.toString());
		
		CompteBancaire cb2 = new CompteBancaire ("tata", "5ttt6", 5000);
		System.out.println(cb1.toString());
		
		CompteBancaire cb3 = new CompteBancaire ("tata", "5ttt6", 5000);
		System.out.println(cb1.toString());
		
		System.out.println(cb2 == cb3);
		
		System.out.println(cb2.equals(cb3));
		
	}
	

}
