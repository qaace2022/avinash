package com.siriuscom;
import java.util.*;
import java.util.Set;

public class HastSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> Legends=new HashSet<String>();
	
		Legends.add("RONALDO");
		Legends.add("MESSI");
		Legends.add("Lewandowskie");
		Legends.add("Benzema");
		Legends.add("Mbappe");
		Legends.add("Vinicius");
		Legends.add("Haland");

		System.out.println(Legends);
		System.out.println(Legends.isEmpty());
		System.out.println(Legends.contains("RONALDO"));
		System.out.println(Legends.contains("Ronaldo"));
		System.out.println(Legends.contains("Neymar"));
		

		
		 for (String str : Legends)
			System.out.println(str);
        
        Legends.clear();
        System.out.println(Legends);

	}

}
