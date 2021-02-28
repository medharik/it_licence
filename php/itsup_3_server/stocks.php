<?php 
$stock=[
    ['id'=>1,'libelle'=>'hp dv 7','prix'=>9000,'image'=>'images/hp.jfif'],
    ['id'=>2,'libelle'=>'dell s 4','prix'=>4000,'image'=>'images/dell.webp']
];
$images=['images/hp.jfif','images/dell.webp'];
//
for($i=0;$i<100;$i++){
$stock[]=['id'=>$i+3,'libelle'=>"produit ".$i,'prix'=>random_int(2000,6000),'image'=>$images[random_int(0,1)]];
}

// afficher le libelle du premier produit dans le tableau stock
echo $stock[0]['libelle']."<br>";//hp dv 7
echo count($stock)."<br>";//2
echo count($stock[1]);//4
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="row">
<?php foreach($stock as $c=>$v) {?>
<div class="card col-6   col-md-4  col-lg-3   shadow" >
  <img src="<?=$v['image']?>" width="200" height="200" class="card-img-top" style="object-fit: contain;">
  <div class="card-body">
    <h5 class="card-title"><?=$v['libelle']?></h5>
    <p class="card-text"><?=$v['prix']?>DHS</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
<?php }?>
</div>

<hr>

<table class="table table-striped">
   <thead>
    <tr>
        <th>ID</th>
        <th>LIBELLE</th>
        <th>PRIX</th>
        <th>PHOTO</th>
    </tr>
   </thead>
   <!-- tbody>tr>td*4 -->
   <tbody>
   <?php foreach ($stock as $c => $v) {?>
       <tr>
           <td><?=$v['id']?></td>
           <td><?=$v['libelle']?></td>
           <td><?=$v['prix']?></td>
           <td><img src="<?=$v['image']?>" width="200"></td>
       </tr>
       <?php }?>
   </tbody>
</table>
</div>
    
</body>
</html>