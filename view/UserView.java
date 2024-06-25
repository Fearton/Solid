package view;

import interfaces.Reporteable;
import interfaces.Saveable;
import models.User;
import services.Report;
import services.Saver;

public class UserView {
    
    private User user = new User("Bob");
    private Saveable saveable = new Saver(user);
    private Reporteable reporteable = new Report(user);


    public void save() {
        saveable.save();
    }

    public void report() {
        reporteable.report();
    }
}
