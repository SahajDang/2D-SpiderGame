import javax.swing.ImageIcon;
public class Player extends Sprite {
  public Player(){
    w = 180;
    h = 250;
    x = 50;
    y = 450;
    image = new ImageIcon(Player.class.getResource("Player.gif"));
  }

  public void move(){
    x = x + Speed;
  }

  public boolean outOfScreen(){
    return x > 1500;
  }
}