package org.example.chessBoard;

import java.util.List;

public interface IPiece {

    List<Rules> getPieceMoveRules();

    List<String> addMove(int row, int column, Rules rule);
}
