import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;

public class Aplicacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Aplicacion frame = new Aplicacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	
	public Aplicacion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(26, 74, 213, 27);
		contentPane.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(26, 112, 213, 27);
		contentPane.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(26, 150, 213, 27);
		contentPane.add(progressBar_2);
		
		JLabel lblNewLabel = new JLabel("Cajero 1");
		lblNewLabel.setBounds(249, 74, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCajero = new JLabel("Cajero 2");
		lblCajero.setBounds(249, 112, 46, 14);
		contentPane.add(lblCajero);
		
		JLabel lblCajero_1 = new JLabel("Cajero 3");
		lblCajero_1.setBounds(249, 150, 46, 14);
		contentPane.add(lblCajero_1);
		
		textField = new JTextField();
		textField.setBounds(316, 74, 108, 103);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Banco Central");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 414, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(91, 188, 89, 23);
		contentPane.add(btnNewButton);
	}
}
