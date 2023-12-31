/**
 * A Simple Game System Project
 * by: Michelle Banwag
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Game Login");
        setSize(300, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Michelle A. Banwag\\Downloads\\iii.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setLayout(new GridLayout(4, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login & Play");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check login credentials
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (isValidLogin(username, password)) {
                    dispose(); // Close the login frame
                    startGame(); // Proceed to the game
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        backgroundLabel.add(usernameLabel);
        backgroundLabel.add(usernameField);
        backgroundLabel.add(passwordLabel);
        backgroundLabel.add(passwordField);
        backgroundLabel.add(new JLabel());
        backgroundLabel.add(loginButton);

        setContentPane(backgroundLabel);
    }

    private boolean isValidLogin(String username, String password) {
        return username.equals("123") && password.equals("321");
    }

    private void startGame() {
        JFrame gameFrame = new JFrame();
        GamePlay gamePlay = new GamePlay();

        gameFrame.setBounds(10, 10, 700, 600);
        gameFrame.setTitle("Break It Ball");
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.add(gamePlay);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
