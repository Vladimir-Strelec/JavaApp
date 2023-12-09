package frames;

import panels.LoginPanel;
import panels.RegisterPanel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BarRouter {
    public int number = 1;
    public BarFrame frame;

    public BarRouter(BarFrame frame) {
        this.frame = frame;

    }

    public void showLogin() {
        LoginPanel panel = new LoginPanel(frame);
        this.frame.setContentPane(panel);
        this.frame.validate();
    }
    public void showRegister() {
        RegisterPanel panel = new RegisterPanel(frame);
        this.frame.setContentPane(panel);
        this.frame.validate();
    }

}
