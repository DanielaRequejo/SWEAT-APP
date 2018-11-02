import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class linea extends JPanel {

  public void paint(Graphics g) {
      int[] xs = {10,20,30,40,50,60};
      int[] ys = {100,90,80,70,60,90};
      g.drawPolyline(xs, ys, 6);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new linea());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}
           
         