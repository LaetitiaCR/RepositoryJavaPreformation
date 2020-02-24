package com.crm.boapp;

import com.crm.bo.Point;

public class PointApp {

	public static void main(String[] args) {

		int pointAbscisse = 40;
		
		int pointOrdonnee = 40;

		Point pt1 = new Point(pointAbscisse, pointOrdonnee);
		
		pointAbscisse = 20;
		
		pointOrdonnee = 30;
		
		Point pt2 = new Point(pointAbscisse, pointOrdonnee);
		
		System.out.println(pt1.calculDistance(pt2));

	
	}

}
