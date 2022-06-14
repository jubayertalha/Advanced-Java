package org.example.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    public Home(){
        final JFrame jFrame = new JFrame("Home Page");
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER, 0,20);
        jFrame.setLayout(layoutManager);

        JLabel jLabel = new JLabel("This is a test label\n");
        jFrame.add(jLabel);

        JButton jButton = new JButton("Test Button\n");
        jFrame.add(jButton);

        final JLabel jLabel1 = new JLabel("");
        jFrame.add(jLabel1);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText("Button Clicked");
            }
        });
    }
}
