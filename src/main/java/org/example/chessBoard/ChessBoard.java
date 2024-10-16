package org.example.chessBoard;

import java.util.List;

import static org.example.chessBoard.utils.Utils.*;

public class ChessBoard {
    public List<String> getOutcomes(IPiece inputPiece, String position){
        int row = getRowIndex(position);
        int column = getColumnIndex(position);

        return inputPiece.getPossibleOutcomes(row, column);
    }
}
