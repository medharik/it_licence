create table client(
id number(3) ,
nom varchar2(100) not null,
prenom varchar2(10),
tel varchar2(20),
constraint pk_client_1  primary key(id),
constraint uc_np unique(nom,prenom)

)

describe client
create table facture(
numero integer,
dateFacture date,
client_id number(3),
constraint pk_facture primary key(numero),
constraint fk_facture_client foreign key(client_id) references client(id) 

)

create table produit(
id integer primary key,
libelle varchar2(200) unique not null,
prix FLOAT default 0
)
create table facture_produit(
produit_id number(3),
facture_id integer,
qte float default 1,
constraint fk_facture foreign key(facture_id) references facture(numero),
constraint fk_produit foreign key(produit_id) references produit(id),
constraint ck_qte check (qte>0)
)
alter table facture_produit add constraint pk_f_p primary key(facture_id,produit_id)
alter table client drop column tel

drop table produit