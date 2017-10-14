package com.tasks7.additional;

public class Reverse
{
	public static void main(String[] args)
	{
		if (args != null && args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
				char[] str = args[i].toCharArray();
				
				for (int k = 0; k < str.length / 2; k++)
				{
					char tmp = str[k];
					str[k] = str[str.length - 1 - k];
					str[str.length - 1 - k] = tmp;
				}
				
				System.out.println(new String(str));
			}
		}
	}
}