package correction_licence_2014;

public  class TechncienDeveloppement extends Techncien{

	private double  montantFixe;
	private int nombreIntervention;
	private final double  NB_INTERVENTION=25;
	
	@Override
	protected double calculerSalaire() {
		double salaire=montantFixe+nombreIntervention*NB_INTERVENTION;
		
		return salaire;
	}
public TechncienDeveloppement() {
	// TODO Auto-generated constructor stub
}

	public double getMontantFixe() {
		return montantFixe;
	}


	public void setMontantFixe(double montantFixe) {
		this.montantFixe = montantFixe;
	}


	public int getNombreIntervention() {
		return nombreIntervention;
	}


	public void setNombreIntervention(int nombreIntervention) {
		this.nombreIntervention = nombreIntervention;
	}


	public TechncienDeveloppement(int numero, double montantFixe, int nombreIntervention) {
		super(numero, "DEVELOPPEMENT");
		this.montantFixe = montantFixe;
		this.nombreIntervention = nombreIntervention;
	}


	@Override
	public String toString() {
		return "TechncienDeveloppement [montantFixe=" + montantFixe + ", nombreIntervention=" + nombreIntervention
				+ ", toString()=" + super.toString() + "]";
	}

	

}
