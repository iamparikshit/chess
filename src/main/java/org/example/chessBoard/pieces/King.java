package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;

import java.util.List;

import static org.example.chessBoard.Rules.*;

public class King implements IPiece {

    @Override
    public List<Rules> getPieceMoveRules() {
        return List.of(
                Up,
                Down,
                Left,
                Right,
                LeftUp,
                RightUp,
                LeftDown,
                RightDown
        );
    }
}
