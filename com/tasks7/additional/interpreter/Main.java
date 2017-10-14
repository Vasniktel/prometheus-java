package com.tasks7.additional.interpreter;


public class Main
{
	public static void main(String[] args)
	{
		if (args != null && args.length == 1)
		{
			Interpretable math = new Expression(args[0]);
			System.out.println(args[0] + " = " + math.interpret());
		}
	}
}
