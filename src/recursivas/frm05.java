package recursivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtN;
    JTextField txtK;
    JTextField txtResultado;

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
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblN = new JLabel("Valor de n:");
        lblN.setBounds(50, 20, 100, 30);
        getContentPane().add(lblN);

        txtN = new JTextField();
        txtN.setBounds(160, 20, 180, 30);
        txtN.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtN);

        JLabel lblK = new JLabel("Valor de k:");
        lblK.setBounds(50, 60, 100, 30);
        getContentPane().add(lblK);

        txtK = new JTextField();
        txtK.setBounds(160, 60, 180, 30);
        txtK.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtK);

        JButton btnCalcular = new JButton("Calcular Combinación");
        btnCalcular.setBounds(50, 110, 290, 30);
        btnCalcular.addActionListener(e -> calcularCombinacion());
        getContentPane().add(btnCalcular);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 160, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(160, 160, 180, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void calcularCombinacion() {
        try {
            int n = Integer.parseInt(txtN.getText());
            int k = Integer.parseInt(txtK.getText());
            long resultado = combinacion(n, k);
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }

    protected long combinacion(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return combinacion(n - 1, k - 1) + combinacion(n - 1, k);
    }
}