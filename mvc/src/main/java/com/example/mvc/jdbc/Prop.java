package com.example.mvc.jdbc;

import java.io.InputStream;
import java.util.Properties;

public class Prop {
    public static void main(String[] args) throws Exception {
        InputStream  inputStream = Prop.class.getClassLoader().getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String server = (String)properties.get("server.port");
        System.out.println(server);
    }
}
