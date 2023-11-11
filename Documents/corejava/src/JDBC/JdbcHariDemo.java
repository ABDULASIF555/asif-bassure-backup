package JDBC;

import java.sql.*;

public class JdbcHariDemo {
//
//    public static void main(String[] args) throws Exception {
//        String url = "jdbc:mysql://bassure.in:3306/abdulasif_b8_db";
//        String user_name = "abdulasif";
//        String password = "sibASdul@555";
//        String query = "insert into student values(?,?)";
//
//        try (  Connection connection = DriverManager.getConnection(url, user_name, password); PreparedStatement PStatement = connection.prepareStatement(query);) {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println(connection.getClass().getName());
//            PStatement.setInt(1, 3);
//            PStatement.setString(2, "bawa");
//
//            int affected_rows_count = PStatement.executeUpdate();
//            System.out.println(affected_rows_count + " row is affected.");
//        }
//
//    }

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://bassure.in:3306/abdulasif_b8_db";
        String user_name = "abdulasif";
        String password = "sibASdul@555";
        String query = "{call getEmployeeByDesignation(?)}";

        try {
            Connection connection = DriverManager.getConnection(url, user_name, password);
            CallableStatement prepareCall = connection.prepareCall(query);
            prepareCall.setString("des", "developer");
            ResultSet rs = prepareCall.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getInt(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+" ");
                System.out.print(rs.getString(4)+" ");
                System.out.print(rs.getString(5)+" ");

            }

        } catch (Exception exception) {
            System.out.println("exe");

        }
    }

}



