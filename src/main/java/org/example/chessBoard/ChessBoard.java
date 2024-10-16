package org.example.chessBoard;

import java.util.List;

import static org.example.chessBoard.utils.Utils.CHESS_BOARD_SIZE;

public class ChessBoard {
    public List<String> getOutcomes(IPiece inputPiece, String position){
        int row = getRowIndex(position);
        int column = getColumnIndex(position);

        return inputPiece.getPossibleOutcomes(row, column);
    }

    private int getColumnIndex(String position) {
        return position.charAt(0) - 'A';
    }

    private int getRowIndex(String position){
        return CHESS_BOARD_SIZE - Integer.parseInt(String.valueOf(position.charAt(1)));
    }
}
