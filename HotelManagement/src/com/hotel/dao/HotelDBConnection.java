package com.hotel.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HotelDBConnection {
    
        private Connection conn;
        public String url = "jdbc:mysql://localhost:3306/";
        public String dbName = "hotel";
        public String driver = "com.mysql.jdbc.Driver";
        
        public String userName = "root";
        public String password = ""; 
       
        protected HotelDBConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url+dbName,userName, password);
        }
 
        protected Connection getConnection(){
            return this.conn;
        }
        
}
