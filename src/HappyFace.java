/**
 * @author Muntaqim Elahi
 * Purpose: To draw happy face
 * Created on 09/07/17
 */

import java.awt.Graphics;
import javax.swing.JApplet;
public class HappyFace extends JApplet{
    public void paint(Graphics canvas){
//canvas.drawLine(0,0,500,500);
//canvas.drawLine(250,0,250,500);
        canvas.drawOval(50,50,100,100);
        canvas.fillOval(80,85,10,10);
        canvas.fillOval(115,85,10,10);
        canvas.drawArc(65,100,70,30,180,180);
    }
}