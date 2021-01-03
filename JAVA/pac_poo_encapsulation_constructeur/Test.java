package pac_poo;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		//instancier un produit <=>
//construire un objet (hp) de type (classe) Produit
	Produit hp=new Produit("hp dv 6", 4000, 10);
	Produit dell =new Produit("dell d4", 30000, 10);
Produit dell2=new Produit(dell);
//hp.prixVente=-90;//acces directe à l'attributs=> risque d'incoherence (integrité)
hp.setPrixVente(-100);
try {
	hp.setCoutRevient(-1000);
	System.out.println("la suite ...");
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("ERREUR "+e.getMessage());
}
try {
	hp.setCoutRevient(-100);
} catch (Exception e) {
	// TODO Auto-generated catch block
	JOptionPane.showMessageDialog(null, e.getMessage());
}
System.out.println("le gain est "+hp.gain());

	Produit p=new Produit();
//	hp.libelle="hp dv 8";
//	hp.prixVente=500;
//	hp.coutRevient=400;
//	hp.qteStock=20;
//	hp.DEVISE_BASE="test";
	hp.afficher();
	double ttc = hp.vendre(100);
	if(ttc!=0){
		System.out.println("le ttc est "+ttc+hp.DEVISE_BASE);
	}
	hp.afficher();
	System.out.println("le prix en euro est "+hp.convertirPrix(0.9, "€"));
System.out.println("le gain  / hp "+hp.gain(10)+hp.DEVISE_BASE)
;
hp.entreeStock(150);
hp.afficher();
hp.sortieStock(190);
hp.afficher();
	}
}
