package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class COMPONENTS_PLAY_WINDOW implements BEHAVIOR_PLAY_WINDOW{
    private JButton jButton1;
    private JButton jButton2;
    private ArrayList<Component> list_of_components = new ArrayList<>();
    public COMPONENTS_PLAY_WINDOW() {
jButton1 = new JButton("GET WORD");
jButton2 = new JButton("PRINT YOUR ANSWER");
        jButton1.setBounds(new Rectangle(10,300 , 100,40));
        list_of_components.add(jButton1);
        jButton2.setBounds(new Rectangle(270,300 , 100,40));
        list_of_components.add(jButton2);
        CREATE_BEHAVIOR_GETWORD(jButton1);
    }
    public ArrayList<Component> getArrayList() {
        return list_of_components;
    }
}
