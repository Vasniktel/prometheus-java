package com.tasks5.agency;

public class Spy implements Observer
{
	private int id;
	private Data data;
	private Observable target;
	
	public Spy(Observable obs, int id)
	{
		this.target = obs;
		this.id = id;
	}
	
	@Override
	public void update(Data data)
	{
		this.data = data;
		Agency.notify(data, this.id);
	}
}