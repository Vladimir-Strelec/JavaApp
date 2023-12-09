package panels;
import frames.BarDataProvider;
import frames.BarFrame;
import models.User;
import models.UserType;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RegisterPanel extends BasePanel {
    JLabel titleLabel;
    JLabel nameLabel;
    JLabel phoneNumberLabel;
    JLabel positionLabel;
    JLabel waitressLabel;
    JTextField nameField;
    JTextField phoneNumberField;
    JCheckBox managerCheckBox;
    JCheckBox waitressCheckBox;
    BarDataProvider barDataProvider = new BarDataProvider();
    JButton registerUser;
    public RegisterPanel(BarFrame frame) {
        super(frame);
        createLabel();
        createTextField();
        createCheckBox();
        createButton();
        actionButton();
    }
    public void createLabel() {
        titleLabel = new JLabel("REGISTRATION");
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        titleLabel.setBounds(frame.getWidth()/2 - 100, 60, frame.getWidth() / 3, 65);

        nameLabel = new JLabel("NAME");
        nameLabel.setFont(new Font("Italic", Font.BOLD, 15));
        nameLabel.setBounds(frame.getWidth() / 2 - 150, titleLabel.getY() + 100, frame.getWidth() / 3 - 100, 25);

        phoneNumberLabel = new JLabel("PHONE NUMBER");
        phoneNumberLabel.setFont(new Font("Italic", Font.BOLD, 15));
        phoneNumberLabel.setBounds(frame.getWidth() / 2 - 230, nameLabel.getY() + 50, frame.getWidth() / 3 - 50, 25);

        positionLabel = new JLabel("MANAGER");
        positionLabel.setFont(new Font("Italic", Font.BOLD, 15));
        positionLabel.setBounds(frame.getWidth() / 2 - 200, phoneNumberLabel.getY() + 50, frame.getWidth() / 3 - 50, 25);

        waitressLabel = new JLabel("WAITRESS");
        waitressLabel.setFont(new Font("Italic", Font.BOLD, 15));
        waitressLabel.setBounds(frame.getWidth() / 2 - 50, phoneNumberLabel.getY() + 50, frame.getWidth() / 3 - 50, 25);

        add(titleLabel);
        add(nameLabel);
        add(phoneNumberLabel);
        add(positionLabel);
        add(waitressLabel);
    }

    public void createTextField() {
        nameField = new JTextField();
        nameField.setBounds(frame.getWidth() / 2 - 100, 160, frame.getWidth() / 3 - 110, 25);

        phoneNumberField = new JTextField();
        phoneNumberField.setBounds(frame.getWidth() / 2 - 100, nameField.getY() + 50, frame.getWidth() / 3 - 110, 25);

        add(nameField);
        add(phoneNumberField);
    }

    public void createCheckBox() {
        managerCheckBox = new JCheckBox();
        managerCheckBox.setBounds(frame.getWidth() / 2 - 110, 265, 15, 15);
        managerCheckBox.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        waitressCheckBox = new JCheckBox();
        waitressCheckBox.setBounds(frame.getWidth() / 2 + 40, 265, 15, 15);
        waitressCheckBox.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        ButtonGroup group = new ButtonGroup();
        group.add(managerCheckBox);
        group.add(waitressCheckBox);

        add(managerCheckBox);
        add(waitressCheckBox);
    }
    public void createButton() {
        registerUser = new JButton("REGISTRATION");
        registerUser.setBounds(frame.getWidth() / 2 - 100, 300, frame.getWidth() / 3 - 100, 40);
        registerUser.setBackground(new Color(192,192,192));
        registerUser.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(registerUser);
    }
    public void actionButton() {
        registerUser.addActionListener(e -> {
            if(e.getSource() == registerUser) {
                if(!managerCheckBox.isEnabled()) {
                    createUser(nameField.getText(), barDataProvider.getManager().size(), phoneNumberField.getText(), UserType.MANAGER);
                }
            }
        });
    }
    public void createUser(String name, Integer pinCode, String phoneNumber, UserType type) {
        User user = new User(name, pinCode,  phoneNumber, type);
        barDataProvider.getManager().add(user);
        System.out.println(barDataProvider.getManager());



    }
}
