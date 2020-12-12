package s3_tab_boucle_tab_methodes;

import java.util.Arrays;
import java.util.Scanner;

public class Methodes2 {
static Scanner clavier =new Scanner(System.in);
	public static void main(String[] args) {
	
	//saisir le nombre de matieres : nm 
	int nm=	saisirNombreMatiere();
	clavier.nextLine();
	System.out.println("nm est "+nm);
	//saisir nm matieres et nm coeficients 
	String matieres[]=saisirMatiere(nm);
//	System.out.println(Arrays.asList(matieres));
	for (int i = 0; i < matieres.length; i++) {
		System.out.println(matieres[i]);
	}
	
	// saisir coeficients 
	double coef[]=saisirCoeficient(matieres);
	//saisir les notes par matieres 
		double note[]=saisirNotes(matieres);
	//calcul de la moyenne generale
	double moyenne=calculMoyenneGenerale(note,coef);
	System.out.println("la moyenne est "+moyenne);
	observation(moyenne);

	
}

private static double[] saisirCoeficient(String[] matieres) {
	double []coef=new double[matieres.length];
		 for (int i = 0; i < matieres.length; i++) {
			System.out.println("Entrer le coeficient de la matiere "+matieres[i]);
		coef[i]=clavier.nextDouble();
				
		 }
		return coef;
	}

private static double[] saisirNotes(String[] matieres) {
	double []note=new double[matieres.length];
	 for (int i = 0; i < matieres.length; i++) {
		System.out.println("Entrer la note de la matiere "+matieres[i]);
		note[i]=clavier.nextDouble();
			
	 }
	return note;
	}

private static void observation(double moyenne) {
if (moyenne >=10) {
	System.out.println("Reussite");
} else {
System.out.println("Echec");
}
	
}

private static double calculMoyenneGenerale(double[] note, double[] coef) {
double sommeCoef=0,sommeNoteFoisCoef=0;
for (int i = 0; i < coef.length; i++) {
	sommeCoef+=coef[i];
	sommeNoteFoisCoef += note[i]* coef[i];
	
}

	return (sommeNoteFoisCoef/sommeCoef);
}



private static String [] saisirMatiere(int nm) {
	String [] matiere  =new String[nm];
	for (int i = 0; i < nm; i++) {
	System.out.println("Entrer le nom de la matiere numero "+(i+1));
	 matiere[i]=clavier.nextLine();
	
	}
	
	return matiere;
}

private static int saisirNombreMatiere() {
	int n=0;
	do{
		System.out.println("Entrer le nombre de matieres : ");
		 n=clavier.nextInt();
		 if (n<0) {
			System.out.println("Erreur :veuiilez saisir un nombre >0");
		}
	}while(n<0);
	
	
	return n;
}
	
	
}
