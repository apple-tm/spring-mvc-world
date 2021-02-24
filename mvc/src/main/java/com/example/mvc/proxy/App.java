package com.example.mvc.proxy;

public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getClass());

        UserDao factory = (UserDao) new ProxyFactory(userDao).getProxyInstance();
        System.out.println(factory.getClass());
        factory.save();
    }
}
