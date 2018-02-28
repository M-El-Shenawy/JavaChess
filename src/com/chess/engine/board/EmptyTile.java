package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public class EmptyTile extends Tile {

	public EmptyTile(int coordinate) {
		super(coordinate);
	}

	@Override
	public boolean isOccupied() {

		return false;
	}

	@Override
	public Piece getPiece() {

		return null;
	}

}
