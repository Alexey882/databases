package Databases;
import java.sql.*;

public class DATABASES implements CONNECTIONS_TO_DATABASES, FUNCTION {
    public void ADD_NEW_WORD (String word, String translate_word) throws SQLException, ClassNotFoundException {
        Connection connection = connect_to_db("Alexeybaranov00.", "Dictionary");
        Statement statement = connection.createStatement();
        statement.executeUpdate("create table if not exists dict (id int primary key auto_increment, word varchar (50), " +
                "translation varchar(50));");
        statement.executeUpdate(String.format("insert into dict (word, translation)  values ('%s' , '%s'); " ,word ,translate_word)); //на место %s добавляем строки word ,translate_word
        connection.close();
    }
    public String SEARCH (String search_word) throws SQLException, ClassNotFoundException {
        Connection connection = connect_to_db("Alexeybaranov00.", "Dictionary");
        Statement statement = connection.createStatement();
        String result = "";
        if (IDENTIFY_WORD(search_word)) {
            ResultSet res = statement.executeQuery(String.format("select word from dict where translation = '%s';", search_word));
            while (res.next()) {
                result = res.getString(1);
            };
        }
        else {
            ResultSet res1 = statement.executeQuery(String.format("select translation from dict where word = '%s';", search_word)); // поиск слова, с помощью метода стринг формат, в селекте %s это наша переменная search_word
            while (res1.next()) { // вопрос почему через цикл?
                result = res1.getString(1); // присваиваем значение найденого слова нашей переменной
            }
        }
        return result;
    }
public DATABASES() throws  ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
}
}
