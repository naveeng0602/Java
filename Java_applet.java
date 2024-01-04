import java.applet.*;
import java.awt.Graphics;


public class Java_applet extends Applet {
    public void paint(Graphics g)
    {
        g.drawString("welcome to applet", 150, 150);
    }
    
}
 /*
  <applet code = "Java_applet.class" width ="300" height = "300">
  </applet>
  */