<?php 
include("fonctions.php");
//recuperer les data depuis le form (post)
$libelle=$_POST['libelle'];
$prix=$_POST['prix'];
$id=$_POST['id'];
modifierProduit($libelle,$prix,$id);
header('location:index.php?op=upd');
?>