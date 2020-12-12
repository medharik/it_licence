package s3_tab_boucle_tab_methodes;

import java.util.Scanner;

public class Methodes {

	static  String observation(double note){
		String resultat="";
		 if(note<8){
			 resultat="MODULE NON VALIDE";
		}else if(note<10){
			 resultat="RATTRAPAGE";

		}else{
			resultat="MODULE VALIDE";
		}
		 
		
		return resultat;
	}
	
	public static void main(String[] args) {
	Scanner clavier=new Scanner(System.in);
	System.out.println("Veuillez saisir le nombre de matieres ");
	int nombreMatiere=clavier.nextInt();
	String matiere[]=new String [nombreMatiere];
	final double MAX_COEF=5,MIN_COEF=1;
	
	int coef[]=new int[matiere.length];
	double note[]=new double[matiere.length];
	//peupler les noms des matieres 
	for (int i = 0; i < note.length; i++) {
		System.out.println("Saisir le nom de la matiere numero "+(i+1));
		matiere[i]=clavier.next();
		boolean coefCorrect;
		do{
			System.out.println("entrer son coefficient ");
			coef[i]=clavier.nextInt();
			 coefCorrect= coef[i]<=MAX_COEF && coef[i]>=MIN_COEF ;
			if (!coefCorrect) {
				System.out.println(" coeficient incorrect , il doit etre entre  "+MIN_COEF+" et "+MAX_COEF);
			}
		}while(!coefCorrect);
		
		
	}
	//peupler les notes des matieres 
	boolean noteCorrect=false;
	for (int i = 0; i < note.length; i++) {
		do{
				System.out.println("Entrer la note de : "+matiere[i]);
				note[i]=clavier.nextDouble();
				noteCorrect=note[i]>=0 && note[i]<=20;
				if (!noteCorrect) {
					System.out.println("note incorrecte");
				}
		}while(!noteCorrect);
	}
	// calcul de la moyenne generale 
	double sommeNoteCoef=0, sommeCoef=0;
	for (int i = 0; i < note.length; i++) {
	  sommeCoef+=coef[i];
	  sommeNoteCoef+=note[i]*coef[i];
	  
	}
	double moyenne =sommeNoteCoef/sommeCoef;
	System.out.println(" la moyenne generale est : "+moyenne);
	
	String r=observation(moyenne);
	System.out.println(r);
;	
	
	
}
}
