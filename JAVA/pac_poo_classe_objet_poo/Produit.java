package pac_poo;

public class Produit {
//fields (attributs) // variables d'instance 
	String libelle;
	double prixVente, coutRevient;
	int qteStock;
	final String DEVISE_BASE="$";
	final double TVA =20;
	
	
//les constructeurs : methode (sans type de retour ) permettant d'initialiser 	
//les attributs 
	//appelé par new
//constructeur par defaut 	
 Produit() {
	
}
 //constructeur initialisant les attributs
 Produit(String libelle,double prixVente,int qteStock){
	this.libelle=libelle;
	this.prixVente=prixVente;
	this.qteStock=qteStock;
	 
 }
	
//afficher les attributs
	
	
void	afficher(){
	System.out.println("libelle : "+libelle);
	System.out.println("Prix  : "+prixVente+DEVISE_BASE);
	System.out.println("qteStock : "+qteStock);
//	System.out.println("libelle : "+libelle);
	System.out.println("###################################");

	}
//verifierStock : return true si produit est en stock
boolean verifierStock(){
	
	return qteStock>0;
}
//vendre(int qteAvendre) retourne le ttc d'une vente

	//(si possible, sinon return 0 en affichant un message )
/**
 * @param qteAvendre
 * @return le ttc du produit
 * @since 2020
 * @author HARIK
 */
double vendre(int qteAvendre){
	double ttc=0;
	if(qteStock >= qteAvendre ){
		ttc=qteAvendre*prixVente*(1+TVA/100);
		qteStock -= qteAvendre;// qteStock=qteStock- qteAvendree;
		
	}else{
		System.out.println("Transation impossible car la quantité en stock est insuffisante");
	}
	return ttc;
}
//entreeStock(qteEntree)
// entreeStock(10)
void entreeStock(int qteEntree){
	if(qteEntree>0)
	qteStock+=qteEntree;
}


//sortieStock(int qteSortie)
void sortieStock(int qteSortie){
	if(qteSortie<=qteStock)
	qteStock-=qteSortie;
	else
		System.out.println("Quantite en stock est insuffisante "
				+ "veuillez preciser une qte < "+qteStock);
}
// getTtc(int qte) : retourne le ttc 
 double getTtc(int qte ){
	return qte*prixVente*(1+TVA/100);
	
}
//convertirPrix(tauxChange,NEW_DEVISE)
 String convertirPrix(double tauxChange,String newDevise){
	 double prixDevise=prixVente*tauxChange;
 return prixDevise+newDevise;
 }
// gain()
 double gain(){
	 double gain =prixVente-coutRevient;
	 return gain;
 }
//gain(int qteVendue)
 double gain(int qte){
	 double gain =gain()*qte;
	 return gain;
 }
 
}
