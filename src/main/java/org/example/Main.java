package org.example;

import org.example.chessBoard.ChessBoard;
import org.example.chessBoard.IPiece;
import org.example.chessBoard.factory.PieceFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String[] pieces = new String[]{"Pawn", "King", "Queen"};
    public static void main(String[] args) throws Exception {

        System.out.println("Please enter the Piece Number");
        System.out.println("Enter 1 for Pawn");
        System.out.println("Enter 2 for King");
        System.out.println("Enter 3 for Queen");
        System.out.println("Enter 0 for Exit");
        Scanner sc = new Scanner(System.in);
        int pieceInput = sc.nextInt();
        if(pieceInput == 0) {
            System.exit(1);
        }
        else if(pieceInput <= 3){
            System.out.println("You have selected "+ pieces[pieceInput-1]+", Now please enter its position");
            String position = sc.next();
            if(position.length() == 2){
                ChessBoard cb = new ChessBoard();
                cb.display();
                IPiece piece = PieceFactory.createPiece(pieces[pieceInput -1]);
                List<String> outcomes = cb.outComes(piece, position);
                System.out.println("POSSIBLE OUTCOMES ARE : "+outcomes);
            }
            else{
                System.out.println("Please enter correct position between range [A1..A8...H8]");
            }

        }


    }
}

