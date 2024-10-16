package org.example.chessBoard.utils;

public class Utils {
    public static final Short CHESS_BOARD_SIZE = 8;

    public static int getColumnIndex(String position) {
        return position.charAt(0) - 'A';
    }

    public static int getRowIndex(String position){
        return CHESS_BOARD_SIZE - Integer.parseInt(String.valueOf(position.charAt(1)));
    }

    public static String getPositionFrom(int row, int column){
        return "" + (char)('A'+column) + (CHESS_BOARD_SIZE-row);
    }
}
