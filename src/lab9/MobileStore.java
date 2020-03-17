package lab9;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {
    public static void main(String[] args) {
        //step1
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        //step2
        ArrayList<Mobile> myMB = new ArrayList<Mobile>();
        String SQCONN ="jdbc:sqlite:Mobile.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null){
                System.out.println("Could not connect to database.");
            }else  {
                System.out.println("Connected to database.");
            }
        //step3
            Statement stmt = conn.createStatement();
            String sql ="select * from MobileStore";
            ResultSet rs = stmt.executeQuery(sql);

            //step4

             System.out.println("MobileStore Informayiom");

            while (rs.next()){
                Mobile mb = new Mobile(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5));
                myMB.add(mb);
            }

        //step5
            rs.close();
            stmt.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        //display data as object
        System.out.println("Data as object");
        for (Mobile e:myMB) {
            System.out.println(e.toString());

        }


    }
}
