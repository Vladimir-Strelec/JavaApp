package panels;

import frames.BarFrame;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends BasePanel{

    public LoginPanel(BarFrame frame) {
        super(frame);
        JLabel welcomeLabel = new JLabel("Welcome to the Bar");
        welcomeLabel.setBounds(frame.getWidth()/2 - 150, 100, frame.getWidth() / 3, 50);
        welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 26));
        welcomeLabel.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(welcomeLabel);

        JLabel enterPassLabel = new JLabel("Enter password", JLabel.CENTER);
        enterPassLabel.setBounds(frame.getWidth() / 2 - 150, welcomeLabel.getY()+50, frame.getWidth() / 3, 50);
        enterPassLabel.setFont(new Font("Italic", Font.BOLD, 15));
        enterPassLabel.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(enterPassLabel);

        JTextField nameField = new JTextField("Name");
        nameField.setBounds(frame.getWidth() / 2 - 100, enterPassLabel.getY()+60, frame.getWidth() / 3 - 100, 25);
        add(nameField);


        JTextField painField = new JTextField("Password");
        painField.setBounds(frame.getWidth() / 2 - 100, nameField.getY()+40, frame.getWidth() / 3 - 100, 25);
        add(painField);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(frame.getWidth() / 2 - 100, painField.getY()+50, frame.getWidth() / 3 - 100, 40);
        loginButton.setBackground(new Color(192,192,192));
        loginButton.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        loginButton.addActionListener(e -> {
            if(e.getSource() == loginButton) {
                System.out.println("OKOKOKOKOKOKO");
            }
        });
        add(loginButton);

        JButton registerButton = new JButton("Registration");
        registerButton.setBounds(frame.getWidth() / 2 - 100, loginButton.getY()+50, frame.getWidth() / 3 - 100, 40);
        registerButton.setBackground(new Color(192,192,192));
        registerButton.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        registerButton.addActionListener(e -> {
            if(e.getSource() == registerButton) {
                frame.router.showRegister();
            }
        });
        add(registerButton);
    }
}
