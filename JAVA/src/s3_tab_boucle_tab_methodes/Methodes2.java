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
	//saisir les notes par matieres 
	double note[]=saisirNotes(matieres,nm);
	//calcul de la moyenne generale
	double moyenne=calculMoyenneGenerale(note);
	
	observation(moyenne);

	
}

private static double[] saisirNotes(String[] matieres, int nm) {
		// TODO Auto-generated method stub
		return null;
	}

private static void observation(double moyenne) {
	// TODO Auto-generated method stub
	
}

private static double calculMoyenneGenerale(double[] note) {
	// TODO Auto-generated method stub
	return 0;
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
