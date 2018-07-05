package com.brieucclement.tp18bis;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	
	float nbCartes = 32;
	
		List<String> couleur = new ArrayList<String>(); {
		     couleur.add("Carreau");
		     couleur.add("Coeur");
		     couleur.add("Pique");
		     couleur.add("Tèfle");
			 }

		List<String> valeur = new ArrayList<String>(); {
		      valeur.add("7");
		      valeur.add("8");
		      valeur.add("9");
		      valeur.add("10");
		      valeur.add("Valet");
		      valeur.add("Dame");
		      valeur.add("Roi");
		      valeur.add("As");
		}
}	