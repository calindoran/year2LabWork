package cA4prep;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Boat extends JFrame //Rough idea using some swing
{



/// JTextField text = new JTextField(""  ,50);
    private static String labelPrefixs = "Fleets made: ";
    private static String labelPrefixww = "Boats usbed: ";
    private static String labelPrefix = "Number of  boats added: ";

    public static void main(String[] args) 
    {
        new Boat("SwingApplication");






    }
    private int numClicks = 0;
    private int numAmy = 0;
    JLabel adbf = new JLabel(labelPrefixww + "0    "); 
    JLabel addb = new JLabel(labelPrefix + "0    "); 


    JLabel amys = new JLabel(labelPrefixs + "0    ");
    public Boat(String title) 
    {
        super(title);

        // operation to do when the window is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(500, 500, 800, 400);
        JButton back = new JButton("Back to start!");
        JButton button = new JButton("Click here to see Fleets!");
        JButton book = new JButton("Add Boat!");
        JButton del = new JButton("Delete Boat!");
        JButton route = new JButton("Get routes!");
        final JLabel choss = new JLabel("Choose sea-line");
        final JLabel chost = new JLabel("Choose Type of boat");
        final JLabel chosb = new JLabel("Choose a boat");
         final JButton fer = new JButton("Irish ferries");
         final JButton ferr = new JButton("British ferries");
         final JButton pass = new JButton("Passanger");
         final JButton freig = new JButton("Freight");
         final JButton ifer = new JButton("Frank");
         final JButton iferr = new JButton("Amy");
         final JButton iferrr = new JButton("Jackson");
         final JButton addf = new JButton("Make a Fleet");


        addf.setFocusPainted(false);
        pass.setFocusPainted(false);
        freig.setFocusPainted(false);
        route.setFocusPainted(false);
        fer.setFocusPainted(false);
        ferr.setFocusPainted(false);
        ifer.setFocusPainted(false);
        iferr.setFocusPainted(false);
        iferrr.setFocusPainted(false);
        button.setFocusPainted(false);
        back.setFocusPainted(false);
        book.setFocusPainted(false);
        del.setFocusPainted(false);

        JPanel panel = new JPanel();
        button.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel ship1 = new JLabel( "<html><p>Owned By: Irish Fleets. <br></br> " + 
                                    "Class : B. <br></br>  " +
                                    "Passanger compacity: 300. <br></br>  " +
                                    "Seats available: 62. <br></br>     "+
                                    "Destination: Wonderland. <br></br> "+
                                    "Transport space: 5 cars. <br></br> "+" </p></html>");
        TitledBorder titled = new TitledBorder("Amy");
        ship1.setBorder(titled);
        add(ship1);

        JLabel ship2 = new JLabel( "<html><p>Owned By: Irish Fleets. <br></br> " + 
                                    "Class : A. <br></br>  " +
                                    "Passanger compacity: 200. <br></br>  " +
                                    "Seats available: 26. <br></br>     "+
                                    "Destination: Wonderland. <br></br> "+
                                    "Transport space: 15 cars. <br></br>    "+" </p></html>");
        TitledBorder titled1 = new TitledBorder("Frank");
        ship2.setBorder(titled1);
        add(ship2);

        panel.add(chost);
        panel.add(freig);
        panel.add(pass);
        panel.add(book);
        panel.add(del);
        panel.add(ship1);
        panel.add(ship2);
        panel.add(route);
        panel.add(button);
        panel.add(chosb);
        panel.add(choss);
        //panel.add(text)
        panel.add(fer);
        panel.add(ferr);
        panel.add(ifer);
        panel.add(iferr);
        panel.add(iferrr);
        panel.add(addb);
        panel.add(amys);
        panel.add(adbf);
        panel.add(back);
        panel.add(addf);

        adbf.setVisible(false);
        amys.setVisible(false);
        addb.setVisible(false);
        freig.setVisible(false);
        pass.setVisible(false);
        chost.setVisible(false);
        book.setVisible(false);
        del.setVisible(false);
        ship1.setVisible(false);
        ship2.setVisible(false);
        route.setVisible(true);
        back.setVisible(false);
        choss.setVisible(false);
        chosb.setVisible(false);
        fer.setVisible(false);
        ferr.setVisible(false);
        ifer.setVisible(false);
        iferr.setVisible(false);
        iferrr.setVisible(false);
        addf.setVisible(false);

        getContentPane().add(panel);

        setVisible(true);

        button.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());

            fer.setVisible(false);
            ferr.setVisible(false);
            choss.setVisible(false);
            button.setVisible(false);
            back.setVisible(true);
            route.setVisible(false);
            chost.setVisible(true);
            freig.setVisible(true);
            pass.setVisible(true);
            amys.setVisible(false);
            addf.setVisible(false);
            adbf.setVisible(false);

            }
        });
         pass.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());

            fer.setVisible(true);
            ferr.setVisible(true);
            choss.setVisible(true);
            button.setVisible(false);
            back.setVisible(true);
            route.setVisible(false);
            chost.setVisible(false);
            freig.setVisible(false);
            pass.setVisible(false);
            amys.setVisible(false);
            adbf.setVisible(false);
            }
        });
        fer.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());
            ifer.setVisible(true);
            iferr.setVisible(true);
            iferrr.setVisible(true);
            choss.setVisible(false);
            chosb.setVisible(true);
            fer.setVisible(false);
            ferr.setVisible(false);
            route.setVisible(false);
            chost.setVisible(false);
            freig.setVisible(false);
            pass.setVisible(false);
            addb.setVisible(true);
            amys.setVisible(false);
            adbf.setVisible(false);
            addf.setVisible(false);

            }
        });
        iferr.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());
            ifer.setVisible(true);
            iferr.setVisible(true);
            iferrr.setVisible(true);
            choss.setVisible(false);
            chosb.setVisible(false);
            fer.setVisible(false);
            ferr.setVisible(false);
            route.setVisible(false);
            iferr.setFocusPainted(true);
            ship1.setVisible(true);
            book.setVisible(true);
            chost.setVisible(false);
            freig.setVisible(false);
            pass.setVisible(false);
            addb.setVisible(true);
            ship2.setVisible(false);
            amys.setVisible(false);
            adbf.setVisible(false);
            addf.setVisible(false);
            }
        });
            ifer.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());
            ifer.setVisible(true);
            iferr.setVisible(true);
            iferrr.setVisible(true);
            choss.setVisible(false);
            chosb.setVisible(false);
            fer.setVisible(false);
            ferr.setVisible(false);
            route.setVisible(false);
            ifer.setFocusPainted(true);
            ship1.setVisible(false);
            ship2.setVisible(true);
            book.setVisible(true);
            chost.setVisible(false);
            freig.setVisible(false);
            pass.setVisible(false);
            addb.setVisible(true);
            adbf.setVisible(false);
            amys.setVisible(false);
            addf.setVisible(false);
            }
        });

        back.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());
            fer.setVisible(false);
            ferr.setVisible(false);
            button.setVisible(true);
            choss.setVisible(false);
            back.setVisible(false);
            chosb.setVisible(false);
            ifer.setVisible(false);
            iferr.setVisible(false);
            iferrr.setVisible(false);
            route.setVisible(true);
            ship1.setVisible(false);
            ship2.setVisible(false);
            book.setVisible(false);
            chost.setVisible(false);
            freig.setVisible(false);
            pass.setVisible(false);
            addb.setVisible(false);
            del.setVisible(false);
            addf.setVisible(false);

            }
        });
        addf.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            //  System.out.println("" + text.getText());
            fer.setVisible(false);
            ferr.setVisible(false);
            button.setVisible(true);
            choss.setVisible(false);
            back.setVisible(false);
            chosb.setVisible(false);
            ifer.setVisible(false);
            iferr.setVisible(false);
            iferrr.setVisible(false);
            route.setVisible(true);
            ship1.setVisible(false);
            ship2.setVisible(false);
            book.setVisible(false);
            chost.setVisible(false);
            freig.setVisible(false);
            pass.setVisible(false);
            addb.setVisible(false);
            del.setVisible(false);
            adbf.setVisible(true);
            amys.setVisible(true);
            amys.setText(labelPrefixs + ++numAmy);
            addf.setVisible(false);
            adbf.setText(labelPrefixww + numClicks);
            }
        });

        book.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
                addf.setVisible(true);
            addb.setVisible(true);
            addb.setText(labelPrefix + ++numClicks);
            del.setVisible(true);
        }
        });

            del.addActionListener(new ActionListener() 
        {//This is known as an anonymous function
            @Override
			public void actionPerformed(ActionEvent e) 
            {
            addf.setVisible(true);
            addb.setText(labelPrefix + --numClicks);
            del.setVisible(true);
            del.setVisible(numClicks > 0);
            addf.setVisible(numClicks > 0);
        }
        });
}
}