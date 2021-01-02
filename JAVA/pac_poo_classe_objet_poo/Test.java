package pac_poo;

public class Test {
	
	public static void main(String[] args) {
		//instancier un produit <=>
//construire un objet (hp) de type (classe) Produit
	Produit hp=new Produit("hp dv 6", 4000, 10);
	
	hp.libelle="hp dv 8";
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
