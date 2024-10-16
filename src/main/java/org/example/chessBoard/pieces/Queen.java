package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;

import java.util.ArrayList;
import java.util.List;

import static org.example.chessBoard.MoveRule.*;
import static org.example.chessBoard.MoveRule.RightDown;
import static org.example.chessBoard.utils.Utils.getPositionFrom;

public class Queen implements Piece {

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
    public List<String> addMove(int row, int column, MoveRule rule) {
        List<String> possibleUpSteps = new ArrayList<>();
        row = rule.getRow(row);
        column = rule.getColumn(column);
        while(isValidMove(row, column)){
            possibleUpSteps.add(getPositionFrom(row, column));
            row = rule.getRow(row);
            column = rule.getColumn(column);
        }
        return possibleUpSteps;
    }
}
