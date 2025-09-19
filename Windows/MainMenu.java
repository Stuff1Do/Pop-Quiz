package Windows;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("GUI WINDOW");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon background = new ImageIcon("./assets/title-page.jpg");
        Image backgroundImage = background.getImage();
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(null);

        JButton startButton = new JButton("Start");
        JButton instrucButton = new JButton("Instructions");
        JButton exitButton = new JButton("Exit");
        startButton.setBounds(475, 475, 350, 70);
        instrucButton.setBounds(475, 550, 350, 70);
        exitButton.setBounds(475, 630, 350, 70);
        backgroundPanel.add(startButton);
        backgroundPanel.add(instrucButton);
        backgroundPanel.add(exitButton);

        setContentPane(backgroundPanel);

        setVisible(true);
    }
}
