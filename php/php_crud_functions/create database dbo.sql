-- create database dbo

CREATE TABLE produit(
id INT PRIMARY  KEY AUTO_INCREMENT,
libelle VARCHAR(20) NOT NULL ,
prix float,
qtestock INT DEFAULT 0
)


-- inserer (ajouter) un nouveau produit (record, enregistrement , ligne)

-- INSERT INTO produit (libelle,prix,qtestock) VALUES ('hp dv 5',5000,20)

SELECT * FROM produit 

CREATE DATABASE dbo1
-- creer une table 

CREATE TABLE employee (
id INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(20),
prenom VARCHAR(20),
salaire FLOAT 
)

DESCRIBE employee 
-- ajouter des employes 
 INSERT INTO employee(salaire,prenom,nom) VALUES (11000,'REDA','CHHAB')
-- afficher la liste des employes : 
SELECT * FROM employee
-- supprimer l'employee ayant id=2
DELETE FROM employee WHERE id=2
-- liste des employes ayant un salaire >=8000
SELECT id,nom,prenom,salaire FROM employee
WHERE  salaire >= 8000
-- liste des employes dont le prenom commence par a
SELECT * FROM employee WHERE prenom LIKE 'a%'
