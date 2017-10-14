package com.tasks7.additional.interpreter;


public class Expression implements Interpretable
{
	private final String raw;
	private Interpretable data;
	private Double result;
	
	public Expression(String raw)
	{
		this.raw = raw;
	}
	
	@Override
	public double interpret()
	{
		if (this.result == null)
		{
			this.data = this.parse();
			this.result = this.data.interpret();
		}
		
		return this.result;
	}
	
	@Override
	public String toString()
	{
		return this.raw;
	}
	
	private Interpretable parse()
	{
		if (this.raw == null || this.raw.isEmpty())
		{
			throw new InterpreterParserException("Input string is invalid");
		}
		
		//TODO
		
		return new MathFunction(FunctionId.sqrt, new DataBlock(new DataBlock(new NumericValue(10.0), OperatorId.plus, new NumericValue(20.0)), OperatorId.mult, new NumericValue(30.0))); //30.0
	}
}