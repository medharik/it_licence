package pac_condition;

import java.util.Scanner;

public class Condition {
public static void main(String[] args) {
	//declaration d'un flux de lecture depuis le clavier  : scanner
	Scanner clavier = new Scanner(System.in);
	System.out.println("Saisir age ");
	int age =clavier.nextInt();
	boolean accepté;
	String sexe;
	int nombreEssai=3;
	do{
	System.out.println("Saisir sexe");
	 sexe=clavier.next();
 accepté=(sexe.equalsIgnoreCase("homme") || sexe.equalsIgnoreCase("femme"));
	if (!accepté) {
		
		System.out.println("Erreur , sexe doit etre homme ou femme, il vous reste "+(--nombreEssai)+" fois");
	if(nombreEssai==0)  {
		System.out.println("Fin du programme");
		return ;
	}
	}
	}while(!accepté);
	//	System.out.println((age>18)? "Majeur":"Mineur"+(sexe.equalsIgnoreCase("homme")? "":"e"));
	boolean majeur=(age>18);
	boolean homme = sexe.equalsIgnoreCase("homme");
	boolean femme = sexe.equalsIgnoreCase("femme");
	String resultat="";
	
	if (majeur && homme ) {
		resultat="Majeur";
	}else if (majeur && femme) {
		resultat="Majeure";
	}else if (!majeur && femme) {
		resultat="Mineure";
	}else if (!majeur && homme) {
		resultat="Mineur";
	}else{
		resultat="Erreur";
	}
	
	System.out.println(resultat);
}
}
