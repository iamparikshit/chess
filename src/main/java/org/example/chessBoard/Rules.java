package org.example.chessBoard;

public enum Rules {
    Up(-1, 0),
    Down(1, 0),
    Left(0, -1),
    Right(0, 1),
    LeftUp(-1, -1),
    RightUp(-1, 1),
    LeftDown(1, -1),
    RightDown(1,1);
    final int row;
    final int column;

    public int getColumn(int columnIndex) {
        return columnIndex + column;
    }

    public int getRow(int rowIndex) {
        return rowIndex + row;
    }

    Rules(int row, int column) {
        this.row = row;
        this.column = column;
    }

}
