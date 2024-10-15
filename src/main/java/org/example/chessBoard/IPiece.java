package org.example.chessBoard;

import org.example.chessBoard.pieces.King;
import org.example.chessBoard.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface IPiece {

    List<Rules> getPieceRules();
    default List<String> getOutcomes(int row, int column){
        return getPieceRules().stream()
                .flatMap(rule -> addMove(row, column, rule).stream())
                .collect(Collectors.toList());
    }

    default List<String> addMove(int row, int col, Rules rule){
        if (this instanceof Pawn || this instanceof King) {
            return List.of(ChessBoard.board[rule.getRow(row)][rule.getColumn(col)]);
        }
        else{
            List<String> possibleUpSteps = new ArrayList<>();
            while(row>0 && row <7 && col>0 && col< 7){
                row = rule.getRow(row);
                col = rule.getColumn(col);
                possibleUpSteps.add(ChessBoard.board[row][col]);
            }
            return possibleUpSteps;
        }
    }
}
