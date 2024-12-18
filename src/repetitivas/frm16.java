package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtEntrada;
    private JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm16 frame = new frm16();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        txtEntrada = new JTextField();
        txtEntrada.setBounds(20, 20, 240, 30);
        txtEntrada.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEntrada);

        JButton btnInvertir = new JButton("Invertir Cadena");
        btnInvertir.setBounds(20, 60, 150, 30);
        btnInvertir.addActionListener(e -> invertirCadena());
        getContentPane().add(btnInvertir);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 100, 240, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void invertirCadena() {
        String entrada = txtEntrada.getText();
        if (entrada.isEmpty()) {
            txtResultado.setText("Por favor, ingresa una cadena.");
            return;
        }
        String resultado = invertir(entrada);
        txtResultado.setText(resultado);
    }

    protected String invertir(String cadena) {
        StringBuilder rpta = new StringBuilder();
        int longitud = cadena.length();

        for (int i = longitud - 1; i >= 0; i--) {
            rpta.append(cadena.charAt(i));
        }

        return rpta.toString();
    }
}