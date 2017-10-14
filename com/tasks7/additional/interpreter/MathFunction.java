package com.tasks7.additional.interpreter;


public class MathFunction implements Interpretable
{
	private FunctionId id;
	private Interpretable[] args;
	private Double result;
	
	public MathFunction(FunctionId id, Interpretable ... args)
	{
		if (args.length == 0)
		{
			throw new InterpreterParserException("Can't call function with no arguments: " + id.name());
		}
		
		this.id = id;
		this.args = args;
	}
	
	@Override
	public double interpret()
	{
		if (this.result == null)
		{
			switch (this.id)
			{
				case sin:
					if (this.args.length != 1)
					{
						throw new InterpreterParserException("Invalid function call: " + this.id.name());
					}
					
					this.result = Math.sin(Math.toRadians(this.args[0].interpret()));
					break;
					
				case cos:
					if (this.args.length != 1)
					{
						throw new InterpreterParserException("Invalid function call: " + this.id.name());
					}
					
					this.result = Math.cos(Math.toRadians(this.args[0].interpret()));
					break;
				
				case tan:
					if (this.args.length != 1)
					{
						throw new InterpreterParserException("Invalid function call: " + this.id.name());
					}
					
					this.result = Math.tan(Math.toRadians(this.args[0].interpret()));
					break;
				
				case sqrt:
					if (this.args.length != 1)
					{
						throw new InterpreterParserException("Invalid function call: " + this.id.name());
					}
					
					double num = this.args[0].interpret();
					
					if (num < 0)
					{
						throw new ArithmeticException("Argument can't be less than 0");
					}
					
					this.result = Math.sqrt(num);
					break;
				
				case max:
					double maxValue = this.args[0].interpret();
					
					for (int i = 1; i < this.args.length; i++)
					{
						double value = this.args[i].interpret();
						if (value > maxValue)
						{
							maxValue = value;
						}
					}
					
					this.result = maxValue;
					break;
				
				case min:
					double minValue = this.args[0].interpret();
					
					for (int i = 1; i < this.args.length; i++)
					{
						double value = this.args[i].interpret();
						if (value < minValue)
						{
							minValue = value;
						}
					}
					
					this.result = minValue;
					break;
			}
		}
		
		return this.result;
	}
}