package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;

import java.util.ArrayList;
import java.util.List;

public class Queen implements IPiece {
    @Override
    public List<String> getPossibleOutcome(int row, int column) {
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
    }
}
