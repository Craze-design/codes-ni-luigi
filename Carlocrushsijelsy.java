/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carlocrushsijelsy;
import java.awt.*;
import java.awt.event.*;
public class Carlocrushsijelsy {

    
    public static void main(String[] args) {
            Frame frame = new Frame("hello");
            Label lb1 = new Label("Label1");
            Label lb2 = new Label("Label2");
            Label lb3 = new Label("Label3");
            TextField txt = new TextField("");
            TextArea txtArea = new TextArea("HAHAHAHAHAHHAHA");
            Checkbox checkbox1 = new Checkbox("Luigi ");
            Checkbox checkbox2 = new Checkbox("carlo");
            Checkbox checkbox3 = new Checkbox("Curt");
            Checkbox checkbox4 = new Checkbox("Baguisi");
            Checkbox checkbox5 = new Checkbox("Ben");
            Button btn = new Button("Button");
            txt.setPreferredSize(new Dimension(100,30));
            frame.setSize(500,350);
            frame.setResizable(true);
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());
            
            frame.add(lb1);
            frame.add(lb2);
            frame.add(lb3);
            frame.add(txt);
            frame.add(txtArea);
            frame.add(checkbox3);
            frame.add(checkbox1);
            frame.add(checkbox2);
            frame.add(checkbox4);
            frame.add(checkbox5);
            frame.add(btn);
            
    }
    
}
