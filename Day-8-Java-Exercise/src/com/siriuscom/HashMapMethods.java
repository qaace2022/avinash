package com.siriuscom;
import java.util.*;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> HashMap=new HashMap<Integer,String>();
		
		HashMap.put(01,"Bulbasaur");

		HashMap.put(02,"Ivysaur");

		HashMap.put(03,"Venusaur");
		
		HashMap.put(04,"Charmender");

		HashMap.put(05,"Charmelion");

		HashMap.put(06,"Charizard");
		
		System.out.println(HashMap);
		System.out.println(HashMap.isEmpty());
		
		System.out.println(HashMap.containsKey(01));
		System.out.println(HashMap.containsValue("Bulbasaur"));
		System.out.println(HashMap.get(05));

		
		for(Map.Entry map  :  HashMap.entrySet() )

		{
			System.out.println(map.getKey()+" "+map.getValue());

		}
		
		System.out.println("Entries after adding element with Duplicate Key");

		for(Map.Entry map  :  HashMap.entrySet() )

		{

		System.out.println(map.getKey()+" "+map.getValue());
		} 
		
		 HashMap.clear();
		
		 
	}

}
