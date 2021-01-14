package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CONNECTIONS_TO_DATABASES {
     public default Connection connect_to_db(String password, String name_DB) throws ClassNotFoundException, SQLException{
        String connections = "jdbc:mysql://localhost:3306/";
        String add_connections = "?serverTimezone=Europe/Moscow";
        String user = "root";
        String all_connections = connections + name_DB + add_connections;

        Connection connection = DriverManager.getConnection(all_connections, user, password);
        return connection;
    }

}
