package homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class AddressGUI extends JFrame implements ActionListener{
  Address address;
  JTextField a0;
  JTextField a1;
  JTextField a2;
  JTextField a3;
  JTextField a4;
  
  
  JButton saveButton;
  JButton deleteButton;
  JButton searchButton;
  JButton exitButton;
  JButton reviseButton;
  JPanel panel; 
        public AddressGUI() {
          panel=new JPanel(new GridLayout(5,3));
          setTitle("Address");
          getContentPane().add(panel);
          JLabel label0=new JLabel("     ID");
          JLabel label1=new JLabel("     Name");
          JLabel label2=new JLabel("     Phone Number:");
          JLabel label3=new JLabel("     KaKaoTalk ID:");
          JLabel label4=new JLabel("     SNS:");
          a0=new JTextField(20);                         
          a1=new JTextField(20);
          a2=new JTextField(20);
          a3=new JTextField(20);
          a4=new JTextField(20);
          saveButton = new JButton("Save");
          deleteButton= new JButton("Delete");
          searchButton= new JButton("Search");
          reviseButton=new JButton("Update");
          exitButton = new JButton("Exit");
          saveButton .setPreferredSize(new Dimension(40, 40));
          saveButton .addActionListener(this);
          deleteButton.addActionListener(this);
          searchButton.addActionListener(this);
          reviseButton.addActionListener(this);
          exitButton.addActionListener(this);
          panel.add(label0);
          panel.add(a0);                        
         // panel.add(label1);
          //panel.add(a1);
          panel.add(saveButton);
          panel.add(label1);
          panel.add(a1);
          panel.add(deleteButton);
          panel.add(label2);
          panel.add(a2);
          panel.add(searchButton);
          panel.add(label3);
          panel.add(a3);
          panel.add(reviseButton);
          panel.add(label4);
          panel.add(a4);
          panel.add(exitButton);
    }   
    public void actionPerformed (ActionEvent e) {
      PersonDAOImpl personDAOImpl = new PersonDAOImpl();
        PersonVO person = new PersonVO();
        
       JButton b=(JButton)e.getSource();
       if (b==saveButton){
        person.setId(Integer.parseInt(a0.getText()));
        person.setName(a1.getText());
        person.setPhone(a2.getText());
        person.setKKT(a3.getText());
        person.setSNS(a4.getText());
        System.out.println(person.toString());
        personDAOImpl.insert(person);
       } 
       
       else if(b==deleteButton){
       personDAOImpl.delete(Integer.parseInt(a0.getText()));
       }
       else if (b==searchButton){
       person=personDAOImpl.findById(Integer.parseInt(a0.getText()));
       a0.setText(Integer.toString(person.getId())); 
       a1.setText(person.getName());
       a2.setText(person.getPhone());
       a3.setText(person.getKKT());
       a4.setText(person.getSNS());
        System.out.println(person);
       }
        else if(b==reviseButton){
        person.setId(Integer.parseInt(a0.getText()));
        person.setName(a1.getText());
        person.setPhone(a2.getText());
        person.setKKT(a3.getText());
        person.setSNS(a4.getText());
        System.out.println(person.toString());
    personDAOImpl.update(person);
    }
        
        else if(b==exitButton){
        System.exit(0);
        }
    }
    
    
   
    public static void main(String[] args){
      AddressGUI adr = new AddressGUI();
      adr.setDefaultCloseOperation(EXIT_ON_CLOSE);
      adr.pack();
      adr.setVisible(true);     
    }
    
}