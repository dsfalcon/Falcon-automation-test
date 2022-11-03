package main.java.utils;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

    @Test
    public static Connection  connectDB (){

        Connection con = null;

        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver.load");

           con = DriverManager.getConnection("jdbc:postgresql://qa.tab.kitecash.in:8024/kite_tab_qa","postgres","postgres");
            System.out.println("Connected to database");

        /*    Statement smt=con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * from kite_card.card where enterprise_id='lalitgift15' and card_status='ACTIVE' and online_channel_status='ENABLED' and pos_channel_status='ENABLED'");
           // ResultSet rs = smt.executeQuery(dbQuery);

            while(rs.next()) {
                System.out.print(rs.getString(1));
                System.out.println();
            }*/

        }catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }
}
