package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;

import java.util.List;

public class Pawn implements IPiece {
    @Override
    public List<String> getPossibleOutcome(int row, int column) {
        if(row == 0){
            System.out.println("PAWN CAN'T MOVE FURTHER");
            return List.of();
        }else{
           return this.getUpStep(row, column);
        }

    }
}