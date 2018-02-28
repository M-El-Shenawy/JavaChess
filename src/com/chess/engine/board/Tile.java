package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public abstract class Tile {
	final int tileCoordinate;

	public Tile(int tC) {
		this.tileCoordinate = tC;
	}

	public abstract boolean isOccupied();

	public abstract Piece getPiece();
}
