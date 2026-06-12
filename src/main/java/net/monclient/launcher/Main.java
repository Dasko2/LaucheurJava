package net.monclient.launcher;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mon Launcher Custom");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JLabel label = new JLabel("Connexion Microsoft et options bientôt ici !", SwingConstants.CENTER);
            frame.add(label);

            frame.setVisible(true);
        });
    }
}
