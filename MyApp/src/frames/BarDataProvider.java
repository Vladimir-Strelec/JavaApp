package frames;

import models.User;

import java.util.ArrayList;

public class BarDataProvider {
    private ArrayList<User> manager = new ArrayList<User>();
    private ArrayList<User> waitress = new ArrayList<User>();

    public ArrayList<User> getManager() {
        return manager;
    }

    public void setManager(ArrayList<User> users) {
        this.manager = users;
    }

    public ArrayList<User> getWaitress() {
        return waitress;
    }

    public void setWaitress(ArrayList<User> waitress) {
        this.waitress = waitress;
    }
}
