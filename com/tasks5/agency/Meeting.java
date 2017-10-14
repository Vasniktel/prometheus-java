package com.tasks5.agency;

import java.util.LinkedList;
import java.util.List;

public class Meeting implements Observable
{
	private List<Observer> observers;
	private Data data;
	
	public Meeting()
	{
		this.observers = new LinkedList<>();
	}
	
	public void setData(Data data)
	{
		this.data = data;
		this.notifyObservers();
	}
	
	public int getSize()
	{
		return this.observers.size();
	}
	
	@Override
	public void addObserver(Observer o)
	{
		this.observers.add(o);
	}
	
	@Override
	public void removeObserver(int index)
	{
		this.observers.remove(index);
	}
	
	@Override
	public void removeObserver(Observer o)
	{
		this.observers.remove(o);
	}
	
	@Override
	public void notifyObservers()
	{
		for (Observer observer: this.observers)
		{
			observer.update(this.data);
		}
	}
}
