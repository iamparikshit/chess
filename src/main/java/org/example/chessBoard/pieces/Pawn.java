package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;

import java.util.List;

import static org.example.chessBoard.utils.Utils.getPositionFrom;

public class Pawn implements IPiece {

    @Override
    public List<Rules> getPieceMoveRules(){
        return List.of(Rules.Up);
    }

    @Override
    public List<String> addMove(int row, int column, Rules rule) {
        row = rule.getRow(row);
        column = rule.getColumn(column);
        return List.of(getPositionFrom(row, column));
    }

}