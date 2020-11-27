package com.CrudBiblioPackage.java;

import java.util.ArrayList;

public class Operation {
	
	private ArrayList<Etudiant> etudiant;
	private ArrayList<Employee> employe;
	private ArrayList<Livre> livre;

	

	public Operation() {
		
		this.etudiant = new ArrayList<Etudiant>();
		this.employe = new ArrayList<Employee>();
		this.livre = new ArrayList<Livre>();
	}
	
	/******************************/
	/** Manipulation d'étudiant  **/
	/******************************/
	public void ajoutEtudiant(Etudiant etd) {
		this.etudiant.add(etd);
	}
	
	public boolean modifierEtudiant(int index, Etudiant etd) {
		
		boolean status = false;
		for(int i = 0; i < this.etudiant.size(); i++) {
			if(this.etudiant.get(i) != null) {
				if(this.etudiant.get(i).getId() == index) {
					this.etudiant.set(i, etd);
					status = true;
				}
			}
		}
		return status;
	}
	
	public boolean supprimerEtudiant(int index) {
		
		boolean status = false;
		for(int i = 0; i < this.etudiant.size(); i++) {
			if(this.etudiant.get(i) != null) {
				if(this.etudiant.get(i).getId() == index) {
					this.etudiant.remove(i);
					status = true;
				}
			}
		}
		return status;
	}
	
	public String affichageEtudiant() {
		
		String result = "";
		
		for(int i = 0; i < this.etudiant.size(); i++) {
			
			if(this.etudiant.get(i) != null) {
				result = "--------------------------------------------------------------------------------------------------------------\n"+this.etudiant.toString();
			}else {
				result = "la liste s'étudiants est vide vellier la pemplire s'il vous plait.!!!";
			}
		}
		
		return result;
	}
	
	/******************************/
	/** Manipulation d'employée  **/
	/******************************/
	
	public void ajoutEmployee(Employee emp) {
		this.employe.add(emp);
	}
	
	public boolean modifierEmployee(int index, Employee emp) {
		
		boolean status = false;
		for(int i = 0; i < this.employe.size(); i++) {
			if(this.employe.get(i) != null) {
				if(this.employe.get(i).getId() == index) {
					this.employe.set(i, emp);
					status = true;
				}
			}
		}
		return status;
	}
	
	public boolean supprimerEmployee(int index) {
		
		boolean status = false;
		for(int i = 0; i < this.employe.size(); i++) {
			if(this.employe.get(i) != null) {
				if(this.employe.get(i).getId() == index) {
					this.employe.remove(i);
					status = true;
				}
			}
		}
		return status;
	}
	
	public String affichageEmployee() {
		
		String result = "";
		
		for(int i = 0; i < this.employe.size(); i++) {
			
			if(this.employe.get(i) != null) {
				result = "--------------------------------------------------------------------------------------------------------------\n"+this.employe.toString();
			}else {
				result = "la liste s'étudiants est vide vellier la pemplire s'il vous plait.!!!";
			}
		}
		
		return result;
	}
	
	/******************************/
	/** Manipulation des Livres  **/
	/******************************/
	public void ajoutLivre(Livre liv) {
		this.livre.add(liv);
	}
	
	public boolean modifierLivre(int index, Livre liv) {
		
		boolean status = false;
		for(int i = 0; i < this.livre.size(); i++) {
			if(this.livre.get(i) != null) {
				if(this.livre.get(i).getId() == index) {
					this.livre.set(i, liv);
					status = true;
				}
			}
		}
		return status;
	}
	
	public boolean supprimerLivre(int index) {
		
		boolean status = false;
		for(int i = 0; i < this.livre.size(); i++) {
			if(this.livre.get(i) != null) {
				if(this.livre.get(i).getId() == index) {
					this.livre.remove(i);
					status = true;
				}
			}
		}
		return status;
	}
	
	
	public String affichageLivre() {
		
		String result = "";
		
		for(int i = 0; i < this.livre.size(); i++) {
			
			if(this.livre.get(i) != null) {
				result = "--------------------------------------------------------------------------------------------------------------\n"+this.livre.toString();
			}else {
				result = "la liste s'étudiants est vide vellier la pemplire s'il vous plait.!!!";
			}
		}
		
		return result;
	}
	
	

}
