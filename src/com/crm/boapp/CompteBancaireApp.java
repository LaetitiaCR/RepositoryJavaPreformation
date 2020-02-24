package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.CompteBancaire;

public class CompteBancaireApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Voulez-vous faire un retrait ou un dépôt ? Indiquer R pour retrait, D pour depot : ");
		String demande = scan.next();

		System.out.println("Introduiser votre montant : ");
		Double montantEntree = scan.nextDouble();

		CompteBancaire cptBanc = new CompteBancaire();
		if (demande.equals("R")) {
			cptBanc.faireRetrait(montantEntree);
		} else {
			cptBanc.faireDepot(montantEntree);
		}

		cptBanc.afficheSolde();

		cptBanc.afficheNumeroCompte();

		scan.close();

	}

}
