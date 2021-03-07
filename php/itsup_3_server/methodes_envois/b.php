<?php 
// php cree un tabelau $_POST (variable implicite) contenant toutes les donnees nommees 
// dans le form
 var_dump($_POST);
$message="";
if(isset($_POST['nom']) && isset($_POST['age'])){
    if(!empty($_POST['nom']) && !empty($_POST['age'])){
                if(is_numeric($_POST['age'])){
                    $message = $_POST['nom']." a ".$_POST['age'].'ans';

                }else{
                    header("location:a.php?e=age");

                }
    }else{
        header("location:a.php?e=vide");
        
    }
}

else{
    // $message="merci de saisir le nom  et l'age";
    header("location:a.php?e=isset");
}


?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h3><?=$message?></h3>
    
</body>
</html>