package Databases;
import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public interface FUNCTION {
     public default boolean IDENTIFY_WORD(String word){
        //true english_word
        //false otherwise
        Pattern english_word = Pattern.compile("[A-Za-z]{1,}");
        Pattern russian_word = Pattern.compile("[А-Яа-я]{1,}");
        Matcher matcher = english_word.matcher(word);
        int Russian = 0;
        int English = 0;
        while (matcher.find()) {
            English++;
        }
        matcher = russian_word.matcher(word);
        while (matcher.find()) {
            Russian++;
        }
        return English > Russian;
    }
}
