package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.Rules.*;
import static org.example.chessBoard.Rules.RightDown;
import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void should_return_King_move_rules(){
        var expectedRules = List.of(
                Up,
                Down,
                Left,
                Right,
                LeftUp,
                RightUp,
                LeftDown,
                RightDown
        );
        IPiece king  = new King();

        List<Rules> rules = king.getPieceMoveRules();

        assertArrayEquals(expectedRules.toArray(), rules.toArray());
    }

}