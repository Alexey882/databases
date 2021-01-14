package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MAIN_WINDOW {
    private JFrame jFrame;
    public MAIN_WINDOW(ArrayList<Component> arrayList){
        jFrame = new JFrame("english word ");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 0 ; i< arrayList.size(); i++){
            jFrame.add(arrayList.get(i));
        }
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
