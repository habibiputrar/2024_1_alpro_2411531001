package pekan8;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pilkada {

    private JFrame frame;
    private JTextField txtNama;
    private JTextField txtNIK;
    private JComboBox<String> comboPilihan;
    private JTextArea txtOutput;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Pilkada window = new Pilkada();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public Pilkada() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(30, 30, 100, 25);
        frame.getContentPane().add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(150, 30, 200, 25);
        frame.getContentPane().add(txtNama);
        txtNama.setColumns(10);

        JLabel lblNIK = new JLabel("NIK");
        lblNIK.setBounds(30, 70, 100, 25);
        frame.getContentPane().add(lblNIK);

        txtNIK = new JTextField();
        txtNIK.setBounds(150, 70, 200, 25);
        frame.getContentPane().add(txtNIK);
        txtNIK.setColumns(10);

        JLabel lblPilihan = new JLabel("Pilihan");
        lblPilihan.setBounds(30, 110, 100, 25);
        frame.getContentPane().add(lblPilihan);

        comboPilihan = new JComboBox<>();
        comboPilihan.setModel(new DefaultComboBoxModel<>(new String[] {
            "Pilih", "1. Fadli- Margus", "2. Iqbal- Amasrul", "3. Hendri-Hidayat"
        }));
        comboPilihan.setBounds(150, 110, 200, 25);
        frame.getContentPane().add(comboPilihan);

        JButton btnProses = new JButton("Proses");
        btnProses.setBounds(150, 150, 100, 30);
        frame.getContentPane().add(btnProses);

        txtOutput = new JTextArea();
        txtOutput.setBounds(30, 200, 320, 50);
        txtOutput.setEditable(false);
        frame.getContentPane().add(txtOutput);

        // Action listener untuk tombol proses
        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String nik = txtNIK.getText().trim();
                String pilihan = (String) comboPilihan.getSelectedItem();

                // Validasi input nama dan NIK
                if (nama.isEmpty() || nik.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Mohon lengkapi Nama dan NIK!", 
                                                  "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Validasi pilihan
                if (comboPilihan.getSelectedIndex() == 0) { // Jika pilihan adalah "Pilih"
                    txtOutput.setText("Nama Anda: " + nama + "\n"
                            + "NIK: " + nik + "\n"
                            + "Anda belum memilih kandidat");
                } else {
                    // Menampilkan output jika semua input benar
                    txtOutput.setText("Nama Anda: " + nama + "\n"
                            + "NIK: " + nik + "\n"
                            + "Pilihan Anda: " + pilihan + "\n"
                            + "**Terima kasih sudah memilih**");
                }
            }
        });
    }
}
