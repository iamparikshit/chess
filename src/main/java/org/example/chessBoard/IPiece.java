package org.example.chessBoard;

import org.example.chessBoard.pieces.King;
import org.example.chessBoard.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.chessBoard.utils.Utils.CHESS_BOARD_SIZE;
import static org.example.chessBoard.utils.Utils.getPosition;

public interface IPiece {

    List<Rules> getPieceRules();
    default List<String> getOutcomes(int row, int column){
        return getPieceRules().stream()
                .flatMap(rule -> addMove(row, column, rule).stream())
                .collect(Collectors.toList());
    }

    default List<String> addMove(int row, int col, Rules rule){
        if (this instanceof Pawn || this instanceof King) {
            row = rule.getRow(row);
            col = rule.getColumn(col);
            return List.of(getPosition(row, col));
        }
        else{
            List<String> possibleUpSteps = new ArrayList<>();
            while(row>0 && row <CHESS_BOARD_SIZE-1 && col>0 && col< CHESS_BOARD_SIZE-1){
                row = rule.getRow(row);
                col = rule.getColumn(col);
               possibleUpSteps.add(getPosition(row, col));
            }
            return possibleUpSteps;
        }
    }
}
