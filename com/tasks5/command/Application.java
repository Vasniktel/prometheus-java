package com.tasks5.command;

import java.util.Arrays;

public class Application {
	public static void main(String[] args){
	//YOUR CODE COMES HERE
		Command command;
		
		if (args == null || args.length == 0)
		{
			command = new Echo("Error");
		}
		
		else if (Arrays.equals(args, new String[] {"help"}))
		{
			command = new Help();
		}
		
		else if (Arrays.equals(args, new String[] {"exit"}))
		{
			command = new Exit();
		}
		
		else if (Arrays.equals(args, new String[] {"date", "now"}))
		{
			command = new DateNow();
		}
		
		else if (args[0].equals("echo") && args.length == 2)
		{
			command = new Echo(args[1]);
		}
		
		else
		{
			command = new Echo("Error");
		}
		
		command.execute();
	}
}