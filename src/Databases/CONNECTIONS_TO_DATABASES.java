package Databases;

import java.sql.Connection;
import java.sql.SQLException;

public interface CONNECTIONS_TO_DATABASES {
    public Connection connect_to_db(String password, String name_DB) throws ClassNotFoundException, SQLException;

}
