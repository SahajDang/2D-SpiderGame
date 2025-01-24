import javax.swing.ImageIcon;

public class Enemy extends Sprite {
  public Enemy(int x, int Speed){
    this.x = x;
    this.Speed = Speed;
    y = 30;
    w = 100;
    h = 100;
    image = new ImageIcon(Player.class.getResource("Spider_Enemy.gif"));
  }

  public void move(){
    if(y > 844){
      y = 0;
    }
    y = y + Speed;
  }
}