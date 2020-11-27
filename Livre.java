package com.CrudBiblioPackage.java;

public class Livre {
	
	private int id;
	private String Title;
	private String Categorie;
	private String Auteur;
	private String Description;
	private float Rating;
	

	public Livre() {}
	public Livre(int id, String title, String catego, String auteur, String desc, float rate) {
		
		this.id = id;
		this.Title = title;
		this.Categorie = catego;
		this.Auteur = auteur;
		this.Description = desc;
		this.Rating = rate;
	}
	
	
	/** Setters & Getters **/
	
	/*Setters*/
	public void setId(int id) {
		
		this.id = id;
	}
	public void setTitle(String title) {
		
		this.Title = title;
	}
	public void setCatego(String  catego) {
		
		this.Categorie = catego;
	}
	public void setAuteur(String  auteur) {
		
		this.Auteur = auteur;
	}
	public void setDesc(String  desc) {
		
		this.Description = desc;
	}
	public void setRating(float  rate) {
		
		this.Rating = rate;
	}
	
	/*Getters*/
	public int getId() {
		
		return this.id;
	}
	public String getTitle() {
		
		return this.Title;
	}
	public String getCatego() {
		
		return this.Categorie;
	}
	public String getAuteur() {
		
		return this.Auteur;
	}
	public String getDesc() {
		
		return this.Description;
	}
	public float getRating() {
		
		return this.Rating;
	}
	
	/** Affichage **/
	@Override
	public String toString() {
		return "||"+this.id+"||"+this.Title+"||"+this.Auteur+"||"+this.Categorie+"||"+this.Description+"||"+this.Rating+"||";
	}

}
