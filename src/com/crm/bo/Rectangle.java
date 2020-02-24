package com.crm.bo;

public class Rectangle {

	private int longueur;
	private int largeur;
	public String uniteMesure;

	public Rectangle(int longueur, int largeur) {

		this.longueur = longueur;
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int aireRectangle() {
		int aireRectangle = longueur * largeur;
		return aireRectangle;
	}

	public int perimetreRectangle() {
		int perimetreRectangle = (longueur + largeur) / 2;
		return perimetreRectangle;
	}

	public String perimetreRectangle(String uniteMesure) {

		this.uniteMesure = uniteMesure;
		int perimetreRectangle = (longueur + largeur) / 2;
		return perimetreRectangle + uniteMesure;
	}

	public void afficherDetailsRectangle() {
		System.out.println("La largeur est : " + largeur);
		System.out.println("La longueur est : " + longueur);

	}

}
