package org.example.chessBoard;

import java.util.List;

import static org.example.chessBoard.utils.Utils.CHESS_BOARD_SIZE;

public class ChessBoard {
    public List<String> getOutcomes(IPiece inputPiece, String position){
        int row = CHESS_BOARD_SIZE - Integer.parseInt(String.valueOf(position.charAt(1)));
        int column = position.charAt(0) - 'A';

        return inputPiece.getOutcomes(row, column);
    }
}
