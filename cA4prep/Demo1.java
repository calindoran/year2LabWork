package cA4prep;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1 implements ActionListener //Action listener in your main class
{
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
			public void run()
            {
                Demo1 app = new Demo1();
                app.createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b1");

    }

    protected void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JButton b1 = new JButton("B1");
        f.add(b1);
        b1.addActionListener(this);

        f.setVisible(true);
    }
}