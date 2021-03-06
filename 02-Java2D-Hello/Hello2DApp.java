import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame(); 
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
        }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.black);
        int w = getWidth();
        int h = getHeight();
        g2d.fillRect(0, 0, w,h);
        g2d.setPaint(Color.green);
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        g2d.drawOval(100, 100, 150, 150);
        Font font =  new Font("Monospaced",1, 15);
        g.setFont(font);
        g.setColor(Color.PINK);
        g2d.drawString("Lucas P. D. e Castro", 90, 180);
        
    }

   
}