package com.demo.tictactoe;

import java.util.Scanner;

public class Player {

	private ActionFigure figure;

	public Player(ActionFigure figure) {
		this.figure = figure;
	}

	public Move turn(Board board) {
		Scanner in = new Scanner(System.in);
		
		int line, row;
		
		do
		{
			System.out.println("Enter coordinates:");
			System.out.println("\tLine: ");
			line = in.nextInt() - 1;
			System.out.println("\tRow: ");
			row = in.nextInt() - 1;
		} while (!(line >= 0 && line < 3 && row >= 0 && row < 3 && !board.check(line, row)));
		
		Move move = new Move();
		move.setX(line);
		move.setY(row);
		move.setFigure(this.figure);
		return move;
	}

}
