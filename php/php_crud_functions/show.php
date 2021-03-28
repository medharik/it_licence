<?php 
include("fonctions.php");
//recuperer l'id du lien (get)
$id=(int)$_GET['id']; 
$ligne=find($id);
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nouveau produit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>

<body>
<?php include ("menu.php"); ?>

    <div class="container">
        <div class="row">
            <div class="col-md-6 border mx-auto mt-5 p-2">
            <div class="card">
  <img src="http://placeimg.com/640/360/any" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><?=$ligne['libelle']?></h5>
    <p class="card-text"><?=$ligne['prix']?>$</p>
    <a href="#" onclick="history.go(-1)" class="btn btn-primary">Retour</a>
  </div>
</div>

            </div>

        </div>

    </div>




    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</body>

</html>