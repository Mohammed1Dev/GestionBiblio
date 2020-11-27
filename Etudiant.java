package com.CrudBiblioPackage.java;

public class Etudiant extends Personne{
	
	private float bourse;

	
	public Etudiant() {}
	
	public Etudiant(int id, String nom, String prenom, int age, float bourse) {
		
		super(id, nom, prenom, age);
		this.bourse = bourse;
	}
	
	/** Getters and Setters **/
	public void setBourse(float bourse) {
		this.bourse = bourse;
	}
	public float getBourse() {
		return this.bourse;
	}

	/* Affichage */
	@Override
	public String toString() {
		
		return super.toString()+"||"+this.bourse;
	}
	
}
