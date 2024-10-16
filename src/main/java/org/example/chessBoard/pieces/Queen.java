package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;

import java.util.ArrayList;
import java.util.List;

import static org.example.chessBoard.Rules.*;
import static org.example.chessBoard.Rules.RightDown;
import static org.example.chessBoard.utils.Utils.CHESS_BOARD_SIZE;
import static org.example.chessBoard.utils.Utils.getPositionFrom;

public class Queen implements IPiece {

    @Override
    public List<Rules> getPieceMoveRules() {
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
    public List<String> addMove(int row, int column, Rules rule) {
        List<String> possibleUpSteps = new ArrayList<>();
        while(row>0 && row <CHESS_BOARD_SIZE-1 && column>0 && column< CHESS_BOARD_SIZE-1){
            row = rule.getRow(row);
            column = rule.getColumn(column);
            possibleUpSteps.add(getPositionFrom(row, column));
        }
        return possibleUpSteps;
    }
}
