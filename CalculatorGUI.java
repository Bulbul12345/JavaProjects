import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class CalculatorGUI {
    // static double first=0;
    // static String operator="";
    public static void main(String[] args) {
        JFrame f=new JFrame("My Calculator: ");
        f.setSize(300,400);
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField t1=new JTextField(10);
        JTextField t2=new JTextField(10);
        f.add(t1);
        f.add(t2);
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(2,2));
        JButton btn=new JButton("+ ");
        JLabel l=new JLabel();
        p.add(btn);
        JButton btn1=new JButton("-");
        p.add(btn1);
        JButton btn2=new JButton("*");
        p.add(btn2);
        JButton btn3=new JButton("/");
        p.add(btn3);
        JButton btn4=new JButton("=");
        p.add(btn4);
        Font btnfFont=new Font("Arial", Font.BOLD, 24);
        btn.setFont(btnfFont);
        btn1.setFont(btnfFont);
        btn2.setFont(btnfFont);
        btn3.setFont(btnfFont);
        f.add(p);
        f.add(l);
         f.setLayout(new GridLayout(4,2));
        btn.addActionListener(e-> {
            double n1=Double.parseDouble(t1.getText());
            double n2=Double.parseDouble(t2.getText());
            Operation op=new Operation(n1, n2);
            double result=op.add();
            //System.out.println(result);
            l.setText("Result" + result);
            //System.out.println("plus Butoon clicked: ");
        });
         btn1.addActionListener(e-> {
            double n1=Double.parseDouble(t1.getText());
            double n2=Double.parseDouble(t2.getText());
            Operation op=new Operation(n1, n2);
            double result=op.Subtact();
            //System.out.println(result);
            l.setText("Result" + result);
            //System.out.println("plus Butoon clicked: ");
        });
         btn2.addActionListener(e-> {
            double n1=Double.parseDouble(t1.getText());
            double n2=Double.parseDouble(t2.getText());
            Operation op=new Operation(n1, n2);
            double result=op.Multiply();
            //System.out.println(result);
            l.setText("Result" + result);
            //System.out.println("plus Butoon clicked: ");
        });
         btn3.addActionListener(e-> {
            double n1=Double.parseDouble(t1.getText());
            double n2=Double.parseDouble(t2.getText());
            Operation op=new Operation(n1, n2);
            double result=op.Divide();
            //System.out.println(result);
            l.setText("Result" + result);
            //System.out.println("plus Butoon clicked: ");
        });
        f.setVisible(true);
    }
}
