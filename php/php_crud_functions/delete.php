<?php 
include("fonctions.php");
//recuperer l'id du lien (get)
$id=(int)$_GET['id']; 
supprimerProduit($id);
header('location:index.php?op=del');

?>