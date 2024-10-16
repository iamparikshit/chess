package org.example.chessBoard;

import java.util.List;

public interface Piece {

    List<MoveRule> getMoveRules();

    List<String> addMove(int row, int column, MoveRule rule);
}
