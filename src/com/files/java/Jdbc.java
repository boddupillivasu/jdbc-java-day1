package com.files.java;

import java.sql.*;

import static javax.print.attribute.standard.MediaSizeName.C;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {



        try {
            //load or register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //define the connection url for mysql database;
            String url="jdbc:mysql://localhost:3306/vasu";
            String userName="root";
            String password="786786";

            //establish the connection between the java class and database
            Connection con =DriverManager.getConnection(url,userName,password);

            //creating statement object using con
            Statement stmtObj=con.createStatement();

            //Execute the Queries
            String query="insert into employee1 values(1001,'smith',3000)";

            int iobj=stmtObj.executeUpdate(query);

            if(iobj>0) {
                System.out.println("Record is inserted Successfully");
            }else {
                System.out.println("Record is Not Inserted ");
            }

            //close the objects
            stmtObj.close();
            con.close();


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
