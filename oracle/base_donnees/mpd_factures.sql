/*==============================================================*/
/* Nom de SGBD :  ORACLE Version 10gR2                          */
/* Date de création :  2/7/2021 12:56:25 PM                     */
/*==============================================================*/


alter table CONTENIR
   drop constraint FK_CONTENIR_CONTENIR_ARTICLE;

alter table CONTENIR
   drop constraint FK_CONTENIR_CONTENIR2_FACTURE;

alter table FACTURE
   drop constraint FK_FACTURE_PAYER_CLIENT;

drop table ARTICLE cascade constraints;

drop table CLIENT cascade constraints;

drop table CONTENIR cascade constraints;

drop table FACTURE cascade constraints;

/*==============================================================*/
/* Table : ARTICLE                                              */
/*==============================================================*/
create table ARTICLE  (
   NUMERO_ARTICLE       INTEGER                         not null,
   LIBELLE              VARCHAR2(100),
   PRIX                 FLOAT,
   constraint PK_ARTICLE primary key (NUMERO_ARTICLE)
);

/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
create table CLIENT  (
   ID                   INTEGER                         not null,
   NOM                  VARCHAR2(100),
   PRENOM               VARCHAR2(100),
   ADRESSE              CLOB,
   TEL                  VARCHAR2(20),
   constraint PK_CLIENT primary key (ID)
);

/*==============================================================*/
/* Table : CONTENIR                                             */
/*==============================================================*/
create table CONTENIR  (
   NUMERO               INTEGER                         not null,
   NUMERO_ARTICLE       INTEGER                         not null,
   QTEFACTUREE          FLOAT,
   constraint PK_CONTENIR primary key (NUMERO, NUMERO_ARTICLE)
);

/*==============================================================*/
/* Table : FACTURE                                              */
/*==============================================================*/
create table FACTURE  (
   NUMERO               INTEGER                         not null,
   ID                   INTEGER                         not null,
   DATE_FACTURE         DATE,
   constraint PK_FACTURE primary key (NUMERO)
);

alter table CONTENIR
   add constraint FK_CONTENIR_CONTENIR_ARTICLE foreign key (NUMERO_ARTICLE)
      references ARTICLE (NUMERO_ARTICLE);

alter table CONTENIR
   add constraint FK_CONTENIR_CONTENIR2_FACTURE foreign key (NUMERO)
      references FACTURE (NUMERO);

alter table FACTURE
   add constraint FK_FACTURE_PAYER_CLIENT foreign key (ID)
      references CLIENT (ID);

