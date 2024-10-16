package org.example.chessBoard;

import org.example.chessBoard.pieces.Pawn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PieceTest {
    @Test
    void should_return_true_for_valid_move(){
        Piece pawn  = new Pawn();

        assertTrue(pawn.isValidMove(1,1));
    }

    @Test
    void should_return_false_for_Invalid_move(){
        Piece pawn  = new Pawn();

        assertFalse(pawn.isValidMove(8,1));
    }
}