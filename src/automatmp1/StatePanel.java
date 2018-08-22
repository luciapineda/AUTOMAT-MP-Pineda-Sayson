/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Belle
 */
public class StatePanel extends JPanel{
    
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    
    // yellow circle
    g.setColor(Color.black);
    g.drawOval(0, 0, 20, 20);
//    g.setColor(Color.yellow);
//    g.fillOval(0, 0, 15, 15);

    
    }
    
}
