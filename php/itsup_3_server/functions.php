<?php 

function cles_tab  ($tab = [] ) {
$cles=[];
foreach ($tab as $k => $v) {
   $cles[]=$k;
}

    return $cles ;
}
function values_tab  ($tab ) {
$vals=[];
foreach ($tab as $k => $v) {
   $vals[]=$v;
}

    return $vals ;
}

// editer en php, une fonction permettant selon un tableau de donnees et ble nom d'une table (base de donnees)
// de generer une requete sql de type insert 
// exemple :
// Entree :
//table = personne
// $data =['nom'=>'ali','age=>20]
//=> sortie :   insert into personne (nom,age) values ('ali',20)
function generer_insert($table="",$data=[]){

 
    $cles=  array_keys($data);//['nom','age']
    $clesStr=join(",",$cles);// ['nom','age']=> nom,age
    $values=array_values($data);//['ali',20]
    $valuesStr=join(',',$values);//ali,20
    ////["ali",20] => =>["'ali'",20]
   $valeurApo= array_map(function($v){
        if(is_numeric($v)) return $v;
        else return "'".$v."'";
    }, $values);//['ali',20]
   $valuesStr=join(",",$valeurApo);//'ali',20
   
    $sql="insert into $table  ($clesStr) values ($valuesStr)";
    return $sql;
}


// $sql=generer_insert("produit",['libelle'=>'hp'])

?>