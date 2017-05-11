import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame
{
     private World game;
    
    public GUI()
    {
      setLayout(new BorderLayout());
      
      game = new World(10);
      add(game, BorderLayout.CENTER);
      ControlPanel cp = new ControlPanel(game);
      add(cp,BorderLayout.SOUTH);
      
        setSize(500,500);
      setTitle("William's Game of Life");
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
