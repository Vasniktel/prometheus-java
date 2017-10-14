package com.tasks7.additional.interpreter;


public class NumericValue implements Interpretable
{
	private double value;
	
	public NumericValue(double value)
	{
		this.value = value;
	}
	
	@Override
	public double interpret()
	{
		return this.value;
	}
}
