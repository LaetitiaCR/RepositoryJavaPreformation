package com.crm.bo;

public class Point {

	private int pointAbscisse;
	
	private int pointOrdonnee;
	
	public Point() {
		pointAbscisse = 0;
	
		pointOrdonnee = 0;
	}
	
	public Point(int pointAbscisse, int pointOrdonnee) {
		
		this.pointAbscisse = pointAbscisse ;
		this.pointOrdonnee = pointOrdonnee;
		setPointAbscisse(pointAbscisse);
		setPointOrdonnee(pointOrdonnee);
	}
	
	private int getPointAbscisse() {
		return pointAbscisse;
	}

	private void setPointAbscisse(int pointAbscisse) {
		this.pointAbscisse = pointAbscisse;
	}

	private int getPointOrdonnee() {
		return pointOrdonnee;
	}

	private void setPointOrdonnee(int pointOrdonnee) {
		this.pointOrdonnee = pointOrdonnee;
	}

	

	public int calculDistance(Point p) {

		int distanceDeuxPoints = (int) Math
				.sqrt(Math.pow((getPointAbscisse() - p.getPointAbscisse()), 2) + Math.pow((getPointOrdonnee() - p.getPointOrdonnee()), 2));
		return distanceDeuxPoints;
	}

	

}
