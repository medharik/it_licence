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
$tab[]="nasser";
echo "<hr>", $tab[0],$tab[1],"<br>";
print_r($tab);  
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
    
</body>
</html>