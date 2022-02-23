package com.siriuscom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Legends = new ArrayList<String>();

		Legends.add("RONALDO");
		Legends.add("MESSI");
		Legends.add("Lewandowskie");
		Legends.add("Benzema");
		Legends.add("Mbappe");
		Legends.add(null);
		Legends.add(null);
		Legends.add(5, "Vinicius");
		Legends.add(6, "Haland");

		System.out.println(Legends);
		System.out.println(Legends.isEmpty());
		System.out.println(Legends.contains("RONALDO"));
		System.out.println(Legends.contains("Ronaldo"));
		System.out.println(Legends.contains("Neymar"));

		List<String> LegendsCopy = new ArrayList<String>();

		LegendsCopy.add("RONALDO");
		LegendsCopy.add("MESSI");
		LegendsCopy.add("Lewandowskie");
		LegendsCopy.add("Benzema");
		LegendsCopy.add("Mbappe");
		LegendsCopy.add(null);
		LegendsCopy.add(null);
		LegendsCopy.add(5, "Vinicius");
		LegendsCopy.add(6, "Haland");

		System.out.println(LegendsCopy);
		System.out.println(LegendsCopy.equals(Legends));

		System.out.println(Legends.get(0));
		System.out.println(Legends.get(1));
		System.out.println(Legends.get(2));
		System.out.println(Legends.size());
		
		Legends.remove(8);
		Legends.remove(null);
		
		System.out.println(Legends);
		
		for (int i = 0; i < Legends.size(); i++) {
			 
            System.out.println(Legends.get(i));
        }
 
        System.out.println();
 
        // Using the for each loop
        for (String str : Legends)
        System.out.println(str);
        
        Collections.sort(Legends);
        System.out.println(Legends);
        
		Collections.reverse(Legends);
		System.out.println(Legends);
		
	}

}
