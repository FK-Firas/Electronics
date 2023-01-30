import java.awt.*;
import javax.swing.*;       
import java.awt.event.*; 

public class ConverterFrame extends JFrame implements ActionListener
{
    //AWT and Swing Components
    private JLabel prompt = new JLabel("Distance in Miles:  ");
    private JTextField input = new JTextField(6);
    private JTextArea display = new JTextArea(10, 20);
    private JButton convert = new JButton("Convert!");
    private JPanel p1 = new JPanel(new FlowLayout());
    
    public ConverterFrame()
    {
        super("Distance Converter");
        setLayout(new BorderLayout());
        
        p1.add(prompt);
        p1.add(input);
        p1.add(convert);
        p1.setBackground(new Color(0,150,200));
        display.setBackground(new Color (50, 100, 0));
        add(p1, BorderLayout.NORTH);
        add(display, BorderLayout.CENTER);  
        add(new KeyPad(), BorderLayout.EAST);  
    }
    
    public class KeyPad extends JPanel
    {
        private final static int NBUTTONS = 12;
        private JButton buttons[];
        private String labels[] =
        {  "1", "2", "3", 
           "4", "5", "6",
           "7", "8", "9",
           "C", "0", "."};
        public KeyPad()
        {
            setLayout(new GridLayout(4, 3));
            setBorder(BorderFactory.createTitledBorder("Keypad"));
            
            buttons = new JButton[NBUTTONS];
            
            for (int k = 0; k < buttons.length; k++)
            {
                buttons[k] = new JButton(labels[k]);
                add(buttons[k]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent source)
    {
        
    }
    public static void main(String[] args)
    {
        ConverterFrame cf = new ConverterFrame();
        cf.setSize(400, 300);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cf.setVisible(true);
    }
    
}
