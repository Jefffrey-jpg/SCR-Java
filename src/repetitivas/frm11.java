package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextArea txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm11 frame = new frm11();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JButton btnCalcular = new JButton("Calcular Capicúas");
        btnCalcular.setBounds(20, 20, 150, 30);
        btnCalcular.addActionListener(e -> calcularCapicuas());
        getContentPane().add(btnCalcular);

        txtResultado = new JTextArea();
        txtResultado.setBounds(20, 70, 240, 70);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void calcularCapicuas() {
        int contador = 0;

        for (int i = 100; i <= 999; i++) {
            int centenas = i / 100;
            int unidades = i % 10;

            if (centenas == unidades) {
                contador++;
            }
        }

        txtResultado.setText("Cantidad de capicúas de 3 cifras: " + contador);
    }
}