import javax.swing.*;
import java.awt.*;
public class CalculatorUI {
    public static void main(String[] args) {
        JFrame f=new JFrame("Calculator: ");
      f.setLayout(new BorderLayout());
        JTextField t=new JTextField(20);
        f.add(t,BorderLayout.NORTH);
          
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(4, 4));
        f.add(p,BorderLayout.CENTER);
         String[] buttons = {
            "1","2","3","+",
            "4","5","6","-",
            "7","8","9","*",
            "C","0","=","/"
        };

        for(String b : buttons){
            p.add(new JButton(b));
        }

        f.add(p, BorderLayout.CENTER);
        f.setSize(300,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
