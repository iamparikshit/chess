package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;

import java.util.ArrayList;
import java.util.List;

import static org.example.chessBoard.Rules.*;
import static org.example.chessBoard.Rules.RightDown;

public class Queen implements IPiece {

    @Override
    public List<Rules> getPieceRules() {
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
