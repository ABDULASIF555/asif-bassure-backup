/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
 *
 * @author bas200190
 */
public class Jdbc_demo {
    public static void main  (String[] args) {
        String url = "jdbc:mysql://bassure.in:3306/abdulasif_b8_db";
        String user_name = "abdulasif";
        String password  = "sibASdul@555";
        //String query = "select * from student";
        String query = "insert into student values (5,'naveen')";
        
        try ( Connection con = DriverManager.getConnection(url, user_name, password);  Statement st = con.createStatement()) {

            

            //ResultSet rs = st.executeQuery(query);

//            while (rs.next()) {
//                int roll_no = rs.getInt(1);
//                String name = rs.getString(2);
//                System.out.println(roll_no + " : " + name);
//            }

             int ans = st.executeUpdate(query);
             System.out.println(ans+" row affected");
        } catch (Exception e) {
            System.out.println("exception raised..");
        }
        
        
    }
}
