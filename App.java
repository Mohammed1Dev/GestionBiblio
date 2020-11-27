package com.CrudBiblioPackage.java;
import java.util.Scanner;



public class App {


	public static void main(String[] args) {
		
		/*Variables de type classe*/
		Etudiant etd = new Etudiant();
		Employee emp = new Employee();
		Livre livre = new Livre();
		
		/*Variables primitif*/
		int index;
		
		int id;
		String nom;
		String prenom;
		int age;
		float bourse;
		float salaire;
		
		String title;
		String categorie;
		String auteur;
		String description;
		float score;
		
		/*Variables de choix utilisateurs ou Admin*/
		int choix1;
		int choix2;
		
		String keep;
		
		Operation option = new Operation();
		
		Scanner take = new Scanner(System.in);
		
		do {
			System.out.println("------------------Voulez-Vous Manipuler les �tudiants taper 1----------------");
			System.out.println("------------------Voulez-Vous Manipuler les employ�es taper 2----------------");
			System.out.println("------------------Voulez-Vous Manipuler les livres taper 3----------------");
			choix1 = take.nextInt();
			if (choix1 == 1) {
				System.out.println("------------------Vous pouvez maintenant g�rer les �tudiants----------------");
				System.out.println("\t\t\t\t\t**************Pour Ajouter un �tudiant veillez saisie 1*************");
				System.out.println("\t\t\t\t\t**************Pour Modifier un �tudiant veillez saisie 2*************");
				System.out.println("\t\t\t\t\t**************Pour Supprimer un �tudiant veillez saisie 3*************");
				System.out.println("\t\t\t\t\t**************Pour Afficher la liste des �tudiants veillez saisie 4*************");

				choix2 = take.nextInt();
				switch (choix2) {
				case 1:

					System.out.println("Entrer l'identifiant(id) d'�tudiant :");
					 id = take.nextInt();
					System.out.println("Entrer le nom d'�tudiant :");
					 nom = take.next();
					System.out.println("Entrer le pr�nom d'�tudiant :");
					 prenom = take.next();
					System.out.println("Entrer l'age d'�tudiant :");
					 age = take.nextInt();
					System.out.println("Entrer la bourse d'�tudiant :");
					 bourse = take.nextFloat();
					
					etd.setId(id);
					etd.setNom(nom);
					etd.setPrenom(prenom);
					etd.setAge(age);
					etd.setBourse(bourse);
					
					option.ajoutEtudiant(etd);
					break;
					
				case 2:
					System.out.println("Entrer l'identifiant(id) d'�tudiant � modifier");
					 index = take.nextInt();
					
					 System.out.println("Entrer l'identifiant(id) d'�tudiant � nouveau (Modifier)");
					 id = take.nextInt();
					 System.out.println("Entrer le nom d'�tudiant � nouveau (Modifier)");
					 nom = take.next();
					 System.out.println("Entrer le pr�nom d'�tudiant � nouveau (Modifier)");
					 prenom = take.next();
					 System.out.println("Entrer l'age d'�tudiant � nouveau (Modifier)");
					 age = take.nextInt();
					 System.out.println("Entrer la bourse d'�tudiant � nouveau (Modifier)");
					 bourse = take.nextFloat();
					 
					 	etd.setId(id);
						etd.setNom(nom);
						etd.setPrenom(prenom);
						etd.setAge(age);
						etd.setBourse(bourse);
						
					if(option.modifierEtudiant(index, etd)) {
						System.out.println("YES!!�tudiant modifier avec succes");
					}else {
						System.out.println("ERROR!!c'est �tudiant n'existe pas");
					}
					break;
					
				case 3:
					System.out.println("Entrer l'identifiant(id) d'�tudiant � supprimer");
					index = take.nextInt();
					if(option.supprimerEtudiant(index)) {
						System.out.println("YES!!�tudiant supprimer avec succes");
					}else {
						System.out.println("ERROR!!c'est �tudiant n'existe pas");
					}
					break;
					
				case 4:
					option.affichageEtudiant();
					break;

				default:
					System.out.println("Error!!! Veillez Entrer le caract�re Correct 1, 2 , 3 ou 4");
				}

			} else if (choix1 == 2) {
				System.out.println("------------------Vous pouvez maintenant g�rer les employ�es----------------");
				System.out.println("\t\t\t\t\t**************Pour Ajouter un employ�e veillez saisie 1*************");
				System.out.println("\t\t\t\t\t**************Pour Modifier un employ�e veillez saisie 2*************");
				System.out.println("\t\t\t\t\t**************Pour Supprimer un employ�e veillez saisie 3*************");
				System.out.println("\t\t\t\t\t**************Pour Afficher la liste des employ�es veillez saisie 4*************");
				choix2 = take.nextInt();
				switch (choix2) {
				case 1:

					System.out.println("Entrer l'identifiant(id) d'employee :");
					 id = take.nextInt();
					System.out.println("Entrer le nom d'employee :");
					 nom = take.next();
					System.out.println("Entrer le pr�nom d'employee :");
					 prenom = take.next();
					System.out.println("Entrer l'age d'employee :");
					 age = take.nextInt();
					System.out.println("Entrer le salaire d'employee :");
					 salaire = take.nextFloat();
					
					emp.setId(id);
					emp.setNom(nom);
					emp.setPrenom(prenom);
					emp.setAge(age);
					emp.setSalaire(salaire);
					
					option.ajoutEmployee(emp);
					break;
				case 2:
					System.out.println("Entrer l'identifiant(id) d'employee � modifier");
					 index = take.nextInt();
					
					 System.out.println("Entrer l'identifiant(id) d'employee � nouveau (Modifier)");
					 id = take.nextInt();
					 System.out.println("Entrer le nom d'employee � nouveau (Modifier)");
					 nom = take.next();
					 System.out.println("Entrer le pr�nom d'employee � nouveau (Modifier)");
					 prenom = take.next();
					 System.out.println("Entrer l'age d'employee � nouveau (Modifier)");
					 age = take.nextInt();
					 System.out.println("Entrer le salaire d'employee � nouveau (Modifier)");
					 salaire = take.nextFloat();
					 
					 	emp.setId(id);
						emp.setNom(nom);
						emp.setPrenom(prenom);
						emp.setAge(age);
						emp.setSalaire(salaire);
						
					if(option.modifierEmployee(index, emp)) {
						System.out.println("Yes!!employ�e modifier avec succes");
					}else {
						System.out.println("ERROR!!c'est employ�e n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer l'identifiant(id) d'employee � supprimer");
					index = take.nextInt();
					if(option.supprimerEmployee(index)) {
						System.out.println("YES!!employ�e supprimer avec succes");
					}else {
						System.out.println("ERROR!!c'est employ�e n'existe pas");
					}
					break;
				case 4:
					option.affichageEmployee();
					break;

				default:
					System.out.println("Error!!! Veillez Entrer le caract�re Correct 1, 2 , 3 ou 4");
				}

			} else if (choix1 == 3) {
				System.out.println("------------------Vous pouvez maintenant g�rer les Livres----------------");
				System.out.println("\t\t\t\t\t**************Pour Ajouter un livre veillez saisie 1*************");
				System.out.println("\t\t\t\t\t**************Pour Modifier un livre veillez saisie 2*************");
				System.out.println("\t\t\t\t\t**************Pour Supprimer un livre veillez saisie 3*************");
				System.out.println("\t\t\t\t\t**************Pour Afficher la liste des livres veillez saisie 4*************");
				choix2 = take.nextInt();
				switch (choix2) {
				case 1:

					System.out.println("Entrer l'identifiant(id) du Livre :");
					 id = take.nextInt();
					System.out.println("Entrer le titre du livre :");
					 title = take.next();
					System.out.println("Entrer le cat�gorie du livre :");
					 categorie = take.next();
					System.out.println("Entrer l'auteur du livre:");
					 auteur = take.next();
					System.out.println("Entrer le description du livre");
					 description = take.next();
					 System.out.println("Entrer le score du livre");
					 score = take.nextFloat();
					
					livre.setId(id);
					livre.setTitle(title);
					livre.setCatego(categorie);
					livre.setAuteur(auteur);
					livre.setDesc(description);
					livre.setRating(score);
					
					option.ajoutLivre(livre);
					break;
				case 2:
					System.out.println("Entrer l'identifiant(id) du livre � modifier");
					 index = take.nextInt();
					
					 System.out.println("Entrer l'identifiant(id) du livre � nouveau (Modifier)");
					 id = take.nextInt();
					 System.out.println("Entrer le titre du livre � nouveau (Modifier)");
					 title = take.next();
					 System.out.println("Entrer la cat�gorie du livre � nouveau (Modifier)");
					 categorie = take.next();
					 System.out.println("Entrer l'auteur du livre � nouveau (Modifier)");
					 auteur = take.next();
					 System.out.println("Entrer la description du livre � nouveau (Modifier)");
					 description = take.next();
					 System.out.println("Entrer le score du livre � nouveau (Modifier)");
					 score = take.nextFloat();
					 
					 	livre.setId(id);
					 	livre.setTitle(title);
					 	livre.setCatego(categorie);
					 	livre.setAuteur(auteur);
					 	livre.setDesc(description);
					 	livre.setRating(score);
						
					if(option.modifierLivre(index, livre)) {
						System.out.println("Yes!!Ce Livre a �t� modifier avec succes");
					}else {
						System.out.println("ERROR!!c'est un Livre qui n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer l'identifiant(id) du Livre � supprimer");
					index = take.nextInt();
					if(option.supprimerLivre(index)) {
						System.out.println("YES!!Ce Livre a �t� supprimer avec succes");
					}else {
						System.out.println("ERROR!!c'est employ�e n'existe pas");
					}
					break;
				case 4:
					option.affichageLivre();
					break;

				default:
					System.out.println("Error!!! Veillez Entrer le caract�re Correct 1, 2 , 3 ou 4");
				}
			} else {

				System.out.println("------------------Error!!! Veillez Enter le caract�re Correct 1, 2 ou 3----------------");
			} 
			
			System.out.println("Voulez Vous Continuer? y/n");
			keep = take.next();
			
		} while (keep.equalsIgnoreCase("y"));

	}

}
