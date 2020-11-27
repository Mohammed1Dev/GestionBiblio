/**
 * 
 */
package com.CrudBiblioPackage.java;


public class Personne {
	
		private int id;
		private String nom;
		private String prenom;
		private int age;
	
	
	public Personne() {}
	public Personne(int id, String nm,String pr, int ag) {
		
		this.id =id;
		this.nom = nm;
		this.prenom = pr;
		this.age = ag;
	}
	
	/** Getters & Setters **/
	
	/*Setters*/
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nm) {
		
		this.nom = nm;
	}
	public void setPrenom(String  pr) {
		
		this.prenom = pr;
	}
	public void setAge(int  ag) {
		
		this.age = ag;
	}
	
	/* Getters */
	public int getId() {
		return this.id;
	}
	public String getNom() {
		
		return nom;
	}
	public String getPrenom() {
		
		return prenom;
	}
	public int getAge() {
		
		return age;
	}
	
	/** Affichage **/
	@Override
	public String toString() {
		return "|"+this.id+"||"+this.nom+"||"+this.prenom+"||"+this.age+"|";
	}


}
