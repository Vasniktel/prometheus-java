package com.tasks5.command;

public class Exit implements Command
{
	@Override
	public void execute()
	{
		System.out.println("Goodbye!");
	}
}