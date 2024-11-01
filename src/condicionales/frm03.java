package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm03 extends JFrame{
    private static final long serialVersionUID = 1L;
	JTextField txtGrados, txtAngulo;;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
