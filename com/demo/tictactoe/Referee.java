package com.demo.tictactoe;

public class Referee {

	public void put(Move move, Board board) {
		board.put(move);
	}

	public boolean isWin(Move move, Board board) {
		return board.isWin(move);
	}

}
