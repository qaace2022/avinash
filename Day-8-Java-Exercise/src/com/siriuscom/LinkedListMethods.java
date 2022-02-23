package com.siriuscom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> Legends = new LinkedList<String>();

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
		
		Legends.remove("Haland");
		Legends.remove(6);
		((LinkedList<String>) Legends).addLast("Suarez");
		Legends.removeLast();
		Legends.remove(null);
		System.out.println(Legends);
		
		System.out.println(Legends.get(0));
		System.out.println(Legends.get(1));
		System.out.println(Legends.get(2));
		System.out.println(Legends.size());
		
		 for (String str : Legends)
			System.out.println(str);
	        
	        Collections.sort(Legends);
	        System.out.println(Legends);
	        
			Collections.reverse(Legends);
			System.out.println(Legends);

	}
}