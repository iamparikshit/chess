package org.example.chessBoard;

import org.example.chessBoard.pieces.King;
import org.example.chessBoard.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public interface IPiece {
    List<String> getPossibleOutcome(int row, int column, String[][]board);


    default List<String> getUpStep(int row, int column, String[][] board){
        if(row == 0){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[--row][column]);
        }else {
            List<String> possibleUpSteps = new ArrayList<>();
            for(int index = row-1; index >= 0; index--){
                possibleUpSteps.add(board[index][column]);
            }
            return possibleUpSteps;
        }
    }

    default List<String> getLeftStep(int row, int column, String[][] board){
        if(column == 0){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[row][--column]);
        }else {
            List<String> possibleLeftSteps = new ArrayList<>();
            for(int index = column-1; index >= 0; index--){
                possibleLeftSteps.add(board[row][index]);
            }
            return possibleLeftSteps;
        }
    }

    default List<String> getRightStep(int row, int column, String[][] board){
        if(column == 7){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[row][++column]);
        }else {
            List<String> possibleRightSteps = new ArrayList<>();
            for(int index = column+1; index <= 7; index++){
                possibleRightSteps.add(board[row][index]);
            }
            return possibleRightSteps;
        }
    }

    default List<String> getDownStep(int row, int column, String[][] board){
        if(row == 7){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[++row][column]);
        }else {
            List<String> possibleDownSteps = new ArrayList<>();
            for(int index = row+1; index <= 7; index++){
                possibleDownSteps.add(board[index][column]);
            }
            return possibleDownSteps;
        }
    }

    default List<String> getLeftUpStep(int row, int column, String[][] board){
        if(row == 0 || column == 0){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[--row][--column]);
        }else {
            List<String> possibleDownSteps = new ArrayList<>();
            row--;
            column--;
            while(row>=0 && column >=0){
                possibleDownSteps.add(board[row][column]);
                row--;
                column--;
            }
            return possibleDownSteps;

        }
    }

    default List<String> getRightUpStep(int row, int column, String[][] board){
        if(row == 0 || column == 7){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[--row][++column]);
        }else {
            List<String> possibleDownSteps = new ArrayList<>();
            row--;
            column++;
            while(row>=0 && column <=7){
                possibleDownSteps.add(board[row][column]);
                row--;
                column++;
            }
            return possibleDownSteps;
        }
    }

    default List<String> getLeftDownStep(int row, int column, String[][] board){
        if(row == 7 || column == 0){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[++row][--column]);
        }else {
            List<String> possibleDownSteps = new ArrayList<>();
            row++;
            column--;
            while(row<=7 && column >=0){
                possibleDownSteps.add(board[row][column]);
                row++;
                column--;
            }
            return possibleDownSteps;
        }
    }

    default List<String> getRightDownStep(int row, int column, String[][] board){
        if(row == 7 || column == 7){ return  List.of(); }
        if(this instanceof Pawn || this instanceof King){
            return List.of(board[++row][++column]);
        }else {
            List<String> possibleDownSteps = new ArrayList<>();
            row++;
            column++;
            while(row<=7 && column <=7){
                possibleDownSteps.add(board[row][column]);
                row++;
                column++;
            }
            return possibleDownSteps;
        }
    }
}
