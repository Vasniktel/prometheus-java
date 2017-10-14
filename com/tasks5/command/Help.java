package com.tasks5.command;

public class Help implements Command
{
	@Override
	public void execute()
	{
		System.out.println("Help executed");
	}
}