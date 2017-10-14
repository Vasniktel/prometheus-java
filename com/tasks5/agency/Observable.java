package com.tasks5.agency;

public interface Observable
{
	void addObserver(Observer o);
	
	void removeObserver(int index);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
}
