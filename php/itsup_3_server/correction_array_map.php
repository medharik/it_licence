<?php 
$produit=['libelle'=>'hp dv 6','prix'=>5000,'qtestock'=>90];
// ou $produit=array('libelle'=>'hp dv 6','prix'=>5000);
//sortie : insert into produit (libelle,prix) values(?,?)

$sortie="insert into produit";
$cles=array_keys($produit);//$cles=['libelle','prix']
$cles_str=join(",",$cles);//libelle,prix
// echo $cles_str;
// => [?,?]=>?,?
$intro=array_map(function($v){
    return '?';
},$cles);// $intro =[?,?]
$intro_str=join(",",$intro);//?,?
$sortie.="($cles_str) values ($intro_str)";
echo $sortie;

function generer_insert($nom_table,$data){
    $sortie="insert into $nom_table";
    $cles=array_keys($data);//$cles=['libelle','prix']
    $cles_str=join(",",$cles);//libelle,prix
    // echo $cles_str;
    // => [?,?]=>?,?
    $intro=array_map(function($v){
        return '?';
    },$cles);// $intro =[?,?]
    $intro_str=join(",",$intro);//?,?
    $sortie.="($cles_str) values ($intro_str)";
    return $sortie; 


}

function generer_insert_values(string $nom_table="",array $data=[]){
    $sortie="insert into $nom_table";
    $cles=array_keys($data);//$cles=['libelle','prix']
    $cles_str=join(",",$cles);//libelle,prix
    // echo $cles_str;
    // => [?,?]=>?,?
    $intro=array_map(function($v){
        return "'".$v."'";
    },$data);// $intro =[?,?]
    $intro_str=join(",",$intro);//?,?
    $sortie.="($cles_str) values ($intro_str)";
    return $sortie; 


}

echo "<hr>";
$personne=['nom'=>'MBODJ','prenom'=>'abdoul aziz','age'=>23];
echo generer_insert("personne",$personne);
echo "<hr>";
echo generer_insert_values("voiture",['modele'=>'bmw x3','type'=>'4x4']);




?>