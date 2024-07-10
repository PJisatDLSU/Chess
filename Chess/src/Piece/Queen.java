package Piece;

import Main.GamePanel;

public class Queen extends  Piece{
    public Queen(int color, int col, int row){
        super(color, col, row);
        if(color == GamePanel.WHITE){
            image = getImage("/Piece/w-queen");
        }
        else{
            image = getImage("/Piece/b-queen");
        }
    }
}
