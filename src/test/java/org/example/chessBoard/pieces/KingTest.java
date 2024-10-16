package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.MoveRule.*;
import static org.example.chessBoard.MoveRule.RightDown;
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
        Piece king  = new King();

        List<MoveRule> rules = king.getMoveRules();

        assertArrayEquals(expectedRules.toArray(), rules.toArray());
    }

}