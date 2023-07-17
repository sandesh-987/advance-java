import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class prime extends JFrame implements ActionListener{
    JLabel number;JTextField n;
    JLabel output,o;
    JButton calculate;
    prime(){
        number = new JLabel("Number");
        n= new JTextField(20);
        output = new JLabel("Output");
        o = new JLabel();
        calculate = new JButton("calculate");
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(number);add(n);
        add(output);add(o);
        add(calculate);
        calculate.addActionListener(this);
    }
    @Override
    public void actionPerformed (ActionEvent re){
        int a=Integer.parseInt(n.getText());
        int c=0;
        for(int i =1;i<=a;i++){
            if(a%i == 0){
                c++;
            }
        }
    if(c<=2){
        o.setText(a+"is a prime number");
    }
    else{
        o.setText(a+"is a composite number");
    }
}
    public static void main(String[] args) {
        new prime();
    }
    }