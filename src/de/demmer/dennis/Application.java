package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		

		Hund hund1 = new Hund("Wautzi",10);
		Hund hund2 = new Hund("Bello", 5);
		Hund hund3 = new Hund("Wuffi", 4);
		Hund hund4 = new Hund("Karlo", 9);

		List<Hund> hundeListe = new ArrayList<>();
		
		hundeListe.add(hund1);
		hundeListe.add(hund2);
		hundeListe.add(hund3);
		hundeListe.add(hund4);

		System.out.println("Die Liste hat " + hundeListe.size() + " Einträge");
		
	
		for (Hund hund : hundeListe) {
			int alter = hund.getAlter();
			System.out.println("Hund " + hund.getName() + " ist " + alter + " Jahre alt.");
		}
		
		
		int letzerEintrag = hundeListe.size() -1 ;
		Hund letzerHund = hundeListe.get(letzerEintrag);
		
	
		System.out.println("Der Name des letzten Hundes ist: " + letzerHund.getName());
		
		hundeListe.clear();
		
		System.out.println("Die Liste hat " + hundeListe.size() + " Einträge");
		
		
		
		
		
		
		
		
	}

}
