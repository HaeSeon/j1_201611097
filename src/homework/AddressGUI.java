package homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class AddressGUI extends JFrame implements ActionListener{

AddressData addressData = new AddressData();
  Address address;
  
  
    JTextField a1;
    JTextField a2;
    JTextField a3;
    JTextField a4;

    JButton saveButton;
    JButton deleteButton;
    JButton searchButton;
    JButton exitButton;
    

   JPanel panel;
    
    
    
 
        public AddressGUI() {
    

    
     
        panel=new JPanel(new GridLayout(3,2));
        setTitle("Address");
        getContentPane().add(panel);
        JLabel label1=new JLabel("     Name");
        JLabel label2=new JLabel("     Phone Number:");
        JLabel label3=new JLabel("     KaKaoTalk ID:");
        JLabel label4=new JLabel("     SNS:");
        a1=new JTextField(20);
        a2=new JTextField(20);
        a3=new JTextField(20);
        a4=new JTextField(20);
        
        saveButton = new JButton("Save");
        deleteButton= new JButton("Delete");
        searchButton= new JButton("Search");
        saveButton .setPreferredSize(new Dimension(40, 40));
        saveButton .addActionListener(this);
        deleteButton.addActionListener(this);
        searchButton.addActionListener(this);
        exitButton.addActionListener(this);
        
        panel.add(label1);
        panel.add(a1);
        panel.add(saveButton);
        panel.add(label2);
        panel.add(a2);
        panel.add(deleteButton);
        panel.add(label3);
        panel.add(a3);
        panel.add(searchButton);
        panel.add(label4);
        panel.add(a4);
        panel.add(exitButton);
    }   
    
    
    
    
    
    public void actionPerformed (ActionEvent e) {
      
      
      
      
       JButton b=(JButton)e.getSource();

    if (b==saveButton){
      Address adr = new Address(addressData);
      addressData.setMeasurements(a1.getText(),a2.getText(),a3.getText(),a4.getText());

      a1.setText("");
      a2.setText("");
      a3.setText("");
      a4.setText("");
    } 
    
    else if(b==deleteButton){
    
    }
    
    else if (b==searchButton){}
   }
    
    public static void main(String[] args){
       AddressGUI adr = new AddressGUI();
    adr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    adr.pack();
    adr.setVisible(true);
    
       
      
  
    }
    
}