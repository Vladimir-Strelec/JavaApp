package frames;

import panels.BasePanel;
import panels.RegisterPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BarFrame extends JFrame implements ActionListener, MouseListener {
    public BarRouter router;
    public BarDataProvider dataProvider;
    public BasePanel panel;
    public BarFrame(){
        super("Hallo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        setLayout(null);

        router = new BarRouter(this);
        dataProvider = new BarDataProvider();
        panel = new BasePanel(this);

        router.showLogin();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().getClass() == RegisterPanel.class) {
            router.showRegister();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
