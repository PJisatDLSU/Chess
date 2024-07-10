package Piece;

import Main.GamePanel;

public class Knight extends  Piece{
    public Knight(int color, int col, int row){
        super(color, col, row);
        if(color == GamePanel.WHITE){
            image = getImage("/Piece/w-knight");
        }
        else{
            image = getImage("/Piece/b-knight");
        }
    }
}
