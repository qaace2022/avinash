package com.siriuscom;

public class StringClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CharAt
		String Team="Real Madrid";
	    for(int i=0;i<Team.length();i++) {
	    System.out.println(Team.charAt(i));
	    }  
	    
	    //length
	    String FindLenght="Hala Madrid Y Nada Mas";
	    System.out.println("Lenghth is = "+FindLenght.length());
	   
	    
	    //equals, UpperCase & LowerCase
	    String Ronaldo="GOAT";
	    String Messi="GOAT";
	    boolean bool=Ronaldo.equals(Messi);
	    System.out.println(bool);
	    System.out.println(Ronaldo.toUpperCase());
	    System.out.println(Messi.toLowerCase());   
	    
	    //concat
	    String S1="Cristiano Ronaldo is ";
	    String S2="GOAT";
	    System.out.println(S1.concat(S2));
	    
	    String S3="AwesMosian";
	    String S4="Mendises";
	    String S5="Omae wa mou shindeiru";
	    String S6="";
		
		//trim 
		System.out.println(Team.trim());
		
		//contains 
		System.out.println(S5.contains("mou"));
		
		//substring 
		System.out.println(S1.substring(0,4));
		
		//replace 
		System.out.println(S4.replace("i","u"));
		
		//isEmpty 
		System.out.println(S6.isEmpty());
		

	}

}
