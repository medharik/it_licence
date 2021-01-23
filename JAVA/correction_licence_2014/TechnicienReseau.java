package correction_licence_2014;

public class TechnicienReseau extends Techncien{

	private double nombreHeureTravail;
	private double tarifHoraire;
	private final double POURCENTAGE_HEURE_SUP=40;
	
	@Override
	protected double calculerSalaire() {
		double salaire=0;
		if (nombreHeureTravail<=35) {
			salaire=tarifHoraire*nombreHeureTravail;
		}else{
			salaire=tarifHoraire*35+(nombreHeureTravail-35)*tarifHoraire*(1+POURCENTAGE_HEURE_SUP/100);
		}
		return salaire ;
	}

	public double getNombreHeureTravail() {
		return nombreHeureTravail;
	}

	public void setNombreHeureTravail(double nombreHeureTravail) {
		this.nombreHeureTravail = nombreHeureTravail;
	}

	public double getTarifHoraire() {
		return tarifHoraire;
	}

	public void setTarifHoraire(double tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}

	public double getPOURCENTAGE_HEURE_SUP() {
		return POURCENTAGE_HEURE_SUP;
	}

	public TechnicienReseau(int numero, double nombreHeureTravail, double tarifHoraire) {
		super(numero, "RESEAU");
		this.nombreHeureTravail = nombreHeureTravail;
		this.tarifHoraire = tarifHoraire;
	}

	@Override
	public String toString() {
		return super.toString()+"TechnicienReseau [nombreHeureTravail=" + nombreHeureTravail + ", tarifHoraire=" + tarifHoraire
				+ ", POURCENTAGE_HEURE_SUP=" + POURCENTAGE_HEURE_SUP + "]";
	}
	

}
