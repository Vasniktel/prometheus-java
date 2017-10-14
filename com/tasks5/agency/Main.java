package com.tasks5.agency;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Meeting meet = new Meeting();
		
		Agency.injectSpies(meet, 10);
		
		meet.setData(new Data(new String[] {"Hello", "World", "Guys"}));
		
		System.out.println();
		
		Agency.injectSpies(meet, 2);
		
		meet.setData(new Data(new String[] {"Hello", "Again"}));
		
		System.out.println("\nWrite a number between 1 and " + meet.getSize() + ":");
		
		Scanner in = new Scanner(System.in);
		
		int index = in.nextInt() - 1;
		
		meet.removeObserver(index);
		
		meet.setData(new Data(new String[] {"Another", "Hello"}));
	}
}
