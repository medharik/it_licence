package com.harik.java;

public class TechnicienDev  extends Techncien{
private double tarifHoraire;

public double getTarifHoraire() {
	return tarifHoraire;
}

public void setTarifHoraire(double tarifHoraire) {
	this.tarifHoraire = tarifHoraire;
}

public TechnicienDev(String nom, String prenom, double tarifHoraire) {
	super(nom, prenom);
	this.tarifHoraire = tarifHoraire;
}

public TechnicienDev() {

super();
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Tarif horaire "+tarifHoraire;
	}


}
