package com.crm.boapp;

import com.crm.bo.Voiture;

public class VoitureApp {

	public static void main(String[] args) {
		
		
		String marque;
		String couleur;
		int nombrePortes;
		boolean boiteVitesseAutomatique;
		float prix;
		int vitesse;
		boolean klaxonner;
		boolean demarrer;
		boolean arreter;
		
		marque = "Renault";
		couleur = "bleue";
		nombrePortes = 5;
		boiteVitesseAutomatique = false;
		prix = 18990;
		vitesse = 80;
		klaxonner = true;
		demarrer = true;
		arreter = false;
		
		Voiture voitu1 = new Voiture();
		voitu1.setMarque(marque);
		voitu1.setCouleur(couleur);
		voitu1.setNombrePortes(nombrePortes);
		voitu1.setBoiteVitesseAutomatique(boiteVitesseAutomatique);
		voitu1.setPrix(prix);
		
		
		voitu1.afficherDetails();
		
		
		voitu1.setDemarrer(demarrer);
		
		voitu1.setVitesse(vitesse);
		voitu1.setKlaxonner(klaxonner);
		
		voitu1.setArreter(arreter);
		
		
		
	
		
		
	
		
		

	}

}
