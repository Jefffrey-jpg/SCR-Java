package recursivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase;
    JTextField txtExponente;
    JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm04 frame = new frm04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 20, 100, 30);
        getContentPane().add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(160, 20, 180, 30);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        JLabel lblExponente = new JLabel("Exponente:");
        lblExponente.setBounds(50, 60, 100, 30);
        getContentPane().add(lblExponente);

        txtExponente = new JTextField();
        txtExponente.setBounds(160, 60, 180, 30);
        txtExponente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtExponente);

        JButton btnCalcular = new JButton("Calcular Potencia");
        btnCalcular.setBounds(50, 110, 290, 30);
        btnCalcular.addActionListener(e -> calcularPotencia());
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

    protected void calcularPotencia() {
        try {
            int base = Integer.parseInt(txtBase.getText());
            int exponente = Integer.parseInt(txtExponente.getText());
            long resultado = potencia(base, exponente);
            txtResultado.setText(String.valueOf(resultado));
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