package pac1;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	
Scanner clavier =new Scanner(System.in);
System.out.println("Entrez votre age ");
int age =clavier.nextInt();
	
	boolean majeur=age>18;
if (majeur) {
System.out.println("Majeur");	
} else {
System.out.println("Mineur");
}
String m=(majeur)? "Majeur":"Mineur";//affectation conditionnelle
System.out.println((majeur)? "Majeur":"Mineur");

}
}
