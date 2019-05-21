package com.stackroute;

import com.stackroute.db.*;
import com.stackroute.db.CrudOperation;

import java.sql.ResultSetMetaData;

public class Main {
    public static void main(String[] args) {
        CrudOperation crudOperation = new CrudOperation();
//        crudOperation.displayData();
        crudOperation.displayCustomrerByName("Aditya");
        ResultSetMetaDataDemo resultsetmetadata=new ResultSetMetaDataDemo();
        resultsetmetadata.display();
        DatabaseMetaDataDemo databasemetadatademo=new DatabaseMetaDataDemo();
        databasemetadatademo.display();
        JDBCBatchProcessingDemo jdbcbatchprocessingdemo=new JDBCBatchProcessingDemo();
        jdbcbatchprocessingdemo.display();
        JDBCTransactionDemo jdbcTransactionDemo=new JDBCTransactionDemo();
        jdbcTransactionDemo.display();
    }
}