package recursivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEntrada;
    JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm02 frame = new frm02();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblEntrada = new JLabel("Ingresar número:");
        lblEntrada.setBounds(50, 20, 100, 30);
        getContentPane().add(lblEntrada);

        txtEntrada = new JTextField();
        txtEntrada.setBounds(160, 20, 180, 30);
        txtEntrada.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEntrada);

        JButton btnCalcular = new JButton("Calcular Fibonacci");
        btnCalcular.setBounds(50, 70, 290, 30);
        btnCalcular.addActionListener(e -> calcularFibonacci());
        getContentPane().add(btnCalcular);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 120, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(160, 120, 180, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void calcularFibonacci() {
        String entrada = txtEntrada.getText();
        int numero;
        try {
            numero = Integer.parseInt(entrada);
            long resultado = fibonacci(numero);
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }

    protected long fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
