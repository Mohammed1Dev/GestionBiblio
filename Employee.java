package com.CrudBiblioPackage.java;

public class Employee extends Personne{
	
	private float salaire;

	public Employee() {}
	public Employee(int id, String nom, String prenom, int age, float salaire) {
		// TODO Auto-generated constructor stub
		super(id, nom, prenom, age);
		this.salaire = salaire;
	}
	
	/** Getters & Setters **/
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public float getSalaire() {
		return this.salaire;
	}
	
	/* Affichage */
	@Override
	public String toString() {
		
		return super.toString()+"||"+this.salaire;
	}
	
}
