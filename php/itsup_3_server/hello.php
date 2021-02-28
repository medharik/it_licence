<?php 
//variables 
$nom = 'Ali';
$age=19;
$genre="homme";
$politesse=($genre=="homme")?"Mr.":"Mme.";
$color=($genre=="homme")?"":"pink";

var_dump($nom,$age);
if($age==true){
echo "Age est $age ANS ";
}
$eqage=(bool)(1===true);
echo "En boolean : $eqage";
// echo  "age est $age","<br>",$age,$nom;
// print "age est $age";

//0,"",'',0.0,[],array(),null   <=> false
//tableau indexé (numerote de 0)
$tab=[1,"test",4,6,9]; 
$tab[]="nasser";//push
echo "<hr>", $tab[0],$tab[1],"<br>";
// print_r($tab); 
// les tableaux associatifs  (hash)
$produit=['libelle'=>'hp dv6','prix'=>8000,'qte'=>80];//key => value
echo $produit['libelle'];
echo $produit[0];//undefined offset
$produit['marque']='HP';
$produit[]=200;
$produit[3]=200;
$produit[]=200;
print_r($produit);

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>first php  page </title>
</head>
<body style="background:<?=($genre==='homme')? '':'pink'?>"  >
<ul>
    <li><?php echo "<h3 style='color:red'>nom est $nom, age est $age ans </h3><br>";?></li>
    <li><?php echo 'nom est $nom, age est $age ans <br>';?> <br></li>
    <li><?php echo 'nom est '.$nom.', age est '.$age.' ans <br>';?> <br></li>
    <li style="color:green">Nom est <?= $nom?>, age est <?php  echo $age?></li>
    
</ul>

<h2>les nombres paires</h2>
<table border="1">
    <tr>
        <td>INDICE</td>
        <td>VALEUR</td>
    </tr>
    <?php for($i=0;$i<count($tab);$i++){  ?>
            
            <?php if(is_numeric($tab[$i]) && $tab[$i]%2==0) {?>
            <tr style="background:<?=($i%2==1)? 'grey':'white' ?>">
                <td ><?=$i?></td>
                <td><?=$tab[$i]?></td>
            </tr>
            <?php }?>

    <?php } ?>

</table>
<h2>parcourir un tableau associatif par for</h2>
<hr>
<table>
    <tr>
        <td>CLE</td>
        <td>VALEUR</td>
    </tr>
<?php 
$cles=array_keys($produit);
;for($i=0;$i<count($produit);$i++){?>
    <tr>
        <td><?=$cles[$i];?></td>
        <td><?=$produit[$cles[$i]]?></td>
    </tr>
<?php } ?>
</table>
<h2>parcourir un tableau associatif par foreach</h2>
<hr>
<table border="1">
    <tr>
        <td>CLE</td>
        <td>VALEUR</td>
    </tr>
<?php 
// $cles=array_keys($produit);
foreach($produit as $key => $value){?>
    <tr>
        <td><?=$key;?></td>
        <td><?=$value?></td>
    </tr>
<?php } ?>
</table>
<h2>OU ....</h2>
<?php 
//fonction anonyme (closure) (lambda)
$items=function($v){
return "<li>$v</li>";
};
$resultat=array_map($items,$produit);
// echo "resutat 0 est ".$resultat['libelle'];
// print_r($resultat);
$listes=join(" ",$resultat);
// print_r($resultat);
?>
<ul>
<?=$listes?>
</ul>
<hr>
<table border="1">
    <tr>
        <td>CLE</td>
        <td>VALEUR</td>
    </tr>
<?php 
// $cles=array_keys($produit);
foreach($produit as $key => $value){?>
    <tr>
        <td><?=$key;?></td>
        <td><?=$value?></td>
    </tr>
<?php } ?>
</table>
    
</body>
</html>