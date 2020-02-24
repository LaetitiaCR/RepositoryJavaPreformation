package com.crm.boapp.utilitaires;

import java.util.Scanner;

public class ScannerConsole {

	private Scanner scan;
	
	private String entreeClavierTableau[];
	
	public void scannerCreation(){
		scan = new Scanner(System.in);
	}
	

	public String scannerAfficheEtLectureConsole(String question){
		System.out.println(question);
		String entreeClavierPhrase = scan.next();
		return entreeClavierPhrase;
	}
	
	public String [] scannerAfficheEtLectureConsole(String [] questions){
		
		entreeClavierTableau = new String [questions.length];
		
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i]);
			entreeClavierTableau[i] = scan.next();
		}
		return entreeClavierTableau;
	}
	
	
	
	
	
	public void ScannerClose(){
		scan.close();
	}
	
	
}
