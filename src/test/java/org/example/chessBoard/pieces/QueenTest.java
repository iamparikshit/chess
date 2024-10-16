package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.MoveRule.*;
import static org.example.chessBoard.MoveRule.RightDown;
import static org.example.chessBoard.utils.Utils.getColumnIndex;
import static org.example.chessBoard.utils.Utils.getRowIndex;
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

    @Test
    void should_move_to_left_direction_from_G1(){
        List<String> expectedOutCome = List.of("A1","B1","C1","D1","E1","F1");

        String position = "G1";
        Piece queen  = new Queen();

        List<String> outcome = queen.addMove(getRowIndex(position), getColumnIndex(position), Left);

        assertTrue(
                expectedOutCome.size() == outcome.size()
                        && outcome.containsAll(expectedOutCome)
                        && expectedOutCome.containsAll(outcome)
        );
    }

}