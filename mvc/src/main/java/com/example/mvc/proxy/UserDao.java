package com.example.mvc.proxy;

public class UserDao {

    public void save() {
        System.out.println("save");
    }

    public void save2() {
        save();
    }
}
