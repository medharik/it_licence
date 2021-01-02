package pac_poo;

public class Produit {
//fields (attributs) // variables d'instance 
	String libelle;
	double prixVente, coutRevient;
	int qteStock;
	final String DEVISE_BASE="$";
	final double TVA =20;
	
	
	
//methods	
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
//sortieStock(int qteSortie)
// getTtc(int qte) : retourne le ttc 
//convertirPrix(tauxChange,NEW_DEVISE)	
// gain()
//gain(int qteVendue)

}
