import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class sierpinskicarpet {
 
   public static Color BACKGROUNDCOLOR = new Color(0, 0, 150);
   public static Color FOREGROUNDCOLOR = new Color(255, 180, 0);
 
    // Padrao = 5, alterado
   public static int DEEP = 10;
 
    /**
     * Build the frame and shows it
     */
   public sierpinskicarpet(int deep) {
   
        // the frame and title
      JFrame frame = new JFrame();
      frame.setTitle("...: Recursive Squares with deep " + deep + " :...");
   
        // Dispose frame on click on close button
      frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   
        // set size and center frame on screen
      frame.setSize(400, 400);
      frame.setLocationRelativeTo(null);
   
        // add print area occupying all the frame content area
      frame.add(new PrintArea(deep));
   
        // put frame visible
      frame.setVisible(true);
   }
 
    /**
     * Main method
     */
   public static void main(String[] args) 
   {
      SwingUtilities.invokeLater(
         new Runnable() {
            public void run() {
                // launch for 1 to DEEP squares frames
               for (int i = DEEP; i >= 1; --i) {
                    // build a new object each time: objects will run
                    // independently
                  new sierpinskicarpet(i);
               }
            
            }
         });
   }
}
 
/**
 * Our print area is, in fact, a label extended with the paint squares behavior
 */
class PrintArea extends JLabel {
   private static final long serialVersionUID = 1L;
 
    // local deep variable, will keep the registered deep for this the print
    // area
   int deep;
 
    /**
     * constructor
     */
   public PrintArea(int deep) {
        // call super, that is JLabel, constructor
      super();
   
        // set background color and set as well opaque to allow the background
        // to be visible
      setBackground(sierpinskicarpet.BACKGROUNDCOLOR);
      setOpaque(true);
   
        // save the deep
      this.deep = deep;
   }
 
    /**
     * paint method, called by JVM, when it is needed to update the PrintArea
     */
   public void paint(Graphics g) {
        // call paint from the JLABEL, draws the background of the PrintArea
      super.paint(g);
   
        // set drawing color
      g.setColor(sierpinskicarpet.FOREGROUNDCOLOR);
   
        // call the amazing print square method
      int n = printSquares(g, 0, 0, getWidth(), getHeight(), this.deep);
   
        // put to the world how much squares we printed
      System.out.println("Deep = " + deep + ", squares painted: " + n);
   }
 
    /**
     * Auxiliary method that will to the work. It must print a square with 1/3
     * of the length of the frame and at the center and if not the bottom level
     * ask to do the same for each of the other 8 square with 1/3 of length but
     * called with the new deep
     */
   private int printSquares(Graphics g, int xi, int yi, int width, int height, int currentDeep) {
    //Quadrado central
      int newWidth = width / 3;
      int newHeight = height / 3;
      int x = (width / 3) + xi;
      int y = (height / 3) + yi;
      g.fillRect(x, y, newWidth, newHeight);
   
      int sX = 0;
      int sY = 0;
      if (currentDeep > 1) {
         int sum = 0;
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //This is the position of each of the small rectangles
               sX = i * (width / 3) + xi;
               sY = j * (height / 3) + yi;
            
                // Call the method recursively in order to draw the smaller rectangles
               sum += printSquares(g, sX, sY, newWidth, newHeight, currentDeep - 1);
            }
         }
         return 1 + sum;
      } else
         return 1;
   
   }
}
