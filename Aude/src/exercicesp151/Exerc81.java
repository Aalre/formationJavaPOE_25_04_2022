package exercicesp151;

import java.util.Arrays;

public class Exerc81 {
	
	static String[] adresse;
	static String[] listeFournisseur;
	static String[] listeFournisseursdistinct;
	static int[] nombreClients;
	

	public static void main(String[] args) {

		adresse=new String[10];
		adresse[0]="jpp@sfr.fr";
		adresse[1]="tom@gmail.com";
		adresse[2]="fres@sfr.fr";
		adresse[3]="vistor@sfr.fr";
		adresse[4]="chris@sfr.fr";
		adresse[5]="robert@orange.fr";
		adresse[6]="paul@sfr.fr";
		adresse[7]="lise@gmail.com";
		adresse[8]="thierry@eni.fr";
		adresse[9]="mari@eni.fr";
		
		listeFournisseur = new String[10];
		for (int i=0; i<adresse.length; i++) {
			listeFournisseur[i]=adresse[i].substring(adresse[i].indexOf('@')+1);}
		
		System.out.println("liste des fournisseurs: ");
		System.out.println(Arrays.toString(listeFournisseur));
		
		
		Arrays.sort(listeFournisseur);
		System.out.println("liste fournisseurs triée");
		System.out.println(Arrays.toString(listeFournisseur));
		
		listeFournisseursdistinct = new String[1];
		nombreClients = new int[1];
		
		listeFournisseursdistinct [0] = listeFournisseur[0];
		nombreClients [0] = 1;
		for (int i=1; i<listeFournisseur.length; i++) {
			if (!listeFournisseur[i].equals(listeFournisseursdistinct[listeFournisseursdistinct.length-1])) {
				listeFournisseursdistinct = Arrays.copyOf(listeFournisseursdistinct,
						listeFournisseursdistinct.length+1);
				nombreClients = Arrays.copyOf(nombreClients,
						nombreClients.length+1);
				
				listeFournisseursdistinct[listeFournisseursdistinct.length-1] = listeFournisseur[i];
				nombreClients[nombreClients.length-1]=1;
			}
			else {
				nombreClients[nombreClients.length-1]+=1;
				
			}
		}
		
		System.out.println("liste des fournisseurs distincts:");
		System.out.println(Arrays.toString(listeFournisseursdistinct));
		System.out.println("nombre de clients pour chaque fournisseur");
		System.out.println(Arrays.toString(nombreClients));
		
		System.out.println("parts de marché:");
		for (int i = 0; i<listeFournisseursdistinct.length; i++) {
			
			System.out.println(String.format("=>, %s\t: %d clients sur %d(%1f%%)",
					listeFournisseursdistinct[i],
					nombreClients[i],
					adresse.length,
					(nombreClients[i]*100.0/adresse.length))); 
		}
		
		}
		
	

}



