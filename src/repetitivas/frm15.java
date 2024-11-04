package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtEntrada;
    private JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        txtEntrada = new JTextField();
        txtEntrada.setBounds(20, 20, 300, 30);
        txtEntrada.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEntrada);

        JButton btnMayusculas = new JButton("A Mayúsculas");
        btnMayusculas.setBounds(20, 60, 140, 30);
        btnMayusculas.addActionListener(e -> convertirTextoAMayusculas());
        getContentPane().add(btnMayusculas);

        JButton btnMinusculas = new JButton("A Minúsculas");
        btnMinusculas.setBounds(180, 60, 140, 30);
        btnMinusculas.addActionListener(e -> convertirTextoAMinusculas());
        getContentPane().add(btnMinusculas);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 100, 300, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void convertirTextoAMayusculas() {
        String entrada = txtEntrada.getText();
        if (entrada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa texto para convertir.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String resultado = entrada.toUpperCase();
        txtResultado.setText(resultado);
    }

    protected void convertirTextoAMinusculas() {
        String entrada = txtEntrada.getText();
        if (entrada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa texto para convertir.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String resultado = entrada.toLowerCase();
        txtResultado.setText(resultado);
    }
}