package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtSigno;

        @SuppressWarnings("CallToPrintStackTrace")
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        frm11 frame = new frm11();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);

		JLabel lblSigno = new JLabel("Signo :");
		lblSigno.setBounds(50, 90, 80, 30);
		getContentPane().add(lblSigno);

		txtNumero = new JTextField();
		txtNumero.setBounds( 130, 50, 60, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT );
		txtNumero.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtNumero);

		txtSigno = new JTextField();
		txtSigno.setBounds( 130, 90, 60, 30);
		txtSigno.setHorizontalAlignment( SwingConstants.RIGHT );
		txtSigno.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtSigno);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int numero =  Integer.parseInt( txtNumero.getText() );

        if (numero > 0) txtSigno.setText("Positivo");
        else if (numero == 0) txtSigno.setText("Cero");
        else txtSigno.setText("Negativo");

        txtSigno.setText(numero > 0 ? "Positivo" : numero == 0 ? "Cero" : "Negativo");
	}

}