package repetitivas;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNumero;
    private JTextField txtCantidadDivisores;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm03 frame = new frm03();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(20, 20, 100, 30);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(120, 20, 150, 30);
        add(txtNumero);

        JButton btnCalcular = new JButton("Calcular Divisores");
        btnCalcular.setBounds(20, 70, 250, 30);
        btnCalcular.addActionListener(e -> calcularDivisores());
        add(btnCalcular);

        JLabel lblCantidadDivisores = new JLabel("Cantidad de Divisores:");
        lblCantidadDivisores.setBounds(20, 120, 150, 30);
        add(lblCantidadDivisores);

        txtCantidadDivisores = new JTextField();
        txtCantidadDivisores.setBounds(170, 120, 100, 30);
        txtCantidadDivisores.setEditable(false);
        add(txtCantidadDivisores);
    }

    private void calcularDivisores() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            if (numero < 1) {
                txtCantidadDivisores.setText("Número > 0");
                return;
            }

            int cantidadDivisores = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    cantidadDivisores++;
                }
            }

            txtCantidadDivisores.setText(String.valueOf(cantidadDivisores));
        } catch (NumberFormatException e) {
            txtCantidadDivisores.setText("Entrada inválida");
        }
    }
}