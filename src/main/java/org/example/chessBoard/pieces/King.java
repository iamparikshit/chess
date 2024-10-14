package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;

import java.util.ArrayList;
import java.util.List;

public class King implements IPiece {
    @Override
    public List<String> getPossibleOutcome(int row, int column) {
        //return this.getUpStep(row, column, board);
        List<String> outcomes = new ArrayList<>();
        outcomes.addAll(this.getUpStep(row, column));
        outcomes.addAll(this.getLeftStep(row, column));
        outcomes.addAll(this.getRightStep(row, column));
        outcomes.addAll(this.getDownStep(row, column));
        outcomes.addAll(this.getLeftUpStep(row, column));
        outcomes.addAll(this.getRightUpStep(row, column));
        outcomes.addAll(this.getLeftDownStep(row, column));
        outcomes.addAll(this.getRightDownStep(row, column));
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
}
