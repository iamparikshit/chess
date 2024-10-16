package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;

import java.util.List;

public class Pawn implements IPiece {

    @Override
    public List<Rules> getPieceMoveRules(){
        return List.of(Rules.Up);
    }

}