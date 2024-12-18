package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtBase;
    private JTextField txtExponente;
    private JTextField txtResultado;

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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        txtBase = new JTextField();
        txtBase.setBounds(20, 20, 100, 30);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtExponente = new JTextField();
        txtExponente.setBounds(140, 20, 100, 30);
        txtExponente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtExponente);

        JButton btnCalcular = new JButton("Calcular Potencia");
        btnCalcular.setBounds(20, 70, 220, 30);
        btnCalcular.addActionListener(e -> calcularPotencia());
        getContentPane().add(btnCalcular);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 120, 220, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void calcularPotencia() {
        try {
            int base = Integer.parseInt(txtBase.getText());
            int exponente = Integer.parseInt(txtExponente.getText());
            long resultado = 1;

            if (exponente < 0) {
                txtResultado.setText("El exponente debe ser un número no negativo.");
                return;
            }

            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }

            txtResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida. Por favor, ingresa números.");
        }
    }
}