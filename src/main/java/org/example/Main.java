package org.example;

import org.example.chessBoard.ChessBoard;
import org.example.chessBoard.IPiece;
import org.example.chessBoard.factory.PieceFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String[] pieces = new String[]{"Pawn", "King", "Queen"};
    public static void main(String[] args) throws Exception {

        System.out.println("PLEASE SELECT THE NUMBER FOR RESPECTIVE PIECE");
        System.out.println("ENTER 1 FOR PAWN");
        System.out.println("ENTER 2 FOR KING");
        System.out.println("ENTER 3 FOR QUEEN");
        System.out.println("ENTER 0 FOR EXIT");
        Scanner sc = new Scanner(System.in);
        int pieceInput = sc.nextInt();
        if(pieceInput == 0) {
            System.exit(1);
        }
        else if(pieceInput <= 3){
            ChessBoard cb = new ChessBoard();
            cb.display();
            System.out.println();

            System.out.println("YOU HAVE SELECTED "+ pieces[pieceInput-1].toUpperCase()+", " +
                    "NOW PLEASE ENTER ANY ITS POSITION IN ABOVE FORMAT. EG : G2");

            String position = sc.next();

            if(position.length() == 2){
                IPiece piece = PieceFactory.createPiece(pieces[pieceInput -1]);
                List<String> outcomes = cb.outComes(piece, position);

                System.out.println("POSSIBLE OUTCOMES ARE : "+outcomes);
            }
            else{
                System.out.println("PLEASE ENTER THE CORRECT POSITION BETWEEN RANGE : [A1..A8...H8]");
            }

        }
    }
}

