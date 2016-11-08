package ru.etg.prog.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Prog on 08.11.2016.
 */
public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/webclients";
    private static final String USERNAME = "root";
    private static final String PASWORD = "root";
    private Connection connection;

    public DBWorker() {
       try {
           connection = DriverManager.getConnection(URL,USERNAME,PASWORD);
       } catch (SQLException e ){
           e.printStackTrace();
       }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
//        try {
////            Driver driver = new FabricMySQLDriver();
////            DriverManager.registerDriver(driver);
//
////            connection = DriverManager.getConnection(URL,USERNAME, PASWORD);
////            if(!connection.isClosed()){
////                System.out.println("Соединение с БД установлено");
////            }
////            if(connection.isClosed()){
////                System.out.println("Соединение с БД закрыто");
////            }
////            connection.close();
//        } catch (SQLException e) {
//            System.err.println("Не удалось загрузить класс драйвера!");
//        }
    }

}
