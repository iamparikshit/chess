package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.MoveRule.*;
import static org.example.chessBoard.MoveRule.RightDown;
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
        Piece queen  = new Queen();

        List<MoveRule> rules = queen.getMoveRules();

        assertArrayEquals(expectedRules.toArray(), rules.toArray());
    }

}