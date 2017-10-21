package com.demo.tictactoe;

public class Board {

	private int space = 9;
	
	private ActionFigure[][] board = new ActionFigure[3][3];

	public boolean hasMoreSpace() {
		return (this.space > 0);
	}
	
	public void put(Move move)
	{
		this.board[move.getX()][move.getY()] = move.getFigure();
		this.space--;
	}
	
	public boolean check(int line, int row)
	{
		return (this.board[line][row] != null);
	}
	
	public boolean isWin(Move move)
	{
		int line = move.getX();
		int row = move.getY();
		
		if (line == row)
		{
			switch (line)
			{
				case 0:
				
					return (this.board[line][row] == this.board[1][1] && this.board[line][row] == this.board[2][2]);
			
				case 1:
				
					return ((this.board[line][row] == this.board[0][0] && this.board[line][row] == this.board[2][2]) ||
							(this.board[line][row] == this.board[0][2] && this.board[line][row] == this.board[2][0]));
				
				case 2:
				
					return (this.board[line][row] == this.board[1][1] && this.board[line][row] == this.board[0][0]);
				
			}
		}
		else
		{
			boolean is_line = true, is_row = true;
			for (int i = 0; i < 3; i++)
			{
				if (is_line && this.board[line][row] != this.board[line][i])
				
					is_line = false;
				
				if (is_row && this.board[line][row] != this.board[i][row])
				
					is_row = false;
				
				if (!is_line && !is_row)
				
					return false;
				
			}
		}
		
		return true;
	}

	public void print() {
		for (ActionFigure[] line: this.board)
		{
			for (int i = 0; i < 7; i++)
			{
				System.out.print("-");
			}
			System.out.print("\n|");
			for (ActionFigure figure: line)
			{
				if (figure == null)
				
					System.out.print(" ");
				
				else if (figure == ActionFigure.NOUGHT)
				
					System.out.print("O");
				
				else if (figure == ActionFigure.CROSS)
				
					System.out.print("X");
				
				System.out.print("|");
			}
			System.out.println();
		}
		for (int i = 0; i < 7; i++)
		{
			System.out.print("-");
		}
		System.out.println("\n");
	}

}
