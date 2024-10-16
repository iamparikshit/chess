package org.example.chessBoard;

import org.example.chessBoard.pieces.King;
import org.example.chessBoard.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.chessBoard.utils.Utils.CHESS_BOARD_SIZE;
import static org.example.chessBoard.utils.Utils.getPosition;

public interface IPiece {

    List<Rules> getPieceMoveRules();
    default List<String> getPossibleOutcomes(int row, int column){
        return getPieceMoveRules().stream()
                .flatMap(rule -> addMove(row, column, rule).stream())
                .collect(Collectors.toList());
    }

    default List<String> addMove(int row, int column, Rules rule){
        if (this instanceof Pawn || this instanceof King) {
            row = rule.getRow(row);
            column = rule.getColumn(column);
            return List.of(getPosition(row, column));
        }
        else{
            List<String> possibleUpSteps = new ArrayList<>();
            while(row>0 && row <CHESS_BOARD_SIZE-1 && column>0 && column< CHESS_BOARD_SIZE-1){
                row = rule.getRow(row);
                column = rule.getColumn(column);
               possibleUpSteps.add(getPosition(row, column));
            }
            return possibleUpSteps;
        }
    }
}
