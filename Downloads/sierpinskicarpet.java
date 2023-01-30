import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class sierpinskicarpet {
 
   public static Color BACKGROUNDCOLOR = Color.black;
   public static Color FOREGROUNDCOLOR = Color.white;
 
    // Padrao = 5, alterado
   public static int DEPTH = 9;
 
    /**
     * Build the frame and shows it
     */
   public sierpinskicarpet(int depth) {
   
        // the frame and title
      JFrame frame = new JFrame();
      frame.setTitle("...: Recursive Squares with depth " + depth + " :...");
   
        // Dispose frame on click on close button
      frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   
        // set size and center frame on screen
      frame.setSize(400, 400);
      frame.setLocationRelativeTo(null);
   
        // add print area occupying all the frame content area
      frame.add(new PrintArea(depth));
   
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
                // launch for 1 to DEPTH squares frames
               for (int i = DEPTH; i >= 1; --i) {
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
 
    // local depth variable, will keep the registered depth for this the print
    // area
   int depth;
 
    /**
     * constructor
     */
   public PrintArea(int depth) {
        // call super, that is JLabel, constructor
      super();
   
        // set background color and set as well opaque to allow the background
        // to be visible
      setBackground(sierpinskicarpet.BACKGROUNDCOLOR);
      setOpaque(true);
   
        // save the depth
      this.depth = depth;
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
      int n = drawSquares(g, 0, 0, getWidth(), getHeight(), this.depth);
   
        // put to the world how much squares we printed
      System.out.println("Deep = " + depth + ", squares painted: " + n);
   }
 
    /**
     * Auxiliary method that will do the work. It must print a square with 1/3
     * of the length of the frame and at the center and if not the bottom level
     * ask to do the same for each of the other 8 square with 1/3 of length but
     * called with the new current depth. Recursion ends when currentdepth <= 1
     */
   private int drawSquares(Graphics g, int xi, int yi, int width, int height, int currentdepth) {
     //Find the newWidth, newHeight, x coordinate and y coordinate for the top left of the current rectangle
      int newWidth; //intialize and calculate new width of rectangle
      int newHeight;  //intiliaze and calculate new height of rectangle
      int x;  //modify to find x coordinate of rectangle
      int y; //modify to find y coordinate of rectangle
      int sum = 0;  //sum keeps track of the number of squares you have recursively drawn
      //Uncomment the g.fillRect below to draw the current rectangle using x, y, newWidth, and newHeight
      //g.fillRect(x, y, newWidth, newHeight);
   
      
      int sX = 0;  //small rectangle coordinate for x
      int sY = 0;  //small rectangle coordinate for y
      
      if (currentdepth > 1) {
         
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //This nested segment of loop code is to find the position of each of the small rectangle, one small rectangle at a time
                //find sX for the x coordinate of one of the the small rectangles surrounding the current rectangle using the i term
                //find sX for the x coordinate of one of the the small rectangles surrounding the current rectangle using the j term

                // Call the drawSquares method recursively in order to draw the smaller rectangles passing the appropriate parameters and reducing the depth by 1

            }
         }
         return 1 + sum;
      } else
         return 1;
   
   }
}