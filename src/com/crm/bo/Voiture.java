package com.crm.bo;

import java.text.DecimalFormat;

/**
 * @author CRM
 * @version 1.0
 * @created 13-févr.-2020 15:33:51
 */
public class Voiture {

	private String marque;
	private String couleur;
	private int nombrePortes;
	private boolean boiteVitesseAutomatique;
	private float prix;
	private int vitesse;
	private boolean klaxonner;
	private boolean demarrer;
	private boolean arreter;



	public Voiture(){

	}

	/**
	 * 
	 * @param marque
	 * @param couleur
	 * @param nombrePortes
	 * @param boiteAutomobileAutomatique
	 * @param prix
	 */
	public Voiture(String marque, String couleur, int nombrePortes, boolean boiteVitesse, float prix){

		setMarque(marque);
		setCouleur(couleur);
		setNombrePortes(nombrePortes);
		setBoiteVitesseAutomatique(boiteVitesse);
		setPrix(prix);
		
	}

	
	public void afficherDetails() {
		System.out.println("La marque est : " + marque );
		System.out.println("La couleur est : " + couleur);
		System.out.println("Il y a " + nombrePortes + " portes.");
		if (boiteVitesseAutomatique = true) {
			System.out.println("C'est une boite de vitesse automatique");
		}
		else {
			System.out.println("C'est une boite de vitesse manuelle");
		}
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Le prix de la voiture est : "  + (df.format(prix)) + " euros");
		System.out.println("Le prix de la voiture est : " + prix + " euros");
		
		//int prixInt = (int)prix;
		//String forPrix = String.format(prix, 2); 
		//String s=format(prix,2);	
	}
	
	
	/**
	 * 
	 * @param demarrer
	 */
	public void setDemarrer(boolean demarrer){
		this.demarrer = demarrer;
	}

	public boolean getDemarrer(){
		return demarrer;
	}

	/**
	 * 
	 * @param arreter
	 */
	public void setArreter(boolean arreter){
		this.arreter = arreter;
	}

	public boolean getArreter(){
		return arreter;
	}

	/**
	 * 
	 * @param vitesse
	 */
	public void setVitesse(int vitesse){
		this.vitesse = vitesse;
	}

	public int getVitesse(){
		return vitesse;
	}

	/**
	 * 
	 * @param klaxonner
	 */
	public void setKlaxonner(boolean klaxonner){
		this.klaxonner = klaxonner;
	}

	public boolean getKlaxonner(){
		return klaxonner;
	}

	/**
	 * 
	 * @param marque
	 */
	public void setMarque(String marque){
		this.marque = marque;
	}

	public String getMarque(){
		return marque;
	}

	/**
	 * 
	 * @param couleur
	 */
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}

	public String getCouleur(){
		return couleur;
	}

	/**
	 * 
	 * @param nombrePortes
	 */
	public void setNombrePortes(int nombrePortes){
		this.nombrePortes = nombrePortes;
	}

	public int getNombresPortes(){
		return nombrePortes;
	}

	/**
	 * 
	 * @param boiteAutomobile
	 */
	public void setBoiteVitesseAutomatique(boolean boiteVitesseAutomatique){
		this.boiteVitesseAutomatique = boiteVitesseAutomatique;
	}

	public boolean getBoiteVitesseAutomatique(){
		return boiteVitesseAutomatique;
	}

	/**
	 * 
	 * @param prix
	 */
	public void setPrix(float prix){
		this.prix= prix;
	}

	public float getPrix(){
		return prix;
	}

}