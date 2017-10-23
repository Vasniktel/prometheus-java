package com.tasks3.fibonacci;


public class Main
{
	public static void main(String[] args)
	{
		if (args != null && args.length == 1)
		{
			long num = Fibonacci.getNumber(Integer.valueOf(args[0]));
			System.out.println(num == -1 ? "unspecified" : num);
		}
	}
}
 
