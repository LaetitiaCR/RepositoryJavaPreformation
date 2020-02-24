package com.crm.bo;

import java.util.Date;

/**
 * @author CRM
 *
 */
public class Personne {

	// attributs
	public String surnom;
	// private String surnom1;
	private String nom;
	private String prenom;
	private String[] personnes;

	protected Date dateNaissance;

	public Personne() {
		nom = "";
		prenom = "";
		surnom = "JP";

		System.out.println("Construction d'un objet personne (sans paramètres)");

	}

	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;

		System.out.println("Construction d'un objet personne (avec paramètres)");

	}

	// methodes

	/**
	 * methode qui modifie la valeur de l'attribut nom
	 * 
	 * @param n
	 */
	public void setNom(String n) {
		nom = n;
	}

	/**
	 * Cette méthode renvoie la valeur de l'attribut nom
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * methode qui modifie la valeur de l'attribut prenom
	 * 
	 * @param n
	 */

	public void setPrenom(String p) {
		prenom = p;
	}

	/**
	 * Cette méthode renvoie la valeur de l'attribut prénom
	 * 
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * methode qui modifie la valeur de l'attribut nom
	 * 
	 * @param n
	 */
	public void setPersonnes(String[] p) {
		if (personnes == null) {
			personnes = new String[p.length];
			for (int i = 0; i < p.length; i++) {
				personnes[i] = p[i];

			}
		}
	}

	public String[] getPersonnes() {
		return personnes;
	}

	public void aficheDetailsPersonne() {
		System.out.println(nom + " " + prenom + " " + surnom);
	}

	// surcharge de la methode afficheDetailPersonne
	public void aficheDetailsPersonne(String langues) {
		String pays = "";
		if (langues.equals("Français")) {
			pays = "France : ";

		} else if (langues.equals("Anglais")) {
			pays = "Angleterre : ";

		} else {
			pays = "Italie";
		}
		System.out.println(pays + " " + nom + " " + prenom + " " + surnom);
	}

	public void afichePersonnes() {
		for (int i = 0; i < personnes.length; i++) {
			System.out.println(personnes[i]);
		}
	}

	public boolean isEquals(Personne pers) {
		if (this.prenom.equals(pers.prenom) && this.nom.equals(pers.nom)) {
			return true;
		}
		return false;
	}

}
