package com.crm.boapp.applicationUtilisateurSannerApp2;

import com.crm.boapp.utilitaires.ScannerConsole;

public class CompteBancaireApp2 {

	public String [] CompteBancaireScanner(){
		ScannerConsole scanCons = new ScannerConsole() ;
		scanCons.scannerCreation();
		String [] questionAposer = {"Voulez-vous faire un retrait ou un dépôt ? Indiquer R pour retrait, D pour depot : ",
									"Introduiser votre montant : "};
		
		String [] reponseClavierEntree = scanCons.scannerAfficheEtLectureConsole(questionAposer);
		scanCons.ScannerClose();
		return reponseClavierEntree;
	}
}
