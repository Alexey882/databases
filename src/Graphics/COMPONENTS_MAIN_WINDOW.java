package Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class COMPONENTS_MAIN_WINDOW implements BEHAVIOR_MAIN_WINDOW {
    private ArrayList<Component> list_of_components ;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    public COMPONENTS_MAIN_WINDOW() {
          list_of_components = new ArrayList<>();
          jButton1 = new JButton(" ADD ");
         jButton1.setBounds(new Rectangle(10,300 , 100,40));
         list_of_components.add(jButton1);
         jButton2 = new JButton(" SEARCH ");
        jButton2.setBounds(new Rectangle(270,300 , 100,40));
        list_of_components.add(jButton2);
        jButton3 = new JButton("PLAY");
        jButton3.setBounds(new Rectangle(150 , 300 , 100 , 40 ));
        list_of_components.add(jButton3);
        CREATE_BEHAVIOR_ADD(jButton1);
        CREATE_BEHAVIOR_SEARCH(jButton2);
        CREATE_BEHAVIOR_PLAY(jButton3);
    }
    public ArrayList<Component> getArrayList() {
        return list_of_components;
    }
}
