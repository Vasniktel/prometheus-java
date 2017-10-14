package com.tasks7.additional.interpreter;


public class DataBlock implements Interpretable
{
	private Interpretable left;
	private Interpretable right;
	private OperatorId operator;
	private Double result;
	
	public DataBlock(Interpretable left, OperatorId operator, Interpretable right)
	{
		this.left = left;
		this.right = right;
		this.operator = operator;
	}
	
	@Override
	public double interpret()
	{
		if (this.result == null)
		{
			switch (this.operator)
			{
				case plus:
					this.result = this.left.interpret() + this.right.interpret();
					break;
				
				case minus:
					this.result = this.left.interpret() - this.right.interpret();
					break;
				
				case mult:
					this.result = this.left.interpret() * this.right.interpret();
					break;
				
				case div:
					double rightValue = this.right.interpret();
					if (rightValue == 0)
					{
						throw new ArithmeticException("Can't divide by 0");
					}
					
					this.result = this.left.interpret() / rightValue;
					break;
			}
		}
		
		return this.result;
	}
}