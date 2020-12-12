package s3_tab_boucle_tab_methodes;

public class Matrice {
public static void main(String[] args) {
String produit[][]={
		{"hp dv6","hp dv8"},
		{"dell d7","dell satelite"}};
int t[][]=new int [2][3];
//System.out.println(t[0].length);

for (int i = 0; i < t.length; i++) {//ligne 
	 for (int j = 0; j < t[i].length; j++) {//colonne
		
		 t[i][j]=(int)(Math.random()*10) ;
	}
}

for (int i = 0; i < t.length; i++) {
	for (int j = 0; j < t[i].length; j++) {
		System.out.println(t[i][j]);
	}
}

//for (int i = 0; i < produit.length; i++) {
//	System.out.println(produit[i]);
}
	


}
