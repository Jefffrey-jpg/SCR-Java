package recursivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase;
    JTextField txtExponente;
    JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm10 frame = new frm10();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        txtBase = new JTextField();
        txtBase.setBounds(20, 20, 240, 30);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        txtBase.setToolTipText("Ingrese la base");
        getContentPane().add(txtBase);

        txtExponente = new JTextField();
        txtExponente.setBounds(20, 60, 240, 30);
        txtExponente.setMargin(new Insets(5, 5, 5, 5));
        txtExponente.setToolTipText("Ingrese el exponente");
        getContentPane().add(txtExponente);

        JButton btnCalcular = new JButton("Calcular Potencia");
        btnCalcular.setBounds(20, 100, 200, 30);
        btnCalcular.addActionListener(e -> calcularPotencia());
        getContentPane().add(btnCalcular);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 140, 240, 30);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void calcularPotencia() {
        try {
            int base = Integer.parseInt(txtBase.getText());
            int exponente = Integer.parseInt(txtExponente.getText());

            if (exponente < 0) {
                txtResultado.setText("El exponente debe ser no negativo");
                return;
            }

            long resultado = potencia(base, exponente);
            txtResultado.setText("Potencia: " + resultado);
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }

    protected long potencia(int base, int exponente) {
        if (exponente == 0)
            return 1;
        return base * potencia(base, exponente - 1);
    }
}