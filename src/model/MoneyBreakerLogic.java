package model;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class MoneyBreakerLogic extends JFrame implements ActionListener {
    
    static JFrame f;
 
    static JTextField l;
 
    String s0, s1, s2;
 
    // default constructor
    MoneyBreakerLogic()
    {
        s0 = s1 = s2 = "";
    }
 
    // main function
    public static void main(String args[])
    {
        // frame
        f = new JFrame("Geld verkleinern");
 
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
 
        
        MoneyBreakerLogic c = new MoneyBreakerLogic();
 
        // create a textfield
        l = new JTextField(12);
 
        // set the textfield to non editable
        l.setEditable(false);
 
        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, be, beq, beq1;
        final JTextField son=new JTextField();  
        son.setBounds(50,50, 150,20);  
 
        
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
 
        
        beq1 = new JButton("=");
 
        beq = new JButton("C");
 
        be = new JButton(".");
        
 
        JPanel p = new JPanel();
 
       
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);
 
        
        p.add(l);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);
        p.add(son);
 
        
        p.setBackground(Color.cyan);
 
       
        f.add(p);
 
        f.setSize(400, 320);
        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            
            s0 = s1 = s2 = "";
 
            
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
 
            int te;
 
            
          
            l.setText(s0 + s1 + s2 + "=" + te);
          
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            
            if (s1.equals("") || s2.equals(""))
                s1 = s;            
            else {              
            }
            l.setText(s0 + s1 + s2);
        }
    }
    public void xyz(int eingabe){
        int moneyList[] = new int[]{200,100,50,20,10,5,2,1};
        String result = "";
        for (int money:moneyList){
            int j = eingabe/money;
            for(int i=0; i<j;i++)
                result += money+ "???+";
            eingabe%=money; 
            if (eingabe==0) break;
        }
        System.out.println(result.substring(0,result.length()-1));

    }   
}
