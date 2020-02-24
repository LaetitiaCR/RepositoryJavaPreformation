package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

public class PersonneApp {

	public static void main(String[] args) {

		Personne pers1 = new Personne();
		pers1.aficheDetailsPersonne();

		String langues = "Anglais";

		pers1.aficheDetailsPersonne(langues);

		Personne pers2 = new Personne("Ll", "Cc");
		pers2.surnom = "cl";
		pers2.aficheDetailsPersonne();
		langues = "Français";
		pers2.aficheDetailsPersonne(langues);

		Personne pers3 = new Personne();
		pers3.surnom = "LC";
		pers3.setNom("carrri");
		pers3.setPrenom("Laeti");

		pers3.aficheDetailsPersonne();

		langues = "Italien";
		pers3.aficheDetailsPersonne(langues);

		Personne pers4 = new Personne("ccc", "lll");
		Personne pers5 = new Personne("ccc", "lll");

		// les deux objets ne sont pas identiques
		if (pers4 == pers5) {
			System.out.println("Les 2 objets sont identiques");
		} else {
			System.out.println("Les 2 objets ne sont pas identiques");
		}

		// les deux objets ne sont pas identiques
		if (pers4.equals(pers5)) {
			System.out.println("Les 2 objets sont identiques");
		} else {
			System.out.println("Les 2 objets ne sont pas identiques");
		}

		// methode qui compare nom et prenom des deux objet et est identique
		if (pers4.isEquals(pers5)) {
			System.out.println("Les 2 objets sont identiques");
		} else {
			System.out.println("Les 2 objets ne sont pas identiques");
		}

		Scanner scan = new Scanner(System.in);

		System.out.println("Entrez le nombre de ligne à insérer :");
		int nbLines = scan.nextInt();
		String[] personnes = new String[nbLines];

		String chaineScanNom;
		String chaineScanPrenom;

		for (int n = 0; n < nbLines; n++) {
			System.out.println("Entrez le nom et prénom :");
			chaineScanNom = scan.next();
			chaineScanPrenom = scan.next();
			personnes[n] = chaineScanPrenom + " " + chaineScanNom;

		}

		scan.close();

		Personne pers = new Personne();
		pers.setPersonnes(personnes);

		pers.afichePersonnes();
		// System.out.println("Bienvenue " + pers.getNom() + pers.sunom);

	}

}
