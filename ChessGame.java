/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chessgame;

/**
 *
 * @author darsh
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class ChessGame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chess Game");
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            frame.add(new ChessBoard());

        });
    }
}