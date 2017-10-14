package com.tasks5.agency;

import java.util.Arrays;

public class Agency
{
	private static int id = 1;
	
	public static void notify(Data data, int id)
	{
		System.out.println("Agent " + id + ":");
		System.out.println(Arrays.toString(data.get()));
	}
	
	public static void injectSpies(Observable meeting, int number)
	{
		if (number <= 0)
		{
			System.out.println("Number must be > 0");
			return;
		}
		
		for (int i = 0; i < number; i++)
		{
			meeting.addObserver(new Spy(meeting, Agency.id));
			
			Agency.id++;
		}
	}
}
