package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb1 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb2 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb3 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb4 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb5 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");		
		int nb6 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb7 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb8 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb9 = scanner.nextInt();
		System.out.println("Veuillez saisir un nombre entier : ");
		int nb10 = scanner.nextInt();

		Resultat.log(nb1);
		Resultat.log(nb2);
		Resultat.log(nb3);
		Resultat.log(nb4);
		Resultat.log(nb5);
		Resultat.log(nb6);
		Resultat.log(nb7);
		Resultat.log(nb8);
		Resultat.log(nb9);
		Resultat.log(nb10);
		
		int[] valeurs = {nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8, nb9, nb10};
		int j=0;
		for (int i=1;i<valeurs.length;i++) {
			if (valeurs[i]>valeurs[i-1] && valeurs[i]>j) {
				j = valeurs[i];
			}
		}
		Resultat.log(j);
		
		scanner.close();
	}

}
