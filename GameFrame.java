import javax.swing.JFrame;
public class GameFrame extends JFrame{

  public GameFrame(){
    Board board = new Board();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Game Developed in Java");
    setSize(1500, 844);
    setResizable(false);
    setLocationRelativeTo(null);
    add(board);
    setVisible(true);
  }
  public static void main(String[] args) {
    new GameFrame();
  }
}