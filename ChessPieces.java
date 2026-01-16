package com.mycompany.chessgame;

/**
 *
 * @author darsh
 */

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ChessPieces {
    
    private String pieceType;
    private JLabel pieceLabel;
    private String pieceColour;
    
    public ChessPieces (String pieceType, String pieceColour) {
        
        this.pieceColour = pieceColour;
        this.pieceType = pieceType;
       pieceLabel = new JLabel(pieceType.substring(0,1));
        if(pieceColour.equals("Black")) pieceLabel.setForeground(java.awt.Color.BLACK);
        else pieceLabel.setForeground(java.awt.Color.WHITE);
    }
        
 public JLabel getLabel() {
        return pieceLabel;
    }
}

