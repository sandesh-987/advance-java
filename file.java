 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
  class file extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenuBar file,edit,view;
    JMenuBar new,open,cut,copy,paste;
    public file extends(){
        mb = new JMenuBar();
        file= new JMenu("file");
        edit= new JMenu("edit");
        view= new JMenu("view");
        new= new JMenuItem("new");
        cut= new JMenuItem("cut");
        copy= new JMenuItem("copy");
        file.add(nnew);
        file.add(open);
        edit.add(cut);
        mb.add(edit);
        add(mb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        nnew.addActionListner(this);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    JFrame f = new jframe();
    f.setsize(200,300);
    f.setVisible(true);
    
}
public static void main(String[] args) {
    new table demo();
}
}
