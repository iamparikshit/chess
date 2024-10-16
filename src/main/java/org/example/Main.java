package org.example;

import org.example.chessBoard.ChessBoard;
import org.example.chessBoard.Piece;
import org.example.chessBoard.factory.PieceFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String[] pieces = new String[]{"PAWN", "KING", "QUEEN"};
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PIECE AND ITS POSITION (eg : King, E3)");
        String[] input = sc.nextLine().split(", ");
        String pieceType = input[0].trim().toUpperCase();
        String position = input[1].trim();

        if(position.length() == 2 && List.of(pieces).contains(pieceType)){
            ChessBoard chessBoard = new ChessBoard();
            Piece piece = PieceFactory.createPiece(pieceType);
            List<String> outcomes = chessBoard.getOutcomes(piece, position);

            System.out.println("POSSIBLE OUTCOMES ARE : "+outcomes);
        }
        else{
            System.out.println("PLEASE ENTER THE CORRECT INPUT (eg : King, E3)");
        }
    }
}

