package org.example.chessBoard.pieces;

import org.example.chessBoard.Piece;
import org.example.chessBoard.MoveRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.MoveRule.*;
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
}