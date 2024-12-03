package pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

public class Aritmatika {

	JFrame frame;
	private JTextField A;
	private JTextField B;
	private JTextField C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setBounds(45, 86, 75, 40);
		frame.getContentPane().add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setBounds(208, 86, 75, 40);
		frame.getContentPane().add(B);
		B.setColumns(10);
		
		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setBounds(327, 86, 75, 40);
		B.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(C);
		C.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "+", "-", "*", "/", "%"}));
		comboBox.setBounds(135, 86, 60, 40);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(287, 86, 35, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int A1= Integer.parseInt(A.getText());
				int A2= Integer.parseInt(B.getText());
				int hasil;
				int op= comboBox.getSelectedIndex();
				if(op == 1) {
					hasil = A1+A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 2) {
					hasil = A1-A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 3) {
					hasil = A1*A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 4) {
					hasil = A1/A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 5) {
					hasil = A1%A2;
					C.setText(String.valueOf(hasil));
				}
            }	
        });
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(122, 147, 89, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
