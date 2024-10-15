package org.example.chessBoard.utils;

public class Utils {
    public static final Short MAX_CELL_COUNT = 8;
    public static final Short CHESS_BOARD_SIZE = 8;

    public static String getPosition(int row, int column){
        return "" + (char)('A'+column) + (CHESS_BOARD_SIZE-row);
    }
}
