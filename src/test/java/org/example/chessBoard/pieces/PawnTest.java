package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.chessBoard.MoveRule.*;
import static org.example.chessBoard.utils.Utils.getColumnIndex;
import static org.example.chessBoard.utils.Utils.getRowIndex;
import static org.junit.jupiter.api.Assertions.*;

class PawnTest {
    @Test
    void should_return_Pawn_move_rules(){
        var expectedRules = List.of(
                Up
        );
        Piece pawn  = new Pawn();

        List<MoveRule> rules = pawn.getMoveRules();

        assertArrayEquals(expectedRules.toArray(), rules.toArray());
    }

    @Test
    void should_move_to_G2_from_G1(){
        List<String> expectedOutCome = List.of("G2");

        String position = "G1";
        Piece pawn  = new Pawn();

        List<String> outcome = pawn.addMove(getRowIndex(position), getColumnIndex(position), MoveRule.Up);

        assertArrayEquals(expectedOutCome.toArray(), outcome.toArray());
    }

    @Test
    void should_not_move_from_H8(){
        List<String> expectedOutCome = new ArrayList<>();

        String position = "H8";
        Piece pawn  = new Pawn();

        List<String> outcome = pawn.addMove(getRowIndex(position), getColumnIndex(position), MoveRule.Up);

        assertArrayEquals(expectedOutCome.toArray(), outcome.toArray());
    }
}