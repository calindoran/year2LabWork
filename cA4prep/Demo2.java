package cA4prep;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class Demo2  //With anon class as Action listener
{
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
			public void run()
            {
                Demo2 app = new Demo2();
                app.createAndShowGUI();
            }
        });
    }
    
    protected void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        
        JButton b1 = new JButton("B1");
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("b1");
            }
        });
        
        f.setVisible(true);
    }
}