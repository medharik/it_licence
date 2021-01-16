package com.harik.java;

public class Techncien {
private String nom,prenom;
private int pri;
public int pub;

protected int pro;

 int def;


protected String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public Techncien(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public Techncien() {
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	Techncien t=(Techncien) obj;
	return this.nom.equals(t.nom) && this.prenom.equals(t.prenom);
}

@Override
public String toString() {
	return "Techncien [nom=" + nom + ", prenom=" + prenom + "]";
}
}
