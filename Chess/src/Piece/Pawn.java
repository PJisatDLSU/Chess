package Piece;

import Main.GamePanel;

public class Pawn extends  Piece{
    public Pawn(int color, int col, int row){
        super(color, col, row);
        if(color == GamePanel.WHITE){
            image = getImage("/Piece/w-pawn");
        }
        else{
            image = getImage("/Piece/b-pawn");
        }
    }
}
