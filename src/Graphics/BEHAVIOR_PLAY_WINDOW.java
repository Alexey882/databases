package Graphics;

import Databases.PLAYING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Map;

public interface BEHAVIOR_PLAY_WINDOW extends PLAYING{
    public default void CREATE_BEHAVIOR_GETWORD(JButton jButton){
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer  = JOptionPane.showInputDialog("Print what you want to translate (russian(true) or english(false) word)");
                try {
                    JOptionPane.showMessageDialog(null , String.format("word = %s", GETWORD(Boolean.parseBoolean(answer)).keySet().iterator().next()));
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }

            }
        });
    }
    public default void CREATE_BEHAVIOR_CHECK_WORD(){}

}
