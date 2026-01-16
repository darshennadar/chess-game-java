package com.mycompany.chessgame;

/**
 *
 * @author darshennadar
 */

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;



public class ChessBoard extends JPanel {
    
    private ChessPieces[][] board = new ChessPieces[8][8];

    public ChessBoard() {
        
         setLayout(new GridLayout(8, 8));
         initialiseBoard();
         drawBoard();
    
    }
    
    private void initialiseBoard() {
                //Placement of Pawns on the board
        for (int col = 0; col < 8; col++) {
            board[1][col] = new ChessPieces("Black", "Pawn");
            board[6][col] = new ChessPieces("White", "Pawn");
        }
        //Other Chess Pieces will be added later
    }
    
    private void drawBoard() {
        
        removeAll();
        
        for (int row = 0; row <8; row++) {
            
            for (int col = 0; col < 8; col ++) {
               
                 JPanel square = new JPanel();
                  if ((row + col) % 2 == 0) square.setBackground(Color.WHITE);
                else square.setBackground(Color.GRAY);
                  
                  
                ChessPieces piece = board[row][col];
                if (piece != null) {
                    square.add(piece.getLabel());
                     }

                add(square);
            }
        }
        revalidate();
        repaint();
    }
}



