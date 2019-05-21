package com.stackroute.db;

import java.sql.*;

public class CrudOperation {
private Connection con;
    public void displayData() {
        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
            //create statement object
            System.out.println("got connected");

            Statement stmt=con.createStatement();


            //execute query
            ResultSet rs=stmt.executeQuery("select * from customer");
            //process result
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));

        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayCustomrerByName(String name,String gender) {

        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
            //create statement object
            System.out.println("got connected");

            PreparedStatement stmt=con.prepareStatement("Select * from customer where name=? and gender = ?");
            stmt.setString(1,name);
            stmt.setString(2,gender);
            ResultSet rs = stmt.executeQuery();
            //execute query
          //  ResultSet rs=stmt.executeQuery("select * from customers");
            //process result
            while(rs.next())
                System.out.println("ID "+rs.getInt(1)+"  "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertCustomer(int id, String name) {

        //PreparedStatement
    }

    public void displayCustomrerByName(String Aditya) {
    }
}
