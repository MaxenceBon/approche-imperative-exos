package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 *  
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		//  o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		//  o elle vaut false dans les autres cas
		boolean controle1 = false;
		boolean controle2 = false;
		boolean controle3 = false;
		boolean controle4 = false;
		boolean controle5 = false;
		boolean controle6 = false;
		if (tab1.length>0 && (tab1[0] == 6 || tab1[tab1.length-1] == 6)) {
			controle1 = true;
		}
		if (tab2.length>0 && (tab2[0] == 6 || tab2[tab2.length-1] == 6)) {
			controle2 = true;
		}
		if (tab3.length>0 && (tab3[0] == 6 || tab3[tab3.length-1] == 6)) {
			controle3 = true;
		}
		if (tab4.length>0 && (tab4[0] == 6 || tab4[tab4.length-1] == 6)) {
			controle4 = true;
		}
		if (tab5.length>0 && (tab5[0] == 6 || tab5[tab5.length-1] == 6)) {
			controle5 = true;
		}
		if (tab6.length>0 && (tab6[0] == 6 || tab6[tab6.length-1] == 6)) {
			controle6 = true;
		}

		// TODO LOGUEZ la valeur obtenue pour chacun des 6 tableaux tab1 à tab6
		Resultat.log(controle1);
		Resultat.log(controle2);
		Resultat.log(controle3);
		Resultat.log(controle4);
		Resultat.log(controle5);
		Resultat.log(controle6);
	}

}
