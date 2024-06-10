/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ACTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new Frame("Welcome User");
        Label lblname = new Label("Username");
        Label lblpass = new Label("Password");
        TextField txtname = new TextField();
        TextField txtpass = new TextField();
        Button btn = new Button("Submit");
        
        
        frame.setVisible(true);
        frame.setSize(250,250);
        frame.setLayout(new FlowLayout());
        
        txtname.setPreferredSize(new Dimension(100, 27));
        txtpass.setPreferredSize(new Dimension(100, 27));
        txtpass.setEchoChar('*');
        
        frame.add(lblname);
        frame.add(txtname);
        frame.add(lblpass);
        frame.add(txtpass);
        frame.add(btn);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
    });
     btn.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e){
            String name = txtname.getText();
            String pass = txtpass.getText();
            
            System.out.println("Your Username is " + name);
            System.out.println("Your Password is " + pass);
            
            txtname.setText("");
            txtpass.setText("");
    } 
    });
     
    }
  }
