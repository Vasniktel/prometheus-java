package com.tasks6.rle;

public class Application
{
	public static void main( String[] args )
	{
		if (args != null && args.length != 0 && args[0] != null)
		{
			StringBuilder str = new StringBuilder("");
			
			if (args[0].length() != 0)
			{
				char c = args[0].charAt(0);
				int count = 1;
				
				for (int i = 1, length = args[0].length(); i < length; i++)
				{
					if (args[0].charAt(i) == c)
					{
						if (count == 9)
						{
							str.append(c).append(9);
							count = 1;
						}
						
						else
						{
							count++;
						}
					}
					
					else
					{
						str.append(c);
						
						if (count != 1)
					
							str.append(count);
						
						c = args[0].charAt(i);
						
						count = 1;
					}
				}
				
				str.append(c);
					
				if (count != 1)
			
					str.append(count);
			}
			
			System.out.println(str);
		}
	}
}