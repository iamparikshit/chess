package org.example.chessBoard.pieces;

import org.example.chessBoard.IPiece;
import org.example.chessBoard.Rules;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chessBoard.Rules.*;
import static org.junit.jupiter.api.Assertions.*;

class PawnTest {
    @Test
    void should_return_Pawn_move_rules(){
        var expectedRules = List.of(
                Up
        );
        IPiece pawn  = new Pawn();

        List<Rules> rules = pawn.getPieceMoveRules();

        assertArrayEquals(expectedRules.toArray(), rules.toArray());
    }
}