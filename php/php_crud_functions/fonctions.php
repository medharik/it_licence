<?php 
function connecter_db(){
try{
$options=[PDO::ATTR_ERRMODE=>PDO::ERRMODE_EXCEPTION];
$cnx = new PDO('mysql:host=localhost;dbname=db_crud', "root", "",$options);  
return $cnx;
}catch(PDOException $e){
echo "Erreur de connexion ".$e->getMessage();
}

}

//  ajouterProduit("hp",);
function ajouterProduit($libelle,$prix=0){
    try{
      $cnx=connecter_db();
$rp=$cnx->prepare("insert into produit(libelle,prix) values(?,?)");
$rp->execute([$libelle,$prix]);   
}catch(PDOException $e){
        echo "Erreur d'ajout du produit $libelle ".$e->getMessage();
}
    
}
function modifierProduit($libelle,$prix=0,$id){
    try{
     $cnx=connecter_db();
$rp=$cnx->prepare("update produit set libelle=? , prix=? where id=?");
//lancer la requete 
$rp->execute([$libelle,$prix,$id]);   
    }catch(PDOException $e){
        echo "Erreur de modification du produit $libelle ".$e->getMessage();
    }
    
}
function supprimerProduit($id){
    try{
       $cnx=connecter_db();
$rp=$cnx->prepare("delete from produit where id=?");
//lancer la requete 
$rp->execute([$id]); 
    }catch(PDOException $e){
        echo "Erreur de suppression du produit $id ".$e->getMessage();
            }

}
function all(){
    try{
        $cnx=connecter_db();
        $rp=$cnx->prepare("select * from produit");
        $rp->execute([]);
        $resultat=$rp->fetchAll(PDO::FETCH_ASSOC);
        return $resultat;
        
    }catch(PDOException $e){
        echo "Erreur de selection  des  produits ".$e->getMessage();
    }
}

function find($id){
    try{
    $cnx=connecter_db();
    $rp=$cnx->prepare("select * from produit where id=?");
    $rp->execute([$id]);
    $resultat=$rp->fetch(PDO::FETCH_ASSOC);
    return $resultat;
    
}catch(PDOException $e){
    echo "Erreur de selection  des  produits ".$e->getMessage();
}
}
