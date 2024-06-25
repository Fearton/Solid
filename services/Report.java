package services;

import interfaces.Reporteable;
import models.User;

public class Report implements Reporteable {
    private final User user;

    public Report(User user){
        this.user = user;
    }

    @Override
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
