package com.siriuscom.com;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Team1 = "Real Madrid";
		String Team2 = "FC Barcelona";
		String Team3 = "Manchester United";
		String Team4 = "FC Bayern Munich";
		String Name1 = "AwesMosian";
		String Name2 = "Mendises";
		String Name3 = "Red";
		String Name4 = "...";
		String Name5 = " Nani? ";
		String Name6 = "";
		
		System.out.println(Team1.equals("RMA"));

		//concat returns both strings will join
		System.out.println(Name3.concat(Name4));

		//uppercase returns converts all to capital letters
		System.out.println(Team1.toUpperCase());
		
		//charAt returns letter of 5th position
		System.out.println(Name2.charAt(4));

		//length returns length of string
		System.out.println(Team3.length());

		//lowercase returns converts all to lowercase
		System.out.println(Team2.toLowerCase());

		//trim returns all whitesapces will be removed
		System.out.println(Name5.trim());

		//joins two number
		System.out.println(Name6.join(" * ",Team1,Team2));

		//contains returns if string exists or not and return true or false
		System.out.println(Name2.contains("di"));

		//isEmpty checks if string is present or not and returns true or false
		System.out.println(Team1.isEmpty());

	}

}
