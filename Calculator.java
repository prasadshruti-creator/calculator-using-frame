import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
  JLabel l1,l2,l3,l4,l5;
   JTextField t1,t2;
  JButton b1,b2,b3,b4,b5;

  Calculator()
 {
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
   setSize(1200,700);
  setLocation(10,20);
  setTitle ("My Calculator");
   setDefaultCloseOperation(EXIT_ON_CLOSE);
  getContentPane().setBackground(Color.pink);
  
  l1=new JLabel("CALCULATOR");
  l2=new JLabel("FIRST NUMBER");
l3=new JLabel("SECOND NUMBER");
l4=new JLabel("RESULT");
l5=new JLabel("*******");
t1=new JTextField(10);
t2=new JTextField(10);
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton ("/");
b5=new JButton("%");
l1.setBounds(200,100,200,25);
l2.setBounds(50,150,200,25);
l3.setBounds(50,200,200,25);
l4.setBounds(50,250,200,25);
l5.setBounds(250,250,200,25);
t1.setBounds(250,150,200,25);
t2.setBounds(250,200,200,25);
b1.setBounds(50,350,100,50);
b2.setBounds(200,350,100,50);
b3.setBounds(350,350,100,50);
b4.setBounds(500,350,100,50);
b5.setBounds(650,350,100,50);
t1.setBackground(Color.YELLOW);
t2.setBackground(Color.YELLOW);
b1.setBackground(Color.GREEN);
b2.setBackground(Color.GREEN);
b3.setBackground(Color.GREEN);
b4.setBackground(Color.GREEN);
b5.setBackground(Color.GREEN);
l1.setForeground(Color.red);
l2.setForeground(Color.red);
l3.setForeground(Color.red);
l4.setForeground(Color.red);
l5.setForeground(Color.red);	 
b1.setForeground(Color.red);
b2.setForeground(Color.red);
b3.setForeground(Color.red);
b4.setForeground(Color.red);
b5.setForeground(Color.red);
setLayout(null);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setVisible(true);
}
 public void actionPerformed(ActionEvent e)
  {
       double x,y,r;
        try
       {
          x=Double.parseDouble(t1.getText());
          y=Double.parseDouble(t2.getText());
      if(e.getSource()==b1)
      {
         r=x+y;
       l5.setText(r+" ");
      }
        else if(e.getSource()==b2)
      {
         r=x-y;
       l5.setText(r+" ");
      }
       else  if(e.getSource()==b3)
      {
         r=x*y;
       l5.setText(r+" ");
      }
        else if(e.getSource()==b4)
      {
         r=x/y;
       l5.setText(r+" ");
      }
     else  if(e.getSource()==b5)
      {
         r=x*y;
       l5.setText(r+" ");
      }
   }
     catch(Exception e1)
      {
          JOptionPane.showMessageDialog(this,"ARE IDIOTS,Don't cross the limit");
          JOptionPane.showMessageDialog(this,"plz enter any num ber");
         t2.requestFocus();
     }
   } 
  public static void main (String args[])
      {
           Calculator obj =new Calculator();
      }
}
