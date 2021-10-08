//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Question12c extends JFrame
                        implements ActionListener
{
  private EasySound rooster, cow;
  private int time=1;

  /**
   *   Constructor
   */
  public Question12c()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    cow = new EasySound("kuh.wav");
    rooster.play();
    Timer clock = new Timer(5000, this);
    clock.start();
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public void actionPerformed(ActionEvent e)
  {
    time =- time;
    if(time == 1)
    {
        rooster.play();
        getContentPane().setBackground(Color.WHITE);
    }else
    {
        cow.play();
        getContentPane().setBackground(Color.BLACK);
    }
  }
  
  public static void main(String[] args)
  {
    Question12c w = new Question12c();
    w.setSize(300, 150);
    w.setBackground(Color. WHITE);
    Container c = w.getContentPane();
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}  
