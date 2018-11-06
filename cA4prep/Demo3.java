package cA4prep;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
 
class ButtonHandler implements ActionListener //Or in other class 
{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b2");
    }
}
 
public class Demo3  
{
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
			public void run()
            {
                Demo3 app = new Demo3();
                app.createAndShowGUI();
            }
        });
    }
    
    protected void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        
        JButton b2 = new JButton("B2");
        f.add(b2);
        b2.addActionListener(new ButtonHandler());
        
        f.setVisible(true);
    }
}