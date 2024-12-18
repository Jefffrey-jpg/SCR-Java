package recursivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEntrada;
    JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm08 frame = new frm08();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        txtEntrada = new JTextField();
        txtEntrada.setBounds(20, 20, 240, 30);
        txtEntrada.setMargin(new Insets(5, 5, 5, 5));
        txtEntrada.setToolTipText("Ingrese la posición en la sucesión de Fibonacci");
        getContentPane().add(txtEntrada);

        JButton btnCalcular = new JButton("Calcular Fibonacci");
        btnCalcular.setBounds(20, 60, 200, 30);
        btnCalcular.addActionListener(e -> calcularFibonacci());
        getContentPane().add(btnCalcular);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 100, 240, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void calcularFibonacci() {
        try {
            int posicion = Integer.parseInt(txtEntrada.getText());
            if (posicion < 0 || posicion > 30) {
                txtResultado.setText("Ingrese un valor entre 0 y 30");
            } else {
                int resultado = fibonacci(posicion);
                txtResultado.setText("Fibonacci: " + resultado);
            }
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }

    protected int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}