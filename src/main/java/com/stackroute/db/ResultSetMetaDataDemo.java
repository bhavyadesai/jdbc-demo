package com.stackroute.db;
import java.sql.*;

    public class ResultSetMetaDataDemo {

        // public static void main(String args[]){
        private Connection con;
        public void display(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/customerdb","root","Root@123");

                PreparedStatement ps=con.prepareStatement("select * from customer");
                ResultSet rs=ps.executeQuery();
                ResultSetMetaData rsmd=rs.getMetaData();

                System.out.println("Total columns: "+rsmd.getColumnCount());
                System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
                System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
    }


