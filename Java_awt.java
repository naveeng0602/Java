import java.awt.*;
public class Java_awt extends Frame {

    Java_awt(){
        Button b1 = new Button("click Me");
        b1.setBounds(100,100,100,50);
        add(b1);
        setSize(300,300);
        setTitle("Naveen");
        setLayout(null);

        setVisible(false);
    }
    public static void main(String[] args) {
        Java_awt f = new Java_awt();

    }
}
