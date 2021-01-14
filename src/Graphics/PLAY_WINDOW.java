package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PLAY_WINDOW {
    private JFrame jFrame;
    public PLAY_WINDOW(ArrayList<Component> list_of_components){
        jFrame = new JFrame("english word ");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 0 ; i< list_of_components.size(); i++){
            jFrame.add(list_of_components.get(i));
        }
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
