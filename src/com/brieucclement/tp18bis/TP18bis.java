package com.brieucclement.tp18bis;

/**
 * 
 * Cr�er un programme permettant de jouer au poker contre une ia.
 * 
 * On pourra jouer selon 2 modes de jeu diff�rent :
 * 
 *   - poker fran�ais :
 *   	- 5 cartes par joueur au d�part
 *   	- mise de d�part
 *   	- s�lection de 0 � 3 cartes � jeter, qui seront remplac� par de nouvelles cartes
 *   	- mise
 *   	- fin du tour
 *   
 *   - texas hold'em
 *   	- 2 cartes par joueur non visible
 *   	- mise obligatoire pour le small blind(moiti� de la mise de d�part) et le big blind(mise de d�part � payer)
 *   	- cartes regardable
 *   	- mise
 *   	- disposition de 3 cartes sur la table
 *   	- mise
 *   	- disposition d'1 nouvelle carte sur la table
 *   	- mise
 *   	- disposition d'1 nouvelle carte sur la table
 *   	- mise
 *   	- composition d'une main par joueur avec les cartes de �a main et de la table
 *   	- fin du tour
 *   
 * Un jeu de poker est compos� de 32 cartes :
 *   
 *   - valeur de 7 � 10 puis des t�tes (valet, dame, roi, as)
 *   - famille (pique, carreau, tr�fle, coeur)
 *   - il n'existe qu'une seul combinaison de valeur et de couleur possible
 *  
 * Les participants d'une partie pourront aller de 2 � 4 joueurs 
 * chaque joueur poss�dera un montant d'argent � miser, si un joueur n'a plus d'argent il est �limin� 
 * 
 * Le jeu se passera sur une table de poker
 * 
 * Les combinaisons possible � r�alis� sont les suivantes :
 * 
 * 		- carte haute (valeur de la carte avec l'ordre de la famille => coeur, carreau, pique, tr�fle)
 * 		- paire (2 cartes identique en valeur)
 * 		- double paire (2 cartes identique en valeur, 2 fois)
 * 		- brelan (3 cartes identique en valeur)
 * 		- suite (5 cartes se suivant en valeur)
 * 		- couleur (5 cartes de la m�me famille)
 * 		- full (paire + brelan)
 * 		- carr� (4 cartes identique en valeur)
 * 		- quinte flush (suite + couleur)
 * 		- quinte flush royal (suite + couleur avec as)
 * 
 * Si deux combinaisons identique rentre en concurrence celle avec la carte de plus haute valeur gagne
 *  la r�gle de la carte haute est appliqu� en cas de re �galit�
 *  
 * Le donneur est celui qui distribue les cartes et il change � chaque tour dans le sens des aiguilles d'une montre
 * Le premier donneur est s�lectionn� si il est le plus jeune des joueurs
 *  
 * La gestion des mises se font selon les r�gles suivantes : 

 * 		- choix d'une mise minimal de d�part avant le jeu
 * 		- un joueur peux relancer au minimum de la moiti� du pot(somme de l'argent payer par tout les joueurs)
 * 		- si un joueur relance un nouveau tour de paye est lanc�
 * 		- un joueur pourra :
 * 			- se coucher (partir de la partie sans les sous d�j� pos� sur la table)
 * 			- checker (ne pas miser plus que se qui est d�j� pr�sent)
 * 			- relancer
 * 		- un tour de mise se fini une fois que toutes les personnes se sont align� sur la derni�re mise ou couch�
 * 
 * 
 * 	Avoir les notions dans votre code de :
 * 
 * 		- carte
 * 		- table
 * 		- main
 * 		- pot
 * 		- combinaison
 * 		- joueur
 * 		- mise
 * 		- tour de jeu
 * 		- jeu
 * 
 * 	Le jeu s'arr�tera quand le joueur humain quittera la table ou n'aura plus d'argent ou qu'il sera le seul joueur � table.
 * 

 * @author tactfactory

 *

 */

public class TP18bis {

	

}