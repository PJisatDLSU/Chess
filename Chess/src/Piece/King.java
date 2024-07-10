package Piece;

import Main.GamePanel;

public class King extends  Piece{
    public King(int color, int col, int row){
        super(color, col, row);
        if(color == GamePanel.WHITE){
            image = getImage("/Piece/w-king");
        }
        else{
            image = getImage("/Piece/b-king");
        }
    }
}
