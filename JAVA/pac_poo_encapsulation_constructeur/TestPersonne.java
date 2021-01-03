package pac_poo;

public class TestPersonne {
public static void main(String[] args) {
	
	Personne p1=new Personne();
	Personne p2=new Personne("ali", 3000);
	
	
	p1.afficher();
	p2.afficher();
	try {
		p1.setSalaire(1500);
		p1.setNom("rim");
		p1.afficher();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
