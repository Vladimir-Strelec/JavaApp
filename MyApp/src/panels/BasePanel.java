package panels;

import frames.BarFrame;

import javax.swing.*;
import java.awt.*;

public class BasePanel extends JPanel {
    public BarFrame frame;
    public BasePanel(BarFrame frame) {
        this.frame = frame;
        setLayout(null);
        setBackground(Color.GRAY);

    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
