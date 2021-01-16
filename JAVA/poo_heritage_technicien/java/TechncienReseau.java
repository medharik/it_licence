package com.harik.java;

public class TechncienReseau  extends Techncien{

private double salaireHebdo;

public double getSalaireHebdo() {
	return salaireHebdo;
}

public void setSalaireHebdo(double salaireHebdo) {
	this.salaireHebdo = salaireHebdo;
}
public TechncienReseau() {
	super();
}

public TechncienReseau(String nom, String prenom, double salaireHebdo) {
	super(nom, prenom);
	
	this.salaireHebdo = salaireHebdo;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Salaire Hebdo est "+salaireHebdo;
	}

@Override
	public boolean equals(Object obj) {
	TechncienReseau tr=(TechncienReseau) obj;
		return super.equals(tr) && this.salaireHebdo==tr.salaireHebdo;
	}

}
