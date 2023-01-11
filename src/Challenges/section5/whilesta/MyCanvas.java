package Challenges.section5.whilesta;

import java.awt.*;
import javax.swing.*;

public class MyCanvas extends Canvas {

  public void paint(Graphics g) {
    
    Toolkit t = Toolkit.getDefaultToolkit();
    Image i = t.getImage("/home/ivan/Pictures/Wallpapers/klipartz.png");
    g.drawImage(i, 2, 2, this);

  }

 public static void main(String[] args) {
    MyCanvas m = new MyCanvas();
    JFrame f = new JFrame();
    f.add(m);
    f.setSize(512, 512);
    f.setVisible(true);
  }

}
