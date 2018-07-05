package com.brieucclement.tp18bis;

public class Combinaison {
	
	String couleur;
	String valeur;
	
	// Quinte flush royal
	public boolean checkqfr () {
		if (((valeur == "As") && (valeur == "Roi") && (valeur == "Dame") && (valeur == "Valet") && (valeur == "Dix")) 
				&& ((couleur == "Coeur") || (couleur == "Carreau") || (couleur == "Pique") || (couleur == "Trèfle")));
				return true;
		}
	
	// Quinte flush ordinaire
	public boolean checkqfo () {
		if (valeur == ) 
				&& ((couleur == "Coeur") || (couleur == "Carreau") || (couleur == "Pique") || (couleur == "Trèfle")));
		return false;
		}
	
	// Carré
	public boolean checkcar () {
		return false;	
		}
		
	// Full
	public boolean checkful () {
		return false;
		}
	
	// Carte haute
	public boolean checkcht () {
		return false;
		}
		
	// Paire (2 cartes identique en valeur)
	public boolean checkpre () {
		return false;	
		}
	
	// Double paire (2 cartes identique en valeur, 2 fois)
	public boolean checkdpr () {
		return false;	
		}
		
	// Brelan (3 cartes identique en valeur)
	public boolean checkbrl () {
		return false;	
		}
	
	// Suite (5 cartes se suivant en valeur)
	public boolean checksui () {
		return false;
		}
	
	// Couleur (5 cartes de la même famille)
	public boolean checkclr () {
		return false;
		}
	}