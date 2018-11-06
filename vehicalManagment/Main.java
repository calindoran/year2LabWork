package vehicalManagment;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main implements Runnable{
    public static void main(String args[]){
        new frmSplash(3000);
        EventQueue.invokeLater(new Main(new LoginScreen()));
    }//main method closed
    private final JFrame frame;
    public Main(JFrame frm){
        this.frame=frm;
    }//constructor closed
    @Override
	public void run(){
        frame.setVisible(true);
    }//run method closed

}//class closed
