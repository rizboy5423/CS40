import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class World extends JPanel
{
    private Cell[][] world;

    public World(int size)
    {
        world = new Cell[size][size];
        setLayout(new GridLayout(size,size));
        for(int r=0; r<world.length; r++)
        {
            for(int c=0; c<world[r].length; c++)
            { 
                world[r][c] = new Cell();
                add(world[r][c]);
                world[r][c].addActionListener(
                    new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            Cell btn = (Cell)e.getSource();
                            btn.changeState();
                        }
                    }
                );
            }

        }
    }
    public void step()
    {
        System.out.println("step");
    }

    public void reset()
    {
        for(int r=0; r<world.length; r++)
        {
            for(int c=0; c<world[r].length; c++)
            { 
               world[r][c].setState(false);
               
            }
        
        }
    }
}