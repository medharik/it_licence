/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  2/7/2021 12:58:26 PM                     */
/*==============================================================*/


drop table if exists ARTICLE;

drop table if exists CLIENT;

drop table if exists CONTENIR;

drop table if exists FACTURE;

/*==============================================================*/
/* Table : ARTICLE                                              */
/*==============================================================*/
create table ARTICLE
(
   NUMERO_ARTICLE       int not null,
   LIBELLE              varchar(100),
   PRIX                 float,
   primary key (NUMERO_ARTICLE)
);

/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
create table CLIENT
(
   ID                   int not null,
   NOM                  varchar(100),
   PRENOM               varchar(100),
   ADRESSE              text,
   TEL                  varchar(20),
   primary key (ID)
);

/*==============================================================*/
/* Table : CONTENIR                                             */
/*==============================================================*/
create table CONTENIR
(
   NUMERO               int not null,
   NUMERO_ARTICLE       int not null,
   QTEFACTUREE          float,
   primary key (NUMERO, NUMERO_ARTICLE)
);

/*==============================================================*/
/* Table : FACTURE                                              */
/*==============================================================*/
create table FACTURE
(
   NUMERO               int not null,
   ID                   int not null,
   DATE_FACTURE         datetime,
   primary key (NUMERO)
);

alter table CONTENIR add constraint FK_CONTENIR foreign key (NUMERO_ARTICLE)
      references ARTICLE (NUMERO_ARTICLE) on delete restrict on update restrict;

alter table CONTENIR add constraint FK_CONTENIR2 foreign key (NUMERO)
      references FACTURE (NUMERO) on delete restrict on update restrict;

alter table FACTURE add constraint FK_PAYER foreign key (ID)
      references CLIENT (ID) on delete restrict on update restrict;

