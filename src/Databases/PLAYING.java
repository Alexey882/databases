package Databases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
public interface PLAYING extends CONNECTIONS_TO_DATABASES {
    public default Map<String,String> GETWORD(boolean answer) throws SQLException, ClassNotFoundException {
        // answer = true where we have a map equals <russian , english>
        //else otherwise
        Connection connection = connect_to_db("AlexeyBaranov00."  , "Dictionary");
        Statement statement = connection.createStatement();
        Map<String , String > pair = new HashMap<>();
        ResultSet resultSet = statement.executeQuery("select  word, transaction from  dict order by rand() limit 1");
        while (resultSet.next()){
            pair.put(resultSet.getString(1), resultSet.getString(2));
        }
        if(answer){
            return pair;
        }
        else{
            return (Map<String, String>) new HashMap<>().put(pair.values().iterator().next() , pair.keySet().iterator().next());
        }
    }
    public default boolean GUESS(Map<String , String> pair , String users_word) {
        return users_word.equals(pair.values().iterator().next());
    }
}
