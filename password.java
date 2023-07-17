import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class password extends JFrame implements ActionListener{
    JLabel pass,repass;
    JTextField pa,re;
    JButton btn;
    password(){
        pass=new JLabel("pass");
        repass=new JLabel("repass");
        pa=new JTextField(20);
        re=new JTextField(20);
        btn=new JButton("click");
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(pass);
        add(pa);
        add(repass);
        add(re);
        add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(pa.getText().equals(re.getText())){
            btn.setText("welcome");
        }else{
            btn.setText("wrong");
        }
    }
    public static void main(String[] args) {
        new password();
    }
}