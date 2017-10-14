package com.tasks5.command;

public class Echo implements Command
{
	private String command;
	
	public Echo(String command)
	{
		this.command = command;
	}
	
	@Override
	public void execute()
	{
		System.out.println(this.command);
	}
}