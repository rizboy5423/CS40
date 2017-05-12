import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class rock extends JFrame implements ActionListener
{
    private JButton rock, paper, scissor;
    private JLabel result; 
    private int score;
    private int rounds;
    private Random rand;
    
    
    public rock()
    {
        setSize(600,600);
        setTitle("Game is Awesome");
        rock = new JButton("Rock");
        score = 0;
        add(rock);
        rock.addActionListener(this);
        
        
        GridLayout layout = new GridLayout(4,2);
        setLayout(layout);
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e)
    { 
        int comp = rand.nextInt(3);
        if(e.getSource() == rock)
        {
            
        }
    }

    
}
