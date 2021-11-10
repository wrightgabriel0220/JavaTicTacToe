package com.wrightgabriel.tictactoe.gui.components;

import javax.swing.*;
import java.awt.*;

public class TicTacToeBoard extends JTable {
    public TicTacToeBoard(int frameHeight) {
        super(3, 3);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.setRowHeight(frameHeight / this.getRowCount());
        this.setGridColor(Color.BLACK);
        this.setBackground(Color.BLUE);
    }

}
