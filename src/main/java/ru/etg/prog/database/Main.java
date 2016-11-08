package ru.etg.prog.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import javax.jws.soap.SOAPBinding;
import java.awt.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "select * from users_web";

        try {
            Statement statement = worker.getConnection().createStatement();
           ResultSet resultSet =  statement.executeQuery(query);

            while (resultSet.next()){
                Users user =new Users();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
