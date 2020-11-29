package pac1;

import java.util.Scanner;

public class Tp2 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		
		System.out.print("saisir  un prix");
		double prix=clavier.nextDouble();
		if(prix>=0){
			System.out.println("saisir la réduction");
			double reduction=clavier.nextDouble();
			if (reduction>=0&&reduction<=100) {
				prix=prix*(1-reduction/100);
				System.out.println("le nouveau prix"+prix);
			} else {
                 System.out.println("erreur de réduction");
			}
		}else{
			System.out.println("erreur de prix");
		}
		

	}

}
