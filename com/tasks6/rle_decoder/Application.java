package com.tasks6.rle_decoder;

import java.util.regex.*;

public class Application
{
	public static void main( String[] args )
	{
		if (args != null && args.length == 1 && args[0] != null)
		{
			StringBuilder str = new StringBuilder("");
			
			if (args[0].length() != 0)
			{
				Pattern pattern = Pattern.compile("([^0-9]{1}[0-9]?)");
				Matcher matcher = pattern.matcher(args[0]);
				
				int end = 0, last_count = 0;
				String last_group = "0";
				while (matcher.find())
				{
					String group = matcher.group();
					int count = group.length() == 2 ? Character.getNumericValue(group.charAt(1)) : 1;
					
					if (matcher.start() != end || (last_group.charAt(0) == group.charAt(0) && count != 9 && last_count != 9)
						|| (group.length() == 2 && (count < 2 || count > 9)))
					{
						System.out.println("");
						return;
					}
					
					for (int k = count; k > 0; k--)
					{
						str.append(group.charAt(0));
					}
					
					end = matcher.end();
					last_group = group;
					last_count = count;
				}
				
				if (end != args[0].length())
				{
					System.out.println("");
					return;
				}
			}
			
			System.out.println(str);
		}
	}
}