import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Awt_Example extends Frame
 {

    Awt_Example(){


        Label li = new Label("Enter your name ");
        li.setBounds(20, 30, 110, 80);
        
        TextField t = new TextField();
        t.setBounds(130,50,100,30);

        Button b1 = new Button("Click Me");
        b1.setBounds(20,100,80,20);

        b1. addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText("Naveen Gupta");
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent e){
                dispose();
            }
        });

        add(b1);
        add(t);
        add(li);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main (String args[]) {
     new Awt_Example();
}
}

