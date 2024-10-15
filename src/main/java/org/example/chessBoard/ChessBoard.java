package org.example.chessBoard;

import java.util.List;

import static org.example.chessBoard.utils.Utils.MAX_CELL_COUNT;

public class ChessBoard {
    public static String[][] board = new String[8][8];

    public ChessBoard(){
        for(int index =0; index < MAX_CELL_COUNT; index++){
            for(int sIndex=0; sIndex <MAX_CELL_COUNT; sIndex++){
                board[index][sIndex] = (char) ('A' + sIndex) + Integer.toString(MAX_CELL_COUNT - index);
            }
        }
    }
    public void display(){
        for(int index =0; index < MAX_CELL_COUNT; index++){
            for(int sIndex=0; sIndex <MAX_CELL_COUNT; sIndex++){
                System.out.print(board[index][sIndex]+" ");
            }
            System.out.println();
        }
    }

    public List<String> outComes(IPiece inputPiece, String position ){
        int row = MAX_CELL_COUNT - Integer.parseInt(String.valueOf(position.charAt(1)));
        int column = position.charAt(0) - 'A';

        return inputPiece.getOutcomes(row, column);
    }
}
