package com.siriuscom.com;

final class Team

{

	public String name;

	public int titles;

	public String abbrevation;

	public Team(String Name, int Titles, String Abbrevation)

	{
		this.name = Name;
		this.titles = Titles;
		this.abbrevation = Abbrevation;

	}

}
public class QuestionOne {
	

	public static Team Details()

	{


		String Name = "Real Madrid";

		int Titles = 13;

		String Abbrevation = "RMA";

		return new Team(Name, Titles, Abbrevation);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team club = Details();

		System.out.println("Name of the club is " + club.name);

		System.out.println("Titles won are " + club.titles);

		System.out.println("Short name is " + club.abbrevation);
		
		

	}

}
