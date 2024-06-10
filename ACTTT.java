/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acttt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;

public class ACTTT {

    
    public static void main(String[] args) {
        Frame frame = new Frame("Shopping List");
        Panel panel = new Panel();
        Label label = new Label();
        
        Checkbox check = new Checkbox("Diwata pares Overload");
        Checkbox check2 = new Checkbox("Hotdog ni bayas");
        Checkbox check3 = new Checkbox("Siomai ni luigi");
        Checkbox check4 = new Checkbox("Tubig ni curt");
        
        frame.setTitle("Grocery List");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(350,350);
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(150,200));
        
        label.setText("Grocery Items");
        
        frame.add(panel);
        panel.add(label);
        panel.add(check);
        panel.add(check3);
        panel.add(check2);
        panel.add(check4);
        
        ItemListener strike = e ->{
        if(e.getStateChange()== ItemEvent.SELECTED){
            ((Checkbox) e.getSource()).setForeground(Color.red);
        }else{
            ((Checkbox) e.getSource()).setForeground(Color.black);
        }
        };
        
        check.addItemListener(strike);
        check2.addItemListener(strike);
        check3.addItemListener(strike);
        check4.addItemListener(strike);
    }
    
}
