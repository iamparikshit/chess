package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;

import java.util.List;

import static org.example.chessBoard.utils.Utils.getPositionFrom;

public class Pawn implements Piece {

    @Override
    public List<MoveRule> getMoveRules(){
        return List.of(MoveRule.Up);
    }

    @Override
    public List<String> addMove(int row, int column, MoveRule rule) {
        row = rule.getRow(row);
        column = rule.getColumn(column);
        return List.of(getPositionFrom(row, column));
    }

}