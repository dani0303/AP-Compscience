//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Question12a extends JFrame
                        implements ActionListener
{
  private EasySound rooster;
  private int time;

  /**
   *   Constructor
   */
  public Question12a()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    rooster.play();
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }
  
  public static void main(String[] args)
  {
    Question12a w = new Question12a();
    Container c = w.getContentPane();
    w.setSize(300, 150);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}  
