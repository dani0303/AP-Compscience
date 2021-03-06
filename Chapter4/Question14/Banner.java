/**
 * This program displays a message that moves horizontally
 * across the window.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Banner extends JPanel
                 implements ActionListener
{
 private Balloon balloon1, balloon2;
 private int xPos, yPos;  
 // hold the coordinates of the message
 // Called automatically after a repaint request
 public void paintComponent(Graphics g)
 {
    super.paintComponent(g); // Paint the background
    balloon1.draw(g, true);
    balloon2.draw(g, true);
 }

 // Called automatically when the timer "fires"
 public void actionPerformed(ActionEvent e)
 {
    // Adjust the vertical position of the shape:
    int b1Y = balloon1.getY();
    int b2Y = balloon2.getY();
    
    int b1X = balloon1.getX();
    int b2X = balloon2.getX();
    
    b1Y --;
    b2Y --;
    if(b1Y < balloon1.getRadius())
        b1Y = getHeight();
    if(b2Y < balloon2.getRadius())
        b2Y = getHeight();
    
    balloon1.move(b1X, b1Y);
    balloon2.move(b2X, b2Y);
    repaint();
 }

 public static void main(String[] args)
 {
    JFrame window = new JFrame("Action Demo");

    // Set this window's location and size:
    // upper-left corner at 300, 300; width 300, height 100
    window.setBounds(300, 300, 300, 100);

    //  Create panel, a Banner object, which is a kind of JPanel:
    Banner panel = new Banner();
    panel.setBackground(Color.WHITE);  // the default color is light gray

    // Add panel to window:
    Container c = window.getContentPane();
    c.add(panel);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    
    panel.balloon1 = new RoundBalloon(100, 100, 50, Color.RED);
    panel.balloon2 = new OvalBalloon(500, 100, 50, Color.BLUE);
    
    
    // Create a Timer object that fires every 30 milliseconds;
    // attach it to panel so that panel "listens to" and
    // processes the timer events; start the timer:
    Timer clock = new Timer(10, panel);
    clock.start();
 }
}
