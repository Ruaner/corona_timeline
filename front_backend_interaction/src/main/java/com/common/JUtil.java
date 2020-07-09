//package com.common;
//
//import org.springframework.stereotype.Component;
//
//import java.sql.*;
//
//@Component
//public class JUtil {
//    private String driver = "com.mysql.jdbc.Driver";
//    private String url = "jdbc:mysql://39.97.176.70/test_timeline?useUnicode=true&characterEncoding=UTF-8";
//    private String username = "root";
//    private String password = "password";
//    private Connection connection = null;
//    PreparedStatement preparedStatement = null;
//    ResultSet resultSet = null;
//
//    public JUtil() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(this.url, this.username, this.password);
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public ResultSet executeSQL(String sql) {
//        if (preparedStatement != null) {
//            preparedStatement = null;
//
//        }
//        if (resultSet != null) {
//            resultSet = null;
//        }
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            if (sql.contains("delete") || sql.contains("update") || sql.contains("insert")) {
//                preparedStatement.execute(sql);
//            } else {
//                resultSet = preparedStatement.executeQuery();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            return resultSet;
//        }
//    }
//
///*    public void close() {
//        try {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (resultSet != null) {
//                resultSet.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }*/
//
//
//}
