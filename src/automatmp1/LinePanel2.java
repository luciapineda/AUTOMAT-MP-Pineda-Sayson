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
public class LinePanel2 extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawLine(0, 0, 0, 50);
        g.setColor(Color.black);
    //    g.drawLine(0, 10, 320, 10);
    //    g.setColor(Color.black);
    }
}
