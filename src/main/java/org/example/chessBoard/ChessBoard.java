package org.example.chessBoard;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.chessBoard.utils.Utils.*;

public class ChessBoard {
    public List<String> getOutcomes(Piece inputPiece, String position){
        int row = getRowIndex(position);
        int column = getColumnIndex(position);

        return inputPiece.getMoveRules()
                .stream()
                .flatMap(moveRule -> inputPiece.addMove(row, column, moveRule).stream())
                .collect(Collectors.toList());
    }
}
