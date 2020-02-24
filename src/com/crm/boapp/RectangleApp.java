package com.crm.boapp;

import com.crm.bo.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {

		int longueur = 10;
		int largeur = 20;
		Rectangle rect1 = new Rectangle(longueur, largeur);

		int aireRect1 = rect1.aireRectangle();
		System.out.println(aireRect1);

		int periRect1 = rect1.perimetreRectangle();

		String uniteMesure = "cm";

		String periRect2 = rect1.perimetreRectangle(uniteMesure);

		System.out.println(periRect1 + "\n" + periRect2);

		System.out.println("Le périmètre du rectangle est : " + rect1.perimetreRectangle("cm"));

		rect1.afficherDetailsRectangle();

		longueur = 10;
		largeur = 20;

		Rectangle rect2 = new Rectangle(longueur, largeur);

		int aireRect2 = rect2.aireRectangle();
		System.out.println(aireRect1);

		int periRect3 = rect2.perimetreRectangle();
		uniteMesure = "m";

		String periRect4 = rect2.perimetreRectangle(uniteMesure);

		System.out.println(periRect3 + "\n" + periRect4);

		System.out.println("Le périmètre du rectangle est : " + rect2.perimetreRectangle("m"));

		// comparaison de deux objets
		if (aireRect1 == aireRect2) {
			System.out.println("les mêmes surfaces pour ces deux formes");
		} else {
			System.out.println("pas les mêmes surfaces pour ces deux formes");
		}

		rect2.afficherDetailsRectangle();
		rect1.afficherDetailsRectangle();

	}

}
