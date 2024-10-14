package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;

import java.util.ArrayList;
import java.util.List;

public class Queen implements IPiece {
    @Override
    public List<String> getPossibleOutcome(int row, int column, String[][] board) {
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
    }
}
