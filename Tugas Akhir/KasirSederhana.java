package TugasAkhir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class KasirSederhana extends JFrame {
	
	private static JLabel labelnama;
	private static JTextField txnama;
	private static JLabel labelnim;
	private static JTextField txnim;

	private static JButton btlogin;
	private static JLabel lbsukses;
	public static String nama2;
	public static String nik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KasirSederhana frame = new KasirSederhana();
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
	public KasirSederhana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 256);
		setTitle("Biodata Kasir");
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
		setContentPane(panel);
		
		
		JLayeredPane form = new JLayeredPane();
		panel.add(form, BorderLayout.CENTER);
		
		labelnama = new JLabel ("Nama");
		labelnama.setBounds(20, 50, 150, 30);
		form.add(labelnama);
		
		txnama = new JTextField ();
		txnama.setBounds(150, 50, 180, 25);
		form.add(txnama);
		
		labelnim = new JLabel ("NIM");
		labelnim.setBounds(20, 80, 150, 30);
		form.add(labelnim);
		
	
		txnim = new JTextField ();
		txnim.setBounds(150, 80, 180, 25);
		form.add(txnim);
		
		JLabel maaf = new JLabel("");
		maaf.setForeground(Color.RED);
		maaf.setFont(new Font("Tahoma", Font.PLAIN, 10));
		maaf.setHorizontalAlignment(SwingConstants.RIGHT);
		maaf.setBounds(160, 105, 166, 14);
		form.add(maaf);
		
		btlogin = new JButton ("Login");
		btlogin.addActionListener(new ActionListener() {
			
			
			private JTextField namabarang;
			private JTextField harga;
			private JTextField jumlah;
			private JTextField total;
			private int total1;
			private int kembalian;
			private JTextField txtunai;
			private int tunai;
			
			public void actionPerformed(ActionEvent e) {
				
				
				if (txnama.getText().equals("Syahrul Romadhani") && txnim.getText().equals("G50120004")) {
				
				nama2 = txnama.getText();
				nik = txnim.getText();
				
				JFrame pembayaran = new JFrame ();
				pembayaran.setBackground(Color.ORANGE);
				pembayaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				pembayaran.setBounds(100, 100, 592, 391);
				pembayaran.setTitle("Kasir Sederhana");
				pembayaran.setVisible(true);
				
				
				JPanel panel = new JPanel();
				panel.setBackground(new Color(0, 255, 204));
				panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel.setLayout(new BorderLayout(0, 0));
				setContentPane(panel);
				pembayaran.getContentPane().add(panel);
				
				JLayeredPane layeredPane = new JLayeredPane();
				panel.add(layeredPane, BorderLayout.CENTER);
				
				JLabel lbnama = new JLabel("Nama Barang");
				lbnama.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lbnama.setBounds(57, 62, 97, 14);
				layeredPane.add(lbnama);
				
				JLabel lbjumlahh = new JLabel("Jumlah ");
				lbjumlahh.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lbjumlahh.setBounds(57, 133, 78, 14);
				layeredPane.add(lbjumlahh);
				
				JLabel lbharga = new JLabel("Harga");
				lbharga.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lbharga.setBounds(57, 98, 78, 14);
				layeredPane.add(lbharga);
				
				JLabel lbtotal = new JLabel("Total");
				lbtotal.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lbtotal.setBounds(57, 168, 78, 14);
				layeredPane.add(lbtotal);
				
				JLabel lblMasukanDataBarang = new JLabel("Masukan Data Barang");
				lblMasukanDataBarang.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
				lblMasukanDataBarang.setBounds(200, 11, 159, 37);
				layeredPane.add(lblMasukanDataBarang);
				
				JLabel lblRp1 = new JLabel("RP.");
				lblRp1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lblRp1.setBounds(224, 98, 23, 14);
				layeredPane.add(lblRp1);
				
				JLabel lblRp2 = new JLabel("RP.");
				lblRp2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lblRp2.setBounds(224, 168, 23, 14);
				layeredPane.add(lblRp2);
				
				namabarang = new JTextField();
				namabarang.setBounds(244, 59, 204, 20);
				layeredPane.add(namabarang);
				namabarang.setColumns(10);
				
				harga = new JTextField();
				harga.setColumns(10);
				harga.setBounds(244, 95, 204, 20);
				layeredPane.add(harga);
				
				jumlah = new JTextField();
				jumlah.setColumns(10);
				jumlah.setBounds(244, 130, 204, 20);
				layeredPane.add(jumlah);
				
				total = new JTextField();
				total.setForeground(Color.BLACK);
				total.setColumns(10);
				total.setBounds(244, 165, 204, 20);
				layeredPane.add(total);
						
				JLabel lblRp3 = new JLabel("RP.");
				lblRp3.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lblRp3.setBounds(224, 202, 23, 14);
				layeredPane.add(lblRp3);
				
				JButton total2 = new JButton("Total");
				total2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int harga1 = Integer.valueOf(harga.getText());
						int jumlah1 = Integer.valueOf(jumlah.getText());
						total1 = harga1 * jumlah1;
						total.setText(String.valueOf(total1));
						
						
						
					}
				});
				JLabel lblTunai = new JLabel("Tunai");
				lblTunai.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
				lblTunai.setBounds(57, 202, 78, 14);
				layeredPane.add(lblTunai);
				
				
				txtunai = new JTextField();
				txtunai.setForeground(Color.BLACK);
				txtunai.setColumns(10);
				txtunai.setBounds(244, 199, 204, 20);
				layeredPane.add(txtunai);{
				
				total2.setBounds(458, 164, 71, 23);
				layeredPane.add(total2);
				
				
				
				
				JButton btnok = new JButton("Bayar");
				btnok.addActionListener(new ActionListener() {
					
				
					private String nama;
					private String total1;
					private String harga1;
					private String jumlah1;
					private int total2;
					
					
					public void actionPerformed(ActionEvent e) {
						
						nama = namabarang.getText();
						harga1 = harga.getText();
						jumlah1 = jumlah.getText();
						total1 = total.getText();
						
						tunai = Integer.valueOf(txtunai.getText());
						total2 = Integer.valueOf(total.getText());
						kembalian = tunai - total2 ;
						
						
						Date tgl = new Date();
						SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
						
						
						JFrame nota = new JFrame("Bill");
						nota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						nota.setBounds(100, 100, 319, 438);
						nota.setVisible(true);
						
						JPanel contentPane = new JPanel();
						contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
						contentPane.setLayout(new BorderLayout(0, 0));
						setContentPane(contentPane);
						nota.getContentPane().add(contentPane);
						
						JLayeredPane layeredPane = new JLayeredPane();
						contentPane.add(layeredPane, BorderLayout.CENTER);
						
						JLabel lblNewLabel = new JLabel("Toko Serba ada");
						lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
						lblNewLabel.setBounds(78, 11, 126, 14);
						layeredPane.add(lblNewLabel);
						
						JLabel lblNewLabel_1 = new JLabel("Jl. Pemograman");
						lblNewLabel_1.setBounds(88, 36, 94, 14);
						layeredPane.add(lblNewLabel_1);
						
						JLabel line1 = new JLabel("=========================================");
						line1.setBounds(0, 66, 305, 14);
						layeredPane.add(line1);
						
						JLabel line2 = new JLabel("=========================================");
						line2.setBounds(0, 93, 305, 14);
						layeredPane.add(line2);
						
						JLabel jbkasir = new JLabel("Kasir  : " + txnama.getText());
						jbkasir.setHorizontalAlignment(SwingConstants.RIGHT);
						jbkasir.setBounds(119, 80, 166, 14);
						layeredPane.add(jbkasir);
						
						JLabel lblTgl = new JLabel("Tgl :");
						lblTgl.setBounds(0, 80, 38, 14);
						layeredPane.add(lblTgl);
						
						JLabel tgll = new JLabel();
						tgll.setBounds(30, 80, 71, 14);
						tgll.setText(s.format(tgl));
						layeredPane.add(tgll);
						
						
						JLabel notanama = new JLabel(nama);
						notanama.setBounds(1, 128, 65, 14);
						layeredPane.add(notanama);
						
						JLabel notajumlah = new JLabel(jumlah1);
						notajumlah.setBounds(93, 128, 55, 14);
						layeredPane.add(notajumlah);
						
						JLabel notahrga = new JLabel(harga1);
						notahrga.setBounds(168, 128, 55, 14);
						layeredPane.add(notahrga);
						
						JLabel notatotal = new JLabel(total1);
						notatotal.setBounds(230, 128, 55, 14);
						notatotal.setHorizontalAlignment(SwingConstants.RIGHT);
						layeredPane.add(notatotal);
						
						JLabel line3 = new JLabel("-----------------------------------------------------------------------");
						line3.setBounds(0, 153, 285, 14);
						layeredPane.add(line3);
						
						JLabel lblTotalItem = new JLabel("Total Item");
						lblTotalItem.setBounds(0, 182, 65, 14);
						layeredPane.add(lblTotalItem);
						
						JLabel jumlahhrg = new JLabel(jumlah1);
						jumlahhrg.setBounds(93, 182, 55, 14);
						layeredPane.add(jumlahhrg);
						
						JLabel txtotall = new JLabel(total1);
						txtotall.setBounds(230, 182, 55, 14);
						txtotall.setHorizontalAlignment(SwingConstants.RIGHT);
						layeredPane.add(txtotall);
						
						JLabel notatunai = new JLabel("Tunai");
						notatunai.setBounds(0, 210, 65, 14);
						layeredPane.add(notatunai);
						
						JLabel lbtunai = new JLabel(txtunai.getText());
						lbtunai.setHorizontalAlignment(SwingConstants.RIGHT);
						lbtunai.setBounds(230, 210, 55, 14);
						layeredPane.add(lbtunai);
						
						JLabel notakembalian = new JLabel("Kembalian");
						notakembalian.setBounds(0, 240, 65, 14);
						layeredPane.add(notakembalian);
						
						JLabel txkembalian = new JLabel();
						txkembalian.setBounds(230, 240, 55, 14);
						txkembalian.setHorizontalAlignment(SwingConstants.RIGHT);
						txkembalian.setText(String.valueOf(kembalian));
						layeredPane.add(txkembalian);
					
						
						JLabel line4 = new JLabel("=========================================");
						line4.setBounds(0, 267, 305, 14);
						layeredPane.add(line4);
						
						JLabel lblNewLabel_4 = new JLabel("Terima Kasih");
						lblNewLabel_4.setBounds(113, 320, 91, 14);
						layeredPane.add(lblNewLabel_4);
						
						JLabel lblNewLabel_4_1 = new JLabel("Barang yang sudah dibeli tidak dapat dikembalikan");
						lblNewLabel_4_1.setBounds(0, 332, 347, 14);
						layeredPane.add(lblNewLabel_4_1);
						
						JLabel lblNewLabel_4_2 = new JLabel("Selamat Berbelanja ");
						lblNewLabel_4_2.setBounds(95, 345, 120, 14);
						layeredPane.add(lblNewLabel_4_2);
						
						dispose();
						
						
					}
					
					
				});
				btnok.setBounds(359, 285, 89, 23);
				layeredPane.add(btnok);
				
				JButton btntambah = new JButton("Tambah");
				btntambah.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						namabarang.setText("");
						harga.setText("");
						jumlah.setText("");
						total.setText("");
						txtunai.setText("");
						
						
					}
				});
				btntambah.setBounds(244, 285, 89, 23);
				layeredPane.add(btntambah);
				
				
				
				
				
				}dispose();
				

				
			}else if (txnama.getText().equals("Syahrul Romadhani") ){
				maaf.setText("Maaf masukan NIM dengan benar!");
				
			}else if (txnim.getText().equals("G50120004") ){
				maaf.setText("Maaf masukan Nama dengan benar!");
				
			}else {
				maaf.setText("Maaf User tidak dapat ditemukan !");
			}
				
				
		}
			
			
	});
		btlogin.setBounds(150, 140, 90, 30);
		form.add(btlogin);
		
		lbsukses = new JLabel("");
		lbsukses.setBounds(150, 200, 300, 30);
		form.add(lbsukses);
	}

}
