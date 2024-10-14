package org.example.chessBoard.factory;

import org.example.chessBoard.pieces.King;
import org.example.chessBoard.pieces.Pawn;
import org.example.chessBoard.pieces.Queen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceFactoryTest {

    @Test
    void should_create_object_of_PAWN_when_type_is_PAWN() throws Exception {
        var type = "PAWN";
        var actualObject = PieceFactory.createPiece(type);

        assertTrue(actualObject instanceof Pawn);
    }

    @Test
    void should_create_object_of_KING_when_type_is_KING() throws Exception {
        var type = "KING";
        var actualObject = PieceFactory.createPiece(type);

        assertTrue(actualObject instanceof King);
    }

    @Test
    void should_create_object_of_QUEEN_when_type_is_QUEEN() throws Exception {
        var type = "Queen";
        var actualObject = PieceFactory.createPiece(type);

        assertTrue(actualObject instanceof Queen);
    }

//    @Test
//    void should_throw_exception_when_type_does_not_matches() throws Exception {
//        var type = "NOT_Queen";
//        var actualObject = PieceFactory.createPiece(type);
//
//        assertTrue(actualObject instanceof Queen);
//    }

}