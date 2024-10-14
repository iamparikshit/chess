package org.example.chessBoard;

import java.util.List;

public class ChessBoard {
    String[][] board = new String[8][8];
    public ChessBoard(){
        for(int index =0; index < 8; index++){
            for(int sIndex=0; sIndex <8; sIndex++){
                board[index][sIndex] = (char) ('A' + sIndex) + Integer.toString(8 - index);
            }
        }
    }
    public void display(){
        for(int index =0; index < 8; index++){
            for(int sIndex=0; sIndex <8; sIndex++){
                System.out.print(board[index][sIndex]+" ");
            }
            System.out.println("");
        }
    }

    public List<String> outComes(IPiece inputPiece, String position ){
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));
        int column = position.charAt(0) - 'A';

        return inputPiece.getPossibleOutcome(row, column, board);
    }
}
