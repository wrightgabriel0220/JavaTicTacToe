package com.wrightgabriel.tictactoe.gui;

import com.wrightgabriel.tictactoe.gui.components.TicTacToeBoard;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class GUI {

    public GUI() {

        Dimension BASE_FULL_DIMENSION = new Dimension(800, 600);

        JFrame frame = new JFrame();

        frame.add(new TicTacToeBoard(BASE_FULL_DIMENSION.height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.setPreferredSize(BASE_FULL_DIMENSION);
        frame.pack();
        frame.setVisible(true);

    }
}
