package gui;

import java.sql.*;

//This is a connection database class

    class MysqlUtil {
        private static Connection connection;
        private static Statement statement;
        private static ResultSet rs;

        public static Connection getConnection(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
            String user = "root";
            String password = "root";
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            return connection;
        }
        public static void close() throws SQLException {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
}
