package correction_licence_2014;

public class Remuneration {
public static void main(String[] args) {
	//instanciation des objets TD , TR
	TechnicienReseau tr1=new TechnicienReseau(10, 44, 80);
	TechncienDeveloppement td1=new TechncienDeveloppement(11, 2800, 10);
	Techncien t[]={tr1,td1};
	for (Techncien technicien : t) {
		double salaire=technicien.calculerSalaire();
		System.out.println("le salaire de "+technicien+" est de "+salaire+"$");
		
	}
	for (int i = 0; i < t.length; i++) {
		System.out.println(t[i].calculerSalaire());
	}
}
}
