package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application {

	public static double parse(String rpnString) {
		Deque<Double> deque = new LinkedList<>();
		StringBuilder str = new StringBuilder("");
		
		rpnString = rpnString.trim();
		
		for (int i = 0, length = rpnString.length(); i < length; i++)
		{
			char symbol = rpnString.charAt(i);
			
			if ((symbol >= '0' && symbol <= '9') || symbol == '.' || (symbol == '-' && i != length - 1 && rpnString.charAt(i + 1) != ' '))
			{
				str.append(symbol);
			}
			
			else if (symbol == ' ')
			{
				if (str.length() > 0)
				{
					deque.push(Double.valueOf(str.toString()));
					
					str = new StringBuilder("");
				}
			}
			
			else if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/')
			{
				Double first, second;
				try
				{
					second = deque.pop();
					first = deque.pop();
				}
				catch (Exception e)
				{
					throw new RPNParserException();
				}
				
				switch (symbol)
				{
					case '+':
						deque.push(first + second);
						break;
					
					case '-':
						deque.push(first - second);
						break;
						
					case '*':
						deque.push(first * second);
						break;
					
					case '/':
						if (second == 0)
						{
							throw new ArithmeticException();
						}
						
						deque.push(first / second);
						break;
				}
			}
			
			else
			{
				throw new RPNParserException();
			}
		}
		
		if (deque.size() > 1)
		{
			throw new RPNParserException();
		}
		
		return deque.pop();
	}

	public static void main(String[] args) {
		if (args == null || args.length != 1 || args[0] == null)
		{
			throw new RPNParserException();
		}
		
		System.out.println(" = " + Application.parse(args[0]));
	}

}