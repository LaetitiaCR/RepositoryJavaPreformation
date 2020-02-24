package com.crm.boapp.testUnitaireApp1;


import com.crm.bo.CompteBancaire;
import com.crm.boapp.applicationUtilisateurSannerApp2.CompteBancaireApp2;



public class CompteBancaireApp1 {

	public static void main(String[] args) {

		
		CompteBancaireApp2 cptBanc2 = new CompteBancaireApp2();
		String [] reponseClavierEntree = cptBanc2.CompteBancaireScanner();
		
		CompteBancaire cptBanc = new CompteBancaire();
		if (reponseClavierEntree[0].equals("R")) {
			cptBanc.faireRetrait(Integer.parseInt(reponseClavierEntree[1]));
		} else {
			cptBanc.faireDepot(Integer.parseInt(reponseClavierEntree[1]));
		}

		cptBanc.afficheSolde();

		cptBanc.afficheNumeroCompte();


	}

}
