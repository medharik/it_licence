<?php 
include("fonctions.php");
//recuperer les data depuis le form (post)
$libelle=$_POST['libelle'];
$prix=$_POST['prix'];
ajouterProduit($libelle,$prix);
//redirection vers index.php
// header('location:index.php?op=add');
?>