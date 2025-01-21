//First.java  
import java.applet.Applet;  
import java.awt.Graphics;  
@SuppressWarnings("removal")
public class First extends Applet{  
  
public void paint(Graphics g){  
g.drawString("welcome",150,150);  
}  
public static void main(String[] args) {
    First fr = new First();
    fr.paint();
}
  
}  