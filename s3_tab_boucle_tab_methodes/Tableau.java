package s3_tab_boucle_tab_methodes;

public class Tableau {
	public static void main(String[] args) {
		//Declarer et initialiser un tableau
		int  c=0,t[] ={1,3,4,2,6};
		
		for (int i = 0; i < t.length; i++) {
			if(t[i]%2==0) {
				c++;
				for (int j = 0; j < 4; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
		
		System.out.println("le nombre des chiffres pairs est "+c);
		System.out.println(".....impairs"+(t.length-c));
		
		
	}
}
