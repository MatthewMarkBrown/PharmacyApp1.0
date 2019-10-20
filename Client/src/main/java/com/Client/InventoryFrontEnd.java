package com.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class InventoryFrontEnd extends JFrame {
   private Socket cSocket;

   ObjectOutputStream out;
   ObjectInputStream in;


    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton submitButton;
    private JPanel testPanel;

    public InventoryFrontEnd(){
        try {
            cSocket = new Socket("127.0.0.1", 1996);
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            out = new ObjectOutputStream(cSocket.getOutputStream());
            in = new ObjectInputStream(cSocket.getInputStream());
        }

        catch(Exception e){
            System.out.println(e);
        }




        setTitle("Pharmacy Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(testPanel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              try {
                  String iD = textField1.getText();
                  String medicine = textField2.getText();
                  String equipment = textField3.getText();

                  if (textField1.getText().equals("")) {
                      JOptionPane.showMessageDialog(null, "Please enter a ID");
                  } else if (textField2.getText().equals("")) {
                      JOptionPane.showMessageDialog(null, "Please enter a Medicine");
                  } else if (textField3.getText().equals("")) {
                      JOptionPane.showMessageDialog(null, "Please enter a Equipment");
                  } else {
                      JOptionPane.showMessageDialog(null, "Inventory Add" + "ID" + iD + "Medicine" + medicine + "Equipment" + equipment);

                      textField1.setText("");
                      textField2.setText("");
                      textField3.setText("");
                  }
                  String x = "Inventory added: " + iD + medicine + equipment;
                  System.out.println(x);

                  out.writeUTF(x);
                  out.flush();
              }catch(Exception e){
                  System.out.println(e);
              }
            }
        });
    }



}

