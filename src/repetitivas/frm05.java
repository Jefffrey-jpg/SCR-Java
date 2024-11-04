package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNumero;
    private JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm05 frame = new frm05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtNumero = new JTextField();
        txtNumero.setBounds(20, 20, 100, 30);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JButton btnGenerar = new JButton("Generar Tabla");
        btnGenerar.setBounds(140, 20, 120, 30);
        btnGenerar.addActionListener(e -> generarTablaMultiplicar());
        getContentPane().add(btnGenerar);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 70, 240, 170);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void generarTablaMultiplicar() {
        try {
            int n = Integer.parseInt(txtNumero.getText());
            StringBuilder resultado = new StringBuilder();

            for (int i = 1; i <= 12; i++) {
                resultado.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
            }

            txtResultado.setText(resultado.toString());
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }
}