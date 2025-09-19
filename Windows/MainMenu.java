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
        backgroundPanel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Hello on top of background!", SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        JButton button = new JButton("Click Me");

        backgroundPanel.add(label, BorderLayout.CENTER);
        backgroundPanel.add(button, BorderLayout.SOUTH);

        setContentPane(backgroundPanel);

        setVisible(true);
    }
}
