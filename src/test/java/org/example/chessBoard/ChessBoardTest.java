package org.example.chessBoard;

import org.example.chessBoard.factory.PieceFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    @Test
    void return_possible_outcome_of_PAWN_for_G1_Position() throws Exception {
        ChessBoard cb = new ChessBoard();
        String type = "PAWN";
        List<String> expectedOutCome = List.of("G2");

        var outcomes = cb.getPossibleOutcomes(PieceFactory.createPiece(type), "G1");

        assertArrayEquals(expectedOutCome.toArray(), outcomes.toArray());
    }

    @Test
    void return_possible_outcome_of_KING_for_D5_Position() throws Exception {
        ChessBoard cb = new ChessBoard();
        String type = "KING";
        List<String> expectedOutCome = List.of("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6");

        var actualOutcomes = cb.getPossibleOutcomes(PieceFactory.createPiece(type), "D5");

        assertTrue(
                expectedOutCome.size() == actualOutcomes.size()
                && actualOutcomes.containsAll(expectedOutCome)
                && expectedOutCome.containsAll(actualOutcomes)
        );
    }

    @Test
    void return_possible_outcome_of_QUEEN_for_E4_Position() throws Exception {
        ChessBoard cb = new ChessBoard();
        String type = "QUEEN";
        List<String> expectedOutCome = List.of("A4", "B4", "C4", "D4", "F4", "G4", "H4", "E1", "E2", "E3",
                "E5", "E6", "E7", "E8", "A8", "B7", "C6", "D5", "F3", "G2", "H1", "B1", "C2", "D3", "F5", "G6", "H7");

        var actualOutcomes = cb.getPossibleOutcomes(PieceFactory.createPiece(type), "E4");

        assertTrue(
                expectedOutCome.size() == actualOutcomes.size()
                        && actualOutcomes.containsAll(expectedOutCome)
                        && expectedOutCome.containsAll(actualOutcomes)
        );
    }
}