import java.awt.Graphics;
import javax.swing.ImageIcon;

public abstract class Sprite {
  public int Speed = 0;
  public int x;
  public int y;
  public int w;
  public int h;
  public ImageIcon image;

  public void draw(Graphics pen){
    pen.drawImage(image.getImage() , x, y, w, h, null);
  }
}
