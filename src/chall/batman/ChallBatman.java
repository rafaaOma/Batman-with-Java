
package chall.batman;
import javax.swing.*; // For the JFrame & JComponent class 
import java.awt.*;  // For the Color class 
import java.awt.geom.*; 
public class ChallBatman  extends JComponent {
int x=0;
int y=0;
    public static void main(String[] args) {
    int w = 800; // Frame width 
       int h = 800; // Frame height 
       JFrame frame = new JFrame();    // Create a JFrame container 
       frame.getContentPane().setBackground(Color.WHITE);  // Set frame background color 
       frame.setSize(w, h);     // Set frame size (width, height) 
       frame.setTitle("2D Curves in Java");  // Set frame title 
       frame.add(new ChallBatman());   // Add drawing canvas to the frame 
       frame.setLocationRelativeTo(null);   // Set frame location to center of screen  
       frame.setVisible(true);    // Show frame 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     protected void paintComponent(Graphics g) { 
       super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform resetTrans = g2d.getTransform();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       Rectangle2D.Double rec = new Rectangle2D.Double(x, y, 80, 100);
        g2d.setColor(Color.yellow);
        g2d.fillOval(150, 150, 500, 500);  // background
        //face
        g2d.setColor(Color.BLACK);
        g2d.fillOval(0, 260, 280, 320); 
        //  ears
        // top ear
       g2d.fill(new CubicCurve2D.Double(0, 250,    // x1, y1 
                                 230, 236,    // ctrlx1, ctrly1 
                                 290, 250,    // ctrlx2, ctrly2 
                                 390, 300)); 
       g2d.fill(new CubicCurve2D.Double(260, 357,    // x1, y1 
                                 305, 345,    // ctrlx1, ctrly1 
                                 357, 336,    // ctrlx2, ctrly2 
                                 390, 300)); 
        // dawn ear
       g2d.fill(new CubicCurve2D.Double(0, 600,    // x1, y1 
                                 230, 605,    // ctrlx1, ctrly1 
                                 290, 586,    // ctrlx2, ctrly2 
                                 390, 530)); 
       g2d.fill(new CubicCurve2D.Double(260, 480,    // x1, y1 
                                 310, 491,    // ctrlx1, ctrly1 
                                 342, 500,    // ctrlx2, ctrly2 
                                 390, 530)); 
       //surgrey   
       g2d.fillArc(187, 430, 400, 200, 140, 70);
       g2d.fillArc(187, 201, 400, 200, 150, 73);
       g2d.fillArc(-225, 250, 449, 349, 90, -180);
       g2d.fillArc(50, 250, 80, 50, 40, 100);
       g2d.fillArc(50, 570, 80, 50, 40, 100);       
       //eyes
       //top eye  
      g2d.translate(110, 280);
       g2d.rotate(Math.toRadians(50));
       g2d.setColor(Color.WHITE);
       g2d.fill(rec);
       g2d.setColor(Color.BLACK);
        g2d.setTransform(resetTrans); 
        g2d.fillOval(75, 268, 130, 200);
    //other eye
       g2d.setTransform(resetTrans);
       g2d.translate(160, 500);
       g2d.rotate(Math.toRadians(130));
       g2d.setColor(Color.WHITE);
       g2d.fill(rec);
       g2d.setTransform(resetTrans);
        g2d.setColor(Color.BLACK);
        g2d.setTransform(resetTrans); 
        g2d.fillOval(75, 380, 130, 200);
    // Write a text
        g2d.setTransform(resetTrans);
        g2d.setColor(Color.DARK_GRAY); // Set painting color
        g2d.setFont(new Font("Chalkboard", Font.BOLD|Font.ITALIC, 30)); // Set text font (font, style, size)
        g2d.drawString("ALWAYS BE YORSELF", 130, 170);
        g2d.drawString("UNLESS YOU CAN BE BATMAN THEN ALWAYS ", 90, 220);
        g2d.drawString("BE BATMAN!", 480, 270);
     }
}
