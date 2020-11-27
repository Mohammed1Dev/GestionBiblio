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
			System.out.println("------------------Voulez-Vous Manipuler les étudiants taper 1----------------");
			System.out.println("------------------Voulez-Vous Manipuler les employées taper 2----------------");
			System.out.println("------------------Voulez-Vous Manipuler les livres taper 3----------------");
			choix1 = take.nextInt();
			if (choix1 == 1) {
				System.out.println("------------------Vous pouvez maintenant gérer les étudiants----------------");
				System.out.println("\t\t\t\t\t**************Pour Ajouter un étudiant veillez saisie 1*************");
				System.out.println("\t\t\t\t\t**************Pour Modifier un étudiant veillez saisie 2*************");
				System.out.println("\t\t\t\t\t**************Pour Supprimer un étudiant veillez saisie 3*************");
				System.out.println("\t\t\t\t\t**************Pour Afficher la liste des étudiants veillez saisie 4*************");

				choix2 = take.nextInt();
				switch (choix2) {
				case 1:

					System.out.println("Entrer l'identifiant(id) d'étudiant :");
					 id = take.nextInt();
					System.out.println("Entrer le nom d'étudiant :");
					 nom = take.next();
					System.out.println("Entrer le prénom d'étudiant :");
					 prenom = take.next();
					System.out.println("Entrer l'age d'étudiant :");
					 age = take.nextInt();
					System.out.println("Entrer la bourse d'étudiant :");
					 bourse = take.nextFloat();
					
					etd.setId(id);
					etd.setNom(nom);
					etd.setPrenom(prenom);
					etd.setAge(age);
					etd.setBourse(bourse);
					
					option.ajoutEtudiant(etd);
					break;
					
				case 2:
					System.out.println("Entrer l'identifiant(id) d'étudiant à modifier");
					 index = take.nextInt();
					
					 System.out.println("Entrer l'identifiant(id) d'étudiant à nouveau (Modifier)");
					 id = take.nextInt();
					 System.out.println("Entrer le nom d'étudiant à nouveau (Modifier)");
					 nom = take.next();
					 System.out.println("Entrer le prénom d'étudiant à nouveau (Modifier)");
					 prenom = take.next();
					 System.out.println("Entrer l'age d'étudiant à nouveau (Modifier)");
					 age = take.nextInt();
					 System.out.println("Entrer la bourse d'étudiant à nouveau (Modifier)");
					 bourse = take.nextFloat();
					 
					 	etd.setId(id);
						etd.setNom(nom);
						etd.setPrenom(prenom);
						etd.setAge(age);
						etd.setBourse(bourse);
						
					if(option.modifierEtudiant(index, etd)) {
						System.out.println("YES!!étudiant modifier avec succes");
					}else {
						System.out.println("ERROR!!c'est étudiant n'existe pas");
					}
					break;
					
				case 3:
					System.out.println("Entrer l'identifiant(id) d'étudiant à supprimer");
					index = take.nextInt();
					if(option.supprimerEtudiant(index)) {
						System.out.println("YES!!étudiant supprimer avec succes");
					}else {
						System.out.println("ERROR!!c'est étudiant n'existe pas");
					}
					break;
					
				case 4:
					option.affichageEtudiant();
					break;

				default:
					System.out.println("Error!!! Veillez Entrer le caractére Correct 1, 2 , 3 ou 4");
				}

			} else if (choix1 == 2) {
				System.out.println("------------------Vous pouvez maintenant gérer les employées----------------");
				System.out.println("\t\t\t\t\t**************Pour Ajouter un employée veillez saisie 1*************");
				System.out.println("\t\t\t\t\t**************Pour Modifier un employée veillez saisie 2*************");
				System.out.println("\t\t\t\t\t**************Pour Supprimer un employée veillez saisie 3*************");
				System.out.println("\t\t\t\t\t**************Pour Afficher la liste des employées veillez saisie 4*************");
				choix2 = take.nextInt();
				switch (choix2) {
				case 1:

					System.out.println("Entrer l'identifiant(id) d'employee :");
					 id = take.nextInt();
					System.out.println("Entrer le nom d'employee :");
					 nom = take.next();
					System.out.println("Entrer le prénom d'employee :");
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
					System.out.println("Entrer l'identifiant(id) d'employee à modifier");
					 index = take.nextInt();
					
					 System.out.println("Entrer l'identifiant(id) d'employee à nouveau (Modifier)");
					 id = take.nextInt();
					 System.out.println("Entrer le nom d'employee à nouveau (Modifier)");
					 nom = take.next();
					 System.out.println("Entrer le prénom d'employee à nouveau (Modifier)");
					 prenom = take.next();
					 System.out.println("Entrer l'age d'employee à nouveau (Modifier)");
					 age = take.nextInt();
					 System.out.println("Entrer le salaire d'employee à nouveau (Modifier)");
					 salaire = take.nextFloat();
					 
					 	emp.setId(id);
						emp.setNom(nom);
						emp.setPrenom(prenom);
						emp.setAge(age);
						emp.setSalaire(salaire);
						
					if(option.modifierEmployee(index, emp)) {
						System.out.println("Yes!!employée modifier avec succes");
					}else {
						System.out.println("ERROR!!c'est employée n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer l'identifiant(id) d'employee à supprimer");
					index = take.nextInt();
					if(option.supprimerEmployee(index)) {
						System.out.println("YES!!employée supprimer avec succes");
					}else {
						System.out.println("ERROR!!c'est employée n'existe pas");
					}
					break;
				case 4:
					option.affichageEmployee();
					break;

				default:
					System.out.println("Error!!! Veillez Entrer le caractére Correct 1, 2 , 3 ou 4");
				}

			} else if (choix1 == 3) {
				System.out.println("------------------Vous pouvez maintenant gérer les Livres----------------");
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
					System.out.println("Entrer le catégorie du livre :");
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
					System.out.println("Entrer l'identifiant(id) du livre à modifier");
					 index = take.nextInt();
					
					 System.out.println("Entrer l'identifiant(id) du livre à nouveau (Modifier)");
					 id = take.nextInt();
					 System.out.println("Entrer le titre du livre à nouveau (Modifier)");
					 title = take.next();
					 System.out.println("Entrer la catégorie du livre à nouveau (Modifier)");
					 categorie = take.next();
					 System.out.println("Entrer l'auteur du livre à nouveau (Modifier)");
					 auteur = take.next();
					 System.out.println("Entrer la description du livre à nouveau (Modifier)");
					 description = take.next();
					 System.out.println("Entrer le score du livre à nouveau (Modifier)");
					 score = take.nextFloat();
					 
					 	livre.setId(id);
					 	livre.setTitle(title);
					 	livre.setCatego(categorie);
					 	livre.setAuteur(auteur);
					 	livre.setDesc(description);
					 	livre.setRating(score);
						
					if(option.modifierLivre(index, livre)) {
						System.out.println("Yes!!Ce Livre a été modifier avec succes");
					}else {
						System.out.println("ERROR!!c'est un Livre qui n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer l'identifiant(id) du Livre à supprimer");
					index = take.nextInt();
					if(option.supprimerLivre(index)) {
						System.out.println("YES!!Ce Livre a été supprimer avec succes");
					}else {
						System.out.println("ERROR!!c'est employée n'existe pas");
					}
					break;
				case 4:
					option.affichageLivre();
					break;

				default:
					System.out.println("Error!!! Veillez Entrer le caractére Correct 1, 2 , 3 ou 4");
				}
			} else {

				System.out.println("------------------Error!!! Veillez Enter le caractére Correct 1, 2 ou 3----------------");
			} 
			
			System.out.println("Voulez Vous Continuer? y/n");
			keep = take.next();
			
		} while (keep.equalsIgnoreCase("y"));

	}

}
