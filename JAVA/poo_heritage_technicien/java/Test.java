package com.harik.java;

public class Test {
public static void main(String[] args) {
	TechncienReseau tr1=new TechncienReseau("alami", "ali", 6000);
	System.out.println(tr1.hashCode());
	TechncienReseau tr2=new TechncienReseau("Mbodj", "Abdou", 8000);
	System.out.println(tr2.hashCode());
	System.out.println(tr2.toString());
	System.out.println(tr1.equals(tr2));
	TechnicienDev dev1=new TechnicienDev("IMDAHNE", "Mohamed", 500);
	TechnicienDev dev2=new TechnicienDev("IMDAHNE", "Mohamed", 500);
Techncien t=new Techncien("FATIMA", "FATI");

System.out.println(t.equals(dev1 ));
	
}
}
