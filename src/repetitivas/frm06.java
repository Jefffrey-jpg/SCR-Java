package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNumero;
    private JTextField txtDesde;
    private JTextField txtHasta;
    private JTextField txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm06 frame = new frm06();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        txtNumero = new JTextField();
        txtNumero.setBounds(20, 20, 80, 30);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtDesde = new JTextField();
        txtDesde.setBounds(120, 20, 80, 30);
        txtDesde.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDesde);

        txtHasta = new JTextField();
        txtHasta.setBounds(220, 20, 80, 30);
        txtHasta.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHasta);

        JButton btnGenerar = new JButton("Generar Tabla");
        btnGenerar.setBounds(20, 70, 280, 30);
        btnGenerar.addActionListener(e -> generarTablaMultiplicarRango());
        getContentPane().add(btnGenerar);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 120, 280, 150);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void generarTablaMultiplicarRango() {
        try {
            int n = Integer.parseInt(txtNumero.getText());
            int desde = Integer.parseInt(txtDesde.getText());
            int hasta = Integer.parseInt(txtHasta.getText());
            StringBuilder resultado = new StringBuilder();

            for (int i = desde; i <= hasta; i++) {
                resultado.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
            }

            txtResultado.setText(resultado.toString());
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        } catch (IllegalArgumentException e) {
            txtResultado.setText("Rango inválido");
        }
    }
}