package org.example.chessBoard.factory;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.pieces.King;
import org.example.chessBoard.pieces.Pawn;
import org.example.chessBoard.pieces.Queen;

public class PieceFactory {
    public static IPiece createPiece(String type) throws Exception {
        return switch (type.toUpperCase()){
            case "PAWN" -> new Pawn();
            case "KING" ->  new King();
            case "QUEEN" -> new Queen();
            default -> throw new Exception("Please Select correct Piece");
        };
    }
}
