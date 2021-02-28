<?php 
include "functions.php";
$data=['libelle'=>'hp dv 5','prix'=>8000,'qte'=>20];//tableau associatif
//afficher le contenu de ce tableau
foreach($data as $k=>$v){
    echo "<p>$k est $v </p>";
    
}
//creer un tableau indexe  contenant les cles et un autre ne contenant que la valeur 
$cles=[];
$valeurs =[];
foreach ($data as $c => $v) {
    $cles[]=$c;  
  $valeurs[]=$v;  
}
//test 
// print_r( $cles);
// print_r($valeurs);
$keys=array_keys($data);
$values=array_values($data);
// print_r($keys);
$clesTab=cles_tab($data);
$vals=values_tab($data);
// print_r($clesTab);
//creer un programme php  permettant de creer un tableau contenant la longueur des valeurs du tabelau data
// $data=['libelle'=>'hp dv 5','prix'=>8000,'qte'=>20]=> [6,4,2]
$fct=function($v){return strlen($v);};
$longeurs=array_map($fct,$data);
$lg=array_values($longeurs);
print_r($lg);
// 

$sql=generer_insert("produit",$data);
echo $sql;


?>