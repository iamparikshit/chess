package org.example.chessBoard;

import java.util.List;

import static org.example.chessBoard.utils.Utils.CHESS_BOARD_SIZE;

public interface Piece {

    List<MoveRule> getMoveRules();

    List<String> addMove(int row, int column, MoveRule rule);

    default boolean isValidMove(int row, int column){
        return row>=0 && row <CHESS_BOARD_SIZE && column>=0 && column< CHESS_BOARD_SIZE;
    }
}
