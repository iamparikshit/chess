package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;

import java.util.List;

import static org.example.chessBoard.MoveRule.*;
import static org.example.chessBoard.utils.Utils.getPositionFrom;

public class King implements Piece {

    @Override
    public List<MoveRule> getMoveRules() {
        return List.of(
                Up,
                Down,
                Left,
                Right,
                LeftUp,
                RightUp,
                LeftDown,
                RightDown
        );
    }
    @Override
    public List<String> addMove(int row, int column, MoveRule rule){
        row = rule.getRow(row);
        column = rule.getColumn(column);

        if(validateCurrentCell(row, column)) return List.of(getPositionFrom(row, column));
        else return List.of();
    }
}
