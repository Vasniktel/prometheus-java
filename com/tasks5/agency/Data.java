package com.tasks5.agency;

public class Data
{
	private String[] topSecret;
	
	public Data(String[] top_secret)
	{
		this.topSecret = top_secret;
	}
	
	public void set(String[] new_data)
	{
		this.topSecret = new_data;
	}
	
	public String[] get()
	{
		return this.topSecret;
	}
}
