import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingSnowman extends JPanel
{
    int midX = 220;
    int midY = 280;
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        setBackground(new Color(40, 144, 0));
        
        g.setColor(Color.yellow);
        g.fillArc(-40, -40, 80, 80, 0, -90);
        
        g.setColor(Color.white);
        g.fillOval(midX-20, midY-60, 40, 40);  //head
        g.fillOval(midX-35, midY-25, 70, 50);  //upper body
        g.fillOval(midX-50, midY+20, 100, 60);  //lower body
        
        g.setColor(Color.black);
        g.fillOval(midX-10, midY-50, 5, 5);  //left eye
        g.fillOval(midX+5, midY-50, 5, 5);  //right eye
        g.drawArc(midX-10, midY-40, 20, 10, 190, 160);  //smile
        g.drawLine(midX-25, midY, midX-50, midY-20);  //left arm
        g.drawLine(midX+25, midY, midX+55, midY); //right arm
        
        g.drawLine(midX-20, midY-55, midX+20, midY-55);  //brim of hat
        g.fillRect(midX-15, midY-80, 30, 25);  //hat
        
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Moving Snowman");
        frame.add(new MovingSnowman());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
