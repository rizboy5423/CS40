import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cell extends JButton
{
    private boolean alive;
    
    public Cell()
    {
        alive=false;
    }

    public boolean isAlive()
    {
        return alive;
    }
    
    public void setState(boolean alive)
    {
        this.alive = alive;
    }
    
    public void changeState()
    {
      alive=!alive;
      update();
    }
    
    private void update()
    {
        if(alive) {
            setText("X");
        }
        else{
            setText(" ");
        }
    }
   

}
