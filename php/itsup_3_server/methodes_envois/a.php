<?php 
$message="";
$classe="d-none";
if(isset($_GET['e'])){
$classe="d-block";
    if($_GET['e']==='isset'){
        $message= "Erreur isset";
    }else
    if($_GET['e']==='vide'){
        $message= "Tous les champs sont requis ";
    }else if($_GET['e']=='age'){
$message="Age doit etre numerique";
    }
}
// $x="0.0";

//vide : false,null,"",0,0.0, empty,[] (equivalent)
//autres : true
if(isset($x) && $x){
echo "condition vraie";
}
if(isset($x)){
    echo  "x exist";
    echo $x;
}else{
    echo "x n'existe pas";
}
echo "<br>";
if(isset($x) && empty($x)){
    echo  "x vide";
    echo $x;
}else{
    echo "x n'est pas vide";
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>A</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row d-flex " style="height: 100vh;">
        <div class="col-md-6 shadow p-2 m-auto ">
        <div class="alert alert-danger  <?=$classe?>">
            <?=$message?>
        </div>
        <form action="b.php" method="post">
        <div class="mb-3">
            <label for="nom" class="form-label">Nom : </label>
            <input type="text" name="nom" class="form-control" id="nom" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age : </label>
            <input type="number" name="age" required class="form-control" id="age" aria-describedby="emailHelp">
        </div>
        
        <div class="mb-3 text-center">
        <button class="btn btn-primary col-md-6">Valider</button>
        </div>
        </form>
        </div>
    </div>

</div>
    
</body>
</html>