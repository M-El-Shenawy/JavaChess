package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public class OccupiedTile extends Tile {

	Piece pieceOnTile;

	public OccupiedTile(int oc, Piece pot) {
		super(oc);
		this.pieceOnTile = pot;
	}

	@Override
	public boolean isOccupied() {
		return true;
	}

	@Override
	public Piece getPiece() {
		return this.pieceOnTile;
	}

}
