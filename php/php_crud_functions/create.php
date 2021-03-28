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
                <form action="store.php" method="post">
                    <div class="mb-3">
                        <label for="libelle" class="form-label">Libelle : </label>
                        <input autocomplete="off" type="text" name="libelle" class="form-control" id="libelle" >
                    </div>
                    <div class="mb-3">
                        <label for="prix" class="form-label">Prix : </label>
                        <input type="text" name="prix" class="form-control" id="prix" >
                    </div>
                   
                    <button type="submit" class="btn btn-primary">Ajouter le produit</button>
                </form>

            </div>

        </div>

    </div>




    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</body>

</html>