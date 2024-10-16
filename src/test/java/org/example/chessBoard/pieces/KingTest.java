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

    @Test
    void should_move_to_G2_from_G1(){
        List<String> expectedOutCome = List.of("G2");

        String position = "G1";
        Piece king  = new King();

        List<String> outcome = king.addMove(getRowIndex(position), getColumnIndex(position), MoveRule.Up);

        assertArrayEquals(expectedOutCome.toArray(), outcome.toArray());
    }

    @Test
    void should_move_to_G4_from_G5(){
        List<String> expectedOutCome = List.of("G4");

        String position = "G5";
        Piece king  = new King();

        List<String> outcome = king.addMove(getRowIndex(position), getColumnIndex(position), Down);

        assertArrayEquals(expectedOutCome.toArray(), outcome.toArray());
    }

}