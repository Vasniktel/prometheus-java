package com.tasks7.additional;

import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args)
	{
		if (args != null && args.length == 2 && args[0] != null && args[1] != null)
		{
			char[] first = args[0].toCharArray(), second = args[1].toCharArray();
			
			Arrays.sort(second);
			
			for (char symbol: first)
			{
				if (symbol == ' ')
				{
					continue;
				}
				
				if (Arrays.binarySearch(second, symbol) < 0)
				{
					System.out.println(false);
					return;
				}
			}
			
			System.out.println(true);
		}
	}
}