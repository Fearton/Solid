package services;

import interfaces.Saveable;
import models.User;

public class Saver implements Saveable {
    private final User user;

    public Saver(User user){
        this.user = user;
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
