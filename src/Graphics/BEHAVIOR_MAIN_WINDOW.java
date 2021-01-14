package Graphics;

import Databases.DATABASES;

import javax.swing.*;
import java.awt.event.ActionEvent;

public interface BEHAVIOR_MAIN_WINDOW {
    public default void CREATE_BEHAVIOR_PLAY(JButton jButton){
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
new PLAY_WINDOW(new COMPONENTS_PLAY_WINDOW().getArrayList());
            }
        });
    }
    public default void CREATE_BEHAVIOR_ADD(JButton jButton){
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String russ_word = JOptionPane.showInputDialog("new russian word");
                String eng_word = JOptionPane.showInputDialog(" translate your word ");
                JOptionPane.showMessageDialog(null , String.format("Your new word -  %s  - %s" ,russ_word,eng_word ));
                try {
                    new DATABASES().ADD_NEW_WORD(russ_word , eng_word);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null , e.toString());
                }
            }
        });
    }
    public default void CREATE_BEHAVIOR_SEARCH(JButton jButton) {
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = JOptionPane.showInputDialog("input word for translate ");
                String translate = "";
                try {
                    translate = new DATABASES().SEARCH(word);
                } catch (Exception exception){
                    System.out.println(exception.toString());
                }
                JOptionPane.showMessageDialog(null, String.format("Translate this word  - %s" , translate));
            }
        });

    }
}
