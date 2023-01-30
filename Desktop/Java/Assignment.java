import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GraphicsExamples extends JFrame implements ActionListener 
{
    
  private JLabel prompt = new JLabel("Distance in miles: ");
  private JTextField input = new JTextField(6);
  private JTextArea display = new JTextArea(10, 20);
  private JButton convert = new JButton("Convert!");
  private JPanel p1 = new JPanel(new FlowLayout());

 
  public GraphicsExamples() 
  {
    super("Distance Converter");
    setLayout(new BorderLayout());

    p1.add(prompt);
    p1.add(input);
    convert.addActionListener(this); 
    p1.add(convert);

    add(p1, BorderLayout.NORTH);
    add(display, BorderLayout.CENTER);
    add(new KeyPad(), BorderLayout.EAST);

    p1.setBackground(new Color(0, 150, 200));
  }

 
  class KeyPad extends JPanel implements ActionListener 
  {
    private static final int NBUTTONS = 12;
    private JButton buttons[];

    //these are the buttons present in layout
    private String labels[] = {
      "1",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "C",
      "0",
      ".",
    };


    
    public KeyPad() 
    {
      setLayout(new GridLayout(4, 3));
      setBorder(BorderFactory.createTitledBorder("Keypad"));

      buttons = new JButton[NBUTTONS];

      for (int k = 0; k < buttons.length; k++) 
      {
        buttons[k] = new JButton(labels[k]);
        buttons[k].addActionListener(this);
        add(buttons[k]);
      }
    }


    
    @Override
    public void actionPerformed(ActionEvent e) {
        
      String cmd = e.getActionCommand();

      
      if (cmd.equals("C")) {
        input.setText("");
      } 
      
      else {
        input.setText(input.getText() + cmd);
      }
    }
  }

  
  @Override
  public void actionPerformed(ActionEvent e) {
    
    
    String mileString = input.getText();

    Double miles = Double.parseDouble(mileString);

    Double factor = 1.609344;

    Double kms = miles * factor;

    StringBuilder output = new StringBuilder();

    output.append(kms + " kms\n\n");

 
    output.append("1 mile = " + factor + " kms\n");

    output.append(mileString + " miles = " + mileString + " * " + factor + " kms\n");

    output.append(mileString + " miles = " + kms + " kms\n");


    display.setText(output.toString());
  }

  public static void main(String args[]) 
  {
    GraphicsExamples f = new GraphicsExamples();

    f.setSize(400, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}