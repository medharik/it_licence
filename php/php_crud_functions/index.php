<?php
include("fonctions.php");
$message = "";
$classe = "d-none";
//verifier s'il y a op dans le lien
if (isset($_GET['op'])) {

    if ($_GET['op'] == 'add') {
        $message = "Ajout effectué avec succes";
        $classe = "d-block";
    }

    if ($_GET['op'] == 'del') {
        $message = "Suppression effectuée avec succes";
        $classe = "d-block alert-danger";
    }
    if ($_GET['op'] == 'upd') {
        $message = "Modification effectuée avec succes";
        $classe = "d-block alert-warning";
    }
}
$resultat=all();

?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des produits</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

</head>

<body>
    <?php include("menu.php"); ?>
    <div class="container">
        <div class="alert alert-info <?= $classe ?>">
            <?= $message ?>
        </div>
    </div>

    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Libelle</th>
                    <th scope="col">prix</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach ($resultat  as $ligne) { ?>
                    <tr>
                        <th scope="row"><?= $ligne['id'] ?></th>
                        <td><?= $ligne['libelle'] ?> </td>
                        <td><?= $ligne['prix'] ?></td>
                        <td>
                            <a onclick="return confirm('supprimer?')" href="delete.php?id=<?= $ligne['id'] ?>" class="btn btn-danger">S</a>
                            <a href="show.php?id=<?= $ligne['id'] ?>" class="btn btn-primary">C</a>
                            <a href="edit.php?id=<?= $ligne['id'] ?>" class="btn btn-warning">M</a>
                        </td>
                    </tr>
                <?php  } ?>


            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

</body>

</html>