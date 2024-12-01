package pekan7;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class Aritmatika {

    private JFrame frame;
    private JTextField A;
    private JTextField B; 
    private JLabel C; 

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

    public Aritmatika() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        C = new JLabel("Hasil"); 
        C.setHorizontalAlignment(SwingConstants.CENTER);
        C.setBounds(304, 53, 86, 55);
        frame.getContentPane().add(C);
        
        String[] operators = {"+", "-", "*", "/", "%"};
        JComboBox<String> OPcb = new JComboBox<>(operators);
        OPcb.setModel(new DefaultComboBoxModel<>(new String[] {"pilih", "+", "-", "*", "/", "%"}));
        OPcb.setSelectedIndex(0); 
        OPcb.setBounds(120, 70, 71, 21);
        frame.getContentPane().add(OPcb);
        
        JButton btnNewButton = new JButton("Hasil");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int A1 = Integer.parseInt(A.getText());
                    int A2 = Integer.parseInt(B.getText());
                    int hasil = 0;
                    int op = OPcb.getSelectedIndex();

                    switch(op) {
                        case 1:
                            hasil = A1 + A2;
                            break;
                        case 2: 
                            hasil = A1 - A2;
                            break;
                        case 3:
                            hasil = A1 * A2;
                            break;
                        case 4:
                            if(A2 != 0) {
                                hasil = A1 / A2;
                            } else {
                                C.setText("Error: Bagi 0");
                                return;
                            }
                            break;
                        case 5: 
                            hasil = A1 % A2;
                            break;
                        default:
                            C.setText("Pilih Operator");
                            return;
                    }

                    C.setText(String.valueOf(hasil));

                } catch(NumberFormatException ex) {
                    C.setText("Input Salah");
                }
            }
        });
        btnNewButton.setBounds(115, 131, 85, 21);
        frame.getContentPane().add(btnNewButton);
        
        A = new JTextField();
        A.setHorizontalAlignment(SwingConstants.CENTER);
        A.setColumns(10);
        A.setBounds(32, 61, 78, 38);
        frame.getContentPane().add(A);
        
        B = new JTextField(); 
        B.setHorizontalAlignment(SwingConstants.CENTER);
        B.setColumns(10);
        B.setBounds(201, 62, 78, 38);
        frame.getContentPane().add(B);
        
        JLabel lblHasil = new JLabel("=");
        lblHasil.setHorizontalAlignment(SwingConstants.CENTER);
        lblHasil.setBounds(261, 53, 86, 55);
        frame.getContentPane().add(lblHasil);
    }
}