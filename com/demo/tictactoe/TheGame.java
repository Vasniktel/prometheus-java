package com.demo.tictactoe;

public class TheGame {

	public static void main(String[] args) {
		Referee referee = new Referee();
		Player player1 = new Player(ActionFigure.NOUGHT);
		Player player2 = new Player(ActionFigure.CROSS);
		Board board = new Board();
		Move move;
		boolean flag = true;
		
		board.print();
		
		while (board.hasMoreSpace())
		{
			if (flag)
			{
				move = player1.turn(board);
			}
			else
			{
				move = player2.turn(board);
			}
			
			referee.put(move, board);
			board.print();
			
			if (referee.isWin(move, board))
			{
				System.out.println("\n" + (flag ? "First" : "Second") + " player won!");
				return;
			}
			flag = !flag;
		}
		System.out.println("\nIt's a draw!");
	}

}
