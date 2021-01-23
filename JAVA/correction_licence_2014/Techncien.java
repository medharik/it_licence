package correction_licence_2014;

public abstract class Techncien {
//les attributs 
private int numero;
private String specialite;

public Techncien(int numero, String specialite) {
	super();
	this.numero = numero;
	this.specialite = specialite;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public Techncien() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Techncien [numero=" + numero + ", specialite=" + specialite + "]";
}
protected abstract double calculerSalaire();


}
