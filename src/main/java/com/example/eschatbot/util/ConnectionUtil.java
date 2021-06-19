package com.example.eschatbot.util;


import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static ConnectionUtil instance = null;

    public static ConnectionUtil getInstance(){
        if(instance == null) {
            instance = new ConnectionUtil();
        }
        return instance;
    }

    public DSLContext getDSLContext() {
        String username = "root";
        String password = "kushwaha";
        String url = "jdbc:mysql://localhost:3306/chatbot";
        DSLContext dslContext = null;
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            dslContext = DSL.using(connection, SQLDialect.MYSQL);
            return dslContext;
        } catch (Exception e){
            e.printStackTrace();
        }

        return dslContext;
    }
}
