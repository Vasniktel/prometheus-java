package com.demo.tictactoe;

public class Move {
	private int x;
	private int y;
	private ActionFigure figure;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ActionFigure getFigure() {
		return figure;
	}

	public void setFigure(ActionFigure figure) {
		this.figure = figure;
	}
}
