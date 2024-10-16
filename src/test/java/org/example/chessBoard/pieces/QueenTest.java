package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.Rules.*;
import static org.example.chessBoard.Rules.RightDown;
import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void should_return_Queen_move_rules(){
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
        IPiece queen  = new Queen();

        List<Rules> rules = queen.getPieceMoveRules();

        assertArrayEquals(expectedRules.toArray(), rules.toArray());
    }

}