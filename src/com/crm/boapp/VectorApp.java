package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Personne;

public class VectorApp {

	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector groupe = new Vector();
		
		Personne michael = new Personne("Michael", "Jordan");
		Personne lebron = new Personne("Lebron", "James");
		
		groupe.addElement(michael);
		groupe.addElement(lebron);
		
		Personne unBasketteur1 = (Personne) groupe.get(0);
		System.out.println(unBasketteur1.getNom());
		
		System.out.println("Mon équipe a : " + groupe.size() + "joueurs");
		
		Personne kobe = new Personne("Kobe", "Bryant");
		groupe.addElement(kobe);
		
		System.out.println("Le joueur Lebron James est à la " + (groupe.indexOf(lebron) + 1) + " position");
		
		lebron.surnom = "The king";
		Personne lebronModif = (Personne)groupe.get(1);
		System.out.println("Le surnom de LebronModif est : " + lebronModif.surnom);
		
	}

}
