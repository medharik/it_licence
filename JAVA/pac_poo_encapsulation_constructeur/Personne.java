package pac_poo;

public class Personne {

	private String nom;
	private double salaire;
	 final double SMIG=1200;
	
	public Personne() {
	}
	public Personne(String nom, double salaire) {
		
		this.nom = nom;
		this.salaire = salaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) throws Exception  {
		if(salaire>=SMIG)
		this.salaire = salaire;
		else throw new Exception("Erreur, le salaire doit etre > "+SMIG+"DHS");
	}
	
	public void afficher(){
		System.out.println("Nom :"+nom+" touche un salaire de "+salaire+"DHS");
	}
	
	
	
	
}
