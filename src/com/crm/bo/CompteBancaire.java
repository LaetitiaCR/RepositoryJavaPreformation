package com.crm.bo;

public class CompteBancaire {

	
	private double montantCompte = 5000;
	private double solde;
	//private final String BASE_NUM_COMPTE = "CONST";

		

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getSolde() {
		return solde;
	}


	public void afficheNumeroCompte() {
		int nbAleatoire = (int) (Math.random() * (1000000000 - 0));
		//complete les zeros manquant devant le nombre pour faire 20 chiffres
		String numeroCompte = String.format("%020d", nbAleatoire);
		System.out.println("Votre numero de compte est : " + numeroCompte);
	}

	public void faireRetrait(double montant) {
		if ((montantCompte - montant) > -150) {
			solde = montantCompte - montant;
			setSolde(solde);
		}
		else {
			setSolde(montantCompte);
		}
	}

	public void faireDepot(double montant) {
		solde = montantCompte + montant;
		setSolde(solde);
	}

	public void afficheSolde() {
		if (solde == montantCompte) {
			System.out.println("Votre solde est toujours, l'opération n'a pu être efectuée : " + getSolde());
		}
		else if (solde>montantCompte) {
			System.out.println("Votre nouveau solde, après votre ajout est : " + getSolde());
		}
		else {
			System.out.println("Votre nouveau solde après votre retrait est : " + getSolde());
		}
			
	}
}
