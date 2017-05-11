import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlPanel extends JPanel
{
    private World world;
    private JButton btnStep, btnRun, btnReset;

    public ControlPanel(World w)
    {

        world = w;

        btnStep = new JButton("Step");
        add(btnStep);
        btnStep.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    world.step();
                }
            }
        );

        btnRun= new JButton("Start");
        add(btnRun);
        btnRun.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JButton btn = (JButton)e.getSource();
                    if(btn.getText().equals("start"))
                    {
                        btn.setText("Stop");

                    }
                    else {
                        btn.setText("Start");
                    }
                }
            }
        );

        btnReset = new JButton("Reset");
        add(btnReset);

        btnReset.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    world.reset();
                }
            }
        );
    }

}
