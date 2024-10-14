package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;

import java.util.ArrayList;
import java.util.List;

public class King implements IPiece {
    @Override
    public List<String> getPossibleOutcome(int row, int column, String[][] board) {
        //return this.getUpStep(row, column, board);
        List<String> outcomes = new ArrayList<>();
        outcomes.addAll(this.getUpStep(row, column, board));
        outcomes.addAll(this.getLeftStep(row, column, board));
        outcomes.addAll(this.getRightStep(row, column, board));
        outcomes.addAll(this.getDownStep(row, column, board));
        outcomes.addAll(this.getLeftUpStep(row, column, board));
        outcomes.addAll(this.getRightUpStep(row, column, board));
        outcomes.addAll(this.getLeftDownStep(row, column, board));
        outcomes.addAll(this.getRightDownStep(row, column, board));
        return outcomes;
        //up r--
        //left c--
        //right c++
        //down r++
        //left up r-- c--
        //right up r-- c++
        //left down r++ c--
        //right down r++ c++
    }


    //D4
    //r = 4
    //c = 3

}
