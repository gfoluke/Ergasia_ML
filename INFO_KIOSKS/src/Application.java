import java.awt.Choice;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Application extends JFrame {
	
	private Desktop desktop1;
	private JPanel contentPane;
	private JLabel label1, label2, label3, label4, labelgreece;
	private JPanel panelguide, panelweather, panelsos;
	private JButton buttonhome1, buttonmuseum, buttonbar, buttonbeach,
			buttonhotel, buttonmap, buttoninfo, buttonweather, buttonguide,
			buttonhome2;
	private JLabel labelhelp;
	private JLabel labelweather, labelweathermessage, labeltoday,
			labeltomorrow;
	private JPanel panelmap, panellogin;
	private JButton buttonhome3, buttonlogin, buttonhome10;
	private JLabel labelmap;
	private JLabel labelmapmessage;
	JPanel panelinfo;
	private JPanel panelpharmacy;
	private JButton buttonhome4;
	private JButton buttonhospital;
	private JButton buttonpharmacy;
	private JButton buttonsos;
	private JButton buttoncontact;
	int i = 1;
	int j = 0;
	int k = 0;
	int l = 0;
	int p = 0;
	int t = 0;
	int r = 0;
	private JPanel panelmuseum;
	private JButton buttonhome5, buttonhome6, buttonhome7;
	private Connection conn=null;
	private java.sql.Statement stmt ;
	private ResultSet rs=null;
	private JTable tablesos;
	private JButton buttonback1;
	private JButton buttonback2;
	JPanel panelcontact;
	private JTable tablecontact;
	private JTable tabletoday;
	private JTable tabletomorrow;
	private JButton buttonhome8;
	private JButton buttonback4;
	private JPanel panelhospital;
	private JTable tabletodayhospital;
	private JButton buttonhome9;
	private JButton buttonback5;
	private JLabel labeltodayhospital;
	private JLabel labeltomorrowhospital;
	private JTable tabletomorrowhospital;
	private Choice choicemuseum;
	public JLabel labelphoto;
	private JButton buttondromologisi;
	private JEditorPane editormuseum;
	private String newline = System.getProperty("line.separator");
	private JTextField textfieldusername;
	private JTextField textfieldpassword;
	private JButton buttonsubmit;
	private JButton buttonlogout;
	private JButton buttonok2;
	private JButton buttonadd1;
	private JButton buttonaf1;
	private JButton buttonok3, buttonok4, buttonok1;
	private JButton buttonaf2=null, buttonaf3=null;
	private JButton buttonadd2, buttonadd3;
	private JButton buttonadd4=null;
	private JButton buttonaf4=null;
	private JButton buttonok5=null;
	private JButton buttonadd5=null;
	private JButton buttonaf5=null;
	private JButton buttonadd6=null, buttonadd7=null;
	private JButton buttonaf6=null, buttonaf7=null;
	private JButton buttonconfirm1=null;
	private JTable tablemuseum;
	private JTable tablebeach;
	private int flag = 0;
	private int shm = 0;
	private int hshmaiamou=0;
	AdminSql admin = new AdminSql();
	UserSql user =new UserSql();
	Translation lan = new Translation();
	BasicButtons basic=new BasicButtons();
	AdButtons adbu=new AdButtons();

	public void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:mysql://snf-476563.vm.okeanos.grnet.gr/mhxlog"
					+ "?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "Nig4m31xM1";
			conn = DriverManager.getConnection(connectionUrl, username,
					password);
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		
	}

	public Application() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
				"myimages\\Info2.png")));
		setResizable(false);
		setTitle("INFO_KIOSKS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 599);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(3, 3, 3, 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelinfo = new JPanel();
		panelinfo.setBackground(new Color(0, 0, 51));
		panelinfo.setBounds(141, 0, 523, 571);
		panelinfo.setVisible(false);

		panellogin = new JPanel();
		panellogin.setBackground(new Color(0, 0, 51));
		panellogin.setBounds(141, 0, 523, 571);
		panellogin.setVisible(false);

		panelpharmacy = new JPanel();
		panelpharmacy.setBackground(new Color(0, 0, 51));
		panelpharmacy.setBounds(141, 0, 523, 571);
		panelpharmacy.setVisible(false);

		panelhospital = new JPanel();
		panelhospital.setForeground(Color.WHITE);
		panelhospital.setBackground(new Color(0, 0, 51));
		panelhospital.setBounds(141, 0, 523, 571);
		panelhospital.setVisible(false);

		panelmuseum = new JPanel();
		panelmuseum.setBackground(new Color(0, 0, 51));
		panelmuseum.setBounds(141, 0, 523, 571);
		panelmuseum.setVisible(false);
		
				panelcontact = new JPanel();
				panelcontact.setBackground(new Color(0, 0, 51));
				panelcontact.setBounds(141, 0, 523, 571);
				panelcontact.setVisible(false);
				
						panelsos = new JPanel();
						panelsos.setBounds(141, 0, 523, 571);
						contentPane.add(panelsos);
						panelsos.setBackground(new Color(0, 0, 51));
						panelsos.setForeground(Color.WHITE);
						panelsos.setVisible(false);
						panelsos.setLayout(null);
						
								tablesos = new JTable();
								tablesos.setRowSelectionAllowed(false);
								tablesos.setEnabled(false);
								tablesos.setModel(new DefaultTableModel(
										new Object[][] { { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, { null, null },
												{ null, null }, { null, null }, }, new String[] {
												"New column", "New column" }));
								tablesos.getColumnModel().getColumn(0).setPreferredWidth(180);
								tablesos.getColumnModel().getColumn(1).setPreferredWidth(50);
								tablesos.setForeground(Color.WHITE);
								tablesos.setBackground(new Color(0, 0, 51));
								tablesos.setBorder(new LineBorder(Color.WHITE));
								tablesos.setBounds(10, 97, 503, 96);
								panelsos.add(tablesos);
								
										buttonhome6 = new JButton(
												"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
										buttonhome6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												i=basic.arx6(  labelgreece, buttonguide, buttonmap, buttonweather,
														 buttonlogin, buttonlogout, panelsos, i);
											}
										});
										buttonhome6.setIcon(new ImageIcon(getClass().getResource(
												"myimages\\Home.png")));
										buttonhome6.setForeground(Color.WHITE);
										buttonhome6.setFont(new Font("Tahoma", Font.BOLD, 12));
										buttonhome6.setBackground(new Color(255, 102, 0));
										buttonhome6.setBounds(10, 11, 217, 45);
										panelsos.add(buttonhome6);
										
												buttonback1 = new JButton("");
												buttonback1.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														basic.arx11(  panelsos, panelinfo);
													}
												});
												buttonback1
														.setIcon(new ImageIcon(getClass().getResource(
																"myimages\\windows-media-player-back-button-clipart (1).png")));
												buttonback1.setForeground(Color.WHITE);
												buttonback1.setFont(new Font("Tahoma", Font.BOLD, 12));
												buttonback1.setBackground(new Color(255, 102, 0));
												buttonback1.setBounds(245, 11, 53, 45);
												panelsos.add(buttonback1);
												
														buttonok3 = new JButton("");
														buttonok3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																admin.adaction7(tablesos, stmt, conn, rs);

															}

														});
														buttonok3
																.setIcon(new ImageIcon(getClass().getResource(
																		"myimages\\ok-icon (1).png")));
														buttonok3.setBounds(318, 11, 53, 45);
														buttonok3.setVisible(false);
														panelsos.add(buttonok3);
														
																buttonaf2 = new JButton(
																		"- \u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u03B3\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
																buttonaf2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		adbu.af1(tablesos);
																	}
																});
																buttonaf2.setBackground(new Color(0, 0, 51));
																buttonaf2.setForeground(Color.WHITE);
																buttonaf2.setBounds(245, 67, 169, 22);
																buttonaf2.setVisible(false);
																panelsos.add(buttonaf2);
																
																		buttonadd2 = new JButton(
																				"+ \u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
																		buttonadd2.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				adbu.add1(tablesos);
																			}
																		});
																		buttonadd2.setBackground(new Color(0, 0, 51));
																		buttonadd2.setForeground(Color.WHITE);
																		buttonadd2.setBounds(58, 67, 169, 22);
																		buttonadd2.setVisible(false);
																		panelsos.add(buttonadd2);
				contentPane.add(panelcontact);
				panelcontact.setLayout(null);
				
						tablecontact = new JTable();
						tablecontact.setRowSelectionAllowed(false);
						tablecontact.setEnabled(false);
						tablecontact.setFont(new Font("Tahoma", Font.PLAIN, 17));
						tablecontact.setBackground(new Color(0, 0, 51));
						tablecontact.setForeground(Color.WHITE);
						tablecontact.setBorder(new LineBorder(Color.WHITE));
						tablecontact.setModel(new DefaultTableModel(
								new Object[][] { { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, }, new String[] {
										"New column", "New column" }));
						tablecontact.getColumnModel().getColumn(0).setPreferredWidth(70);
						tablecontact.getColumnModel().getColumn(1).setPreferredWidth(136);
						tablecontact.setBounds(58, 100, 393, 64);
						panelcontact.add(tablecontact);
						
								buttonhome7 = new JButton(
										"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
								buttonhome7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										l = 0;
										i=basic.arx10(labelgreece, buttonmap, buttonweather,
												 buttonlogin, buttonlogout, i, 
												 panelguide, buttoninfo, panelcontact,buttonguide);
									}
								});
								buttonhome7.setBackground(new Color(255, 102, 0));
								buttonhome7.setIcon(new ImageIcon(getClass().getResource("myimages\\Home.png")));
								buttonhome7.setForeground(Color.WHITE);
								buttonhome7.setFont(new Font("Tahoma", Font.BOLD, 12));
								buttonhome7.setBounds(10, 11, 217, 45);
								panelcontact.add(buttonhome7);
								
										JButton buttonback3 = new JButton("");
										buttonback3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												l=basic.arx14( panelcontact, panelinfo , l);
											}
										});
										buttonback3
												.setIcon(new ImageIcon(getClass().getResource(
														"myimages\\windows-media-player-back-button-clipart (1).png")));
										buttonback3.setBounds(245, 11, 53, 45);
										panelcontact.add(buttonback3);
										
												buttonok2 = new JButton("");
												buttonok2.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														admin.adaction3(tablecontact, stmt, conn, rs);

													}
												});
												buttonok2.setVisible(false);
												buttonok2
														.setIcon(new ImageIcon(getClass().getResource(
																"myimages\\ok-icon (1).png")));
												buttonok2.setBounds(318, 11, 53, 45);
												panelcontact.add(buttonok2);
												
														buttonadd1 = new JButton(
																"+ \u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
														buttonadd1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																adbu.add6(tablecontact);
															}
														});
														buttonadd1.setVisible(false);
														buttonadd1.setForeground(Color.WHITE);
														buttonadd1.setBackground(new Color(0, 0, 51));
														buttonadd1.setBounds(58, 67, 169, 22);
														panelcontact.add(buttonadd1);
														
																buttonaf1 = new JButton(
																		"- \u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u03B3\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
																buttonaf1.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent arg0) {
																		adbu.af6(tablecontact);
																	}
																});
																buttonaf1.setVisible(false);
																buttonaf1.setBackground(new Color(0, 0, 51));
																buttonaf1.setForeground(Color.WHITE);
																buttonaf1.setBounds(245, 67, 169, 22);
																panelcontact.add(buttonaf1);
		contentPane.add(panelmuseum);
		panelmuseum.setLayout(null);

		buttonhome5 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i=basic.arx1( labelgreece, panelmuseum, buttonmap, buttoninfo, buttonweather,
						 labelphoto, buttondromologisi, editormuseum,
						 choicemuseum, buttonlogin, buttonlogout, i);
			}
		});
		buttonhome5.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome5.setBounds(10, 11, 217, 45);
		buttonhome5.setForeground(Color.WHITE);
		buttonhome5.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome5.setBackground(new Color(255, 102, 0));
		panelmuseum.add(buttonhome5);

		buttonback2 = new JButton("");
		buttonback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				basic.arx15( panelmuseum, panelguide, labelphoto,
						 buttondromologisi, editormuseum, choicemuseum);
			}
		});
		buttonback2
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\windows-media-player-back-button-clipart (1).png")));
		buttonback2.setBounds(245, 11, 53, 45);
		panelmuseum.add(buttonback2);

		choicemuseum = new Choice();
		choicemuseum.setBackground(new Color(0, 0, 51));
		choicemuseum.setForeground(Color.WHITE);
		choicemuseum.setFont(new Font("Dialog", Font.PLAIN, 15));
		choicemuseum.setBounds(0, 97, 513, 23);
		panelmuseum.add(choicemuseum);

		labelphoto = new JLabel("");
		labelphoto.setBounds(10, 147, 217, 148);
		panelmuseum.add(labelphoto);

		buttonok1 = new JButton("");
		buttonok1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.action( conn, stmt, rs, labelphoto, buttondromologisi
						, editormuseum, choicemuseum, newline);
			}
		});
		buttonok1.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\ok-icon.png")));
		buttonok1.setBounds(318, 11, 53, 45);
		panelmuseum.add(buttonok1);

		buttondromologisi = new JButton(
				"\u0394\u03C1\u03BF\u03BC\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7");
		buttondromologisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin.adaction(choicemuseum, stmt, conn, rs);

			}
		});
		buttondromologisi.setVisible(false);
		buttondromologisi
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\circle_compass_safari_web_archive_-512.png")));
		buttondromologisi.setForeground(Color.WHITE);
		buttondromologisi.setBackground(new Color(0, 0, 51));
		buttondromologisi.setBounds(47, 306, 143, 31);
		panelmuseum.add(buttondromologisi);

		editormuseum = new JEditorPane();
		editormuseum.setEditable(false);
		editormuseum.setEnabled(false);
		editormuseum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		editormuseum.setForeground(Color.WHITE);
		editormuseum.setBackground(new Color(0, 0, 51));
		editormuseum.setBounds(237, 147, 276, 391);
		panelmuseum.add(editormuseum);

		buttonconfirm1 = new JButton("");
		buttonconfirm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin.adaction2(tablemuseum, tablebeach, stmt, conn, rs);
			}
		});
		buttonconfirm1
		.setIcon(new ImageIcon(getClass().getResource("/myimages/ok-icon (1).png")));
		buttonconfirm1.setBounds(390, 11, 53, 45);
		buttonconfirm1.setVisible(false);
		panelmuseum.add(buttonconfirm1);

		tablemuseum = new JTable();
		tablemuseum.setRowSelectionAllowed(false);
		tablemuseum.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column",
						"New column", "New column", "New column", "New column",
						"New column" }));
		tablemuseum.getColumnModel().getColumn(1).setPreferredWidth(84);
		tablemuseum.setBorder(new LineBorder(Color.WHITE));
		tablemuseum.setBackground(new Color(0, 0, 51));
		tablemuseum.setForeground(Color.WHITE);
		tablemuseum.setVisible(false);
		tablemuseum.setBounds(0, 126, 513, 128);
		panelmuseum.add(tablemuseum);

		buttonadd7 = new JButton(
				"+\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonadd7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.add7( tablemuseum, tablebeach, shm);
			}
		});
		buttonadd7.setVisible(false);
		buttonadd7.setBackground(new Color(0, 0, 51));
		buttonadd7.setForeground(Color.WHITE);
		buttonadd7.setBounds(58, 67, 169, 22);
		panelmuseum.add(buttonadd7);

		buttonaf7 = new JButton(
				"-\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonaf7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.af7(tablemuseum, tablebeach, shm);
			}
		});
		buttonaf7.setVisible(false);
		buttonaf7.setBackground(new Color(0, 0, 51));
		buttonaf7.setForeground(Color.WHITE);
		buttonaf7.setBounds(245, 67, 169, 22);
		panelmuseum.add(buttonaf7);

		tablebeach = new JTable();
		tablebeach.setBorder(new LineBorder(Color.WHITE));
		tablebeach.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null }, }, new String[] {
				"New column", "New column", "New column", "New column",
				"New column" }));
		tablebeach.setForeground(Color.WHITE);
		tablebeach.setRowSelectionAllowed(false);
		tablebeach.setVisible(false);
		tablebeach.setBackground(new Color(0, 0, 51));
		tablebeach.setBounds(0, 126, 513, 64);
		panelmuseum.add(tablebeach);

		panelguide = new JPanel();
		panelguide.setBounds(141, 0, 523, 571);
		contentPane.add(panelguide);
		panelguide.setBackground(new Color(0, 0, 51));
		panelguide.setVisible(false);
		panelguide.setLayout(null);

		buttonhome1 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=basic.arx9(  labelgreece, buttonmap, buttonweather,
						 buttonlogin, buttonlogout, i, panelguide, buttoninfo);
			}
		});
		buttonhome1.setForeground(Color.WHITE);
		buttonhome1.setBackground(new Color(255, 102, 0));
		buttonhome1.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome1.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome1.setSelectedIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome1.setBounds(10, 11, 217, 45);
		panelguide.add(buttonhome1);

		buttonmuseum = new JButton(
				"\u0391\u03A1\u03A7\u0391\u0399\u039F\u039B\u039F\u0393\u0399\u039A\u039F\u0399 \u03A7\u03A9\u03A1\u039F\u0399 - \u039C\u039F\u03A5\u03A3\u0395\u0399\u0391");
		buttonmuseum.addActionListener(new ActionListener() {
			final public void actionPerformed(ActionEvent e) {
				shm=admin.adaction4(panelguide, tablemuseum, panelmuseum,
						tablebeach, shm, choicemuseum, flag, stmt, conn, rs);
			}
		});
		buttonmuseum.setHorizontalAlignment(SwingConstants.LEFT);
		buttonmuseum.setForeground(Color.WHITE);
		buttonmuseum.setBackground(new Color(0, 102, 255));
		buttonmuseum.setToolTipText("");
		buttonmuseum
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\museum-512.png")));
		buttonmuseum
				.setSelectedIcon(new ImageIcon(getClass().getResource(
						"myimages\\museum-512.png")));
		buttonmuseum.setBounds(10, 97, 503, 38);
		panelguide.add(buttonmuseum);

		buttonbar = new JButton(
				"\u039C\u03A0\u0391\u03A1 - \u0395\u03A3\u03A4\u0399\u0391\u03A4\u039F\u03A1\u0399\u0391");
		buttonbar.setHorizontalAlignment(SwingConstants.LEFT);
		buttonbar
				.setIcon(new ImageIcon(getClass().getResource(
						"\\myimages\\Dining-256.png")));
		buttonbar.setToolTipText("");
		buttonbar.setForeground(Color.WHITE);
		buttonbar.setBackground(new Color(0, 102, 255));
		buttonbar.setBounds(10, 146, 503, 38);
		panelguide.add(buttonbar);

		buttonbeach = new JButton(
				"\u03A0\u0391\u03A1\u0391\u039B\u0399\u0395\u03A3");
		buttonbeach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				shm=user.action1(panelguide, panelmuseum, tablemuseum,
						tablebeach, flag, shm,conn, stmt, rs, choicemuseum);

			}
		});
		buttonbeach.setHorizontalAlignment(SwingConstants.LEFT);
		buttonbeach.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\images.jpg")));
		buttonbeach.setToolTipText("");
		buttonbeach.setForeground(Color.WHITE);
		buttonbeach.setBackground(new Color(0, 102, 255));
		buttonbeach.setBounds(10, 195, 503, 38);
		panelguide.add(buttonbeach);

		buttonhotel = new JButton(
				"\u039E\u0395\u039D\u039F\u0394\u039F\u03A7\u0395\u0399\u0391");
		buttonhotel.setHorizontalAlignment(SwingConstants.LEFT);
		buttonhotel
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\12128652-vector-illustration-of-single-isolated-hotel-icon.jpg")));
		buttonhotel.setToolTipText("");
		buttonhotel.setForeground(Color.WHITE);
		buttonhotel.setBackground(new Color(0, 102, 255));
		buttonhotel.setBounds(10, 244, 503, 38);
		panelguide.add(buttonhotel);
		contentPane.add(panelhospital);
		panelhospital.setLayout(null);

		tabletodayhospital = new JTable();
		tabletodayhospital.setRowSelectionAllowed(false);
		tabletodayhospital.setEnabled(false);
		tabletodayhospital.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "New column",
				"New column", "New column", "New column" }));
		tabletodayhospital.getColumnModel().getColumn(0).setPreferredWidth(170);
		tabletodayhospital.getColumnModel().getColumn(1).setPreferredWidth(220);
		tabletodayhospital.getColumnModel().getColumn(2).setPreferredWidth(70);
		tabletodayhospital.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabletodayhospital.setBorder(new LineBorder(Color.WHITE));
		tabletodayhospital.setBounds(0, 99, 513, 81);
		tabletodayhospital.setForeground(Color.WHITE);
		// tabletodayhospital.setRowHeight(35);

		tabletodayhospital.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabletodayhospital.setBackground(new Color(0, 0, 51));
		panelhospital.add(tabletodayhospital);

		buttonhome9 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=basic.arx8(labelgreece, buttonguide, buttonmap, buttonweather,
						 buttonlogin, buttonlogout, i, panelhospital);
			}
		});
		buttonhome9.setIcon(new ImageIcon(getClass().getResource(
				"\\myimages\\Home.png")));
		buttonhome9.setBounds(10, 11, 217, 45);
		buttonhome9.setForeground(Color.WHITE);
		buttonhome9.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome9.setBackground(new Color(255, 102, 0));
		panelhospital.add(buttonhome9);

		buttonback5 = new JButton("");
		buttonback5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				basic.arx13(panelhospital, panelinfo);
			}
		});
		buttonback5
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\windows-media-player-back-button-clipart (1).png")));
		buttonback5.setBounds(245, 11, 53, 45);
		buttonback5.setForeground(Color.WHITE);
		buttonback5.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonback5.setBackground(new Color(255, 102, 0));
		panelhospital.add(buttonback5);

		labeltodayhospital = new JLabel("\u03A3\u0397\u039C\u0395\u03A1\u0391");
		labeltodayhospital.setBounds(20, 67, 503, 37);
		labeltodayhospital.setHorizontalAlignment(SwingConstants.CENTER);
		labeltodayhospital.setForeground(Color.WHITE);
		labeltodayhospital.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelhospital.add(labeltodayhospital);

		labeltomorrowhospital = new JLabel("\u0391\u03A5\u03A1\u0399\u039F");
		labeltomorrowhospital.setBounds(20, 288, 503, 37);
		labeltomorrowhospital.setHorizontalAlignment(SwingConstants.CENTER);
		labeltomorrowhospital.setForeground(Color.WHITE);
		labeltomorrowhospital.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelhospital.add(labeltomorrowhospital);

		tabletomorrowhospital = new JTable();
		tabletomorrowhospital.setRowSelectionAllowed(false);
		tabletomorrowhospital.setEnabled(false);
		tabletomorrowhospital.setBorder(new LineBorder(Color.WHITE));
		tabletomorrowhospital.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "New column",
				"New column", "New column", "New column" }));
		tabletomorrowhospital.getColumnModel().getColumn(0)
				.setPreferredWidth(149);
		tabletomorrowhospital.getColumnModel().getColumn(1)
				.setPreferredWidth(170);
		tabletomorrowhospital.getColumnModel().getColumn(2)
				.setPreferredWidth(50);
		tabletomorrowhospital.setForeground(Color.WHITE);
		tabletomorrowhospital.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabletomorrowhospital.setBackground(new Color(0, 0, 51));
		// tabletomorrowhospital.setRowHeight(35);
		tabletomorrowhospital.setBounds(0, 320, 513, 65);
		panelhospital.add(tabletomorrowhospital);

		buttonok5 = new JButton("");
		buttonok5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin.adaction5(tabletodayhospital, tabletomorrowhospital, stmt, conn, rs);
			}
		});
		buttonok5.setVisible(false);
		buttonok5
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\ok-icon (1).png")));
		buttonok5.setBounds(318, 11, 53, 45);
		panelhospital.add(buttonok5);

		buttonadd5 = new JButton(
				"+\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonadd5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.add5(tabletodayhospital);
			}
		});
		buttonadd5.setBackground(new Color(0, 0, 51));
		buttonadd5.setForeground(Color.WHITE);
		buttonadd5.setVisible(false);
		buttonadd5.setBounds(35, 67, 169, 22);
		panelhospital.add(buttonadd5);

		buttonaf5 = new JButton(
				"-\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonaf5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.af5(tabletodayhospital);
			}
		});
		buttonaf5.setForeground(Color.WHITE);
		buttonaf5.setVisible(false);
		buttonaf5.setBackground(new Color(0, 0, 51));
		buttonaf5.setBounds(340, 67, 169, 22);
		panelhospital.add(buttonaf5);

		buttonadd6 = new JButton(
				"+\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonadd6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.add4(tabletomorrowhospital);
			}
		});
		buttonadd6.setForeground(Color.WHITE);
		buttonadd6.setVisible(false);
		buttonadd6.setBackground(new Color(0, 0, 51));
		buttonadd6.setBounds(35, 288, 169, 22);
		panelhospital.add(buttonadd6);

		buttonaf6 = new JButton(
				"-\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonaf6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.af4(tabletomorrowhospital);
			}
		});
		buttonaf6.setForeground(Color.WHITE);
		buttonaf6.setVisible(false);
		buttonaf6.setBackground(new Color(0, 0, 51));
		buttonaf6.setBounds(340, 288, 169, 22);
		panelhospital.add(buttonaf6);
		contentPane.add(panelpharmacy);
		panelpharmacy.setLayout(null);

		tabletoday = new JTable();
		tabletoday.setRowSelectionAllowed(false);
		tabletoday.setEnabled(false);
		tabletoday.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabletoday.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "New column",
				"New column", "New column" }));
		tabletoday.getColumnModel().getColumn(0).setPreferredWidth(300);
		tabletoday.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabletoday.getColumnModel().getColumn(2).setPreferredWidth(193);
		tabletoday.setForeground(Color.WHITE);
		tabletoday.setBackground(new Color(0, 0, 51));
		tabletoday.setBorder(new LineBorder(Color.WHITE));
		tabletoday.setBounds(0, 99, 513, 64);
		panelpharmacy.add(tabletoday);

		tabletomorrow = new JTable();
		tabletomorrow.setRowSelectionAllowed(false);
		tabletomorrow.setEnabled(false);
		tabletomorrow.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabletomorrow.setBorder(new LineBorder(Color.WHITE));
		tabletomorrow.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "New column",
				"New column", "New column" }));
		tabletomorrow.getColumnModel().getColumn(0).setPreferredWidth(300);
		tabletomorrow.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabletomorrow.getColumnModel().getColumn(2).setPreferredWidth(173);
		tabletomorrow.setForeground(Color.WHITE);
		tabletomorrow.setBackground(new Color(0, 0, 51));
		tabletomorrow.setBounds(0, 321, 513, 64);
		panelpharmacy.add(tabletomorrow);

		buttonhome8 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=basic.arx7(  labelgreece, buttonguide, buttonmap, buttonweather,
						 buttonlogin, buttonlogout, i, panelpharmacy);
			}
		});
		buttonhome8.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome8.setForeground(Color.WHITE);
		buttonhome8.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome8.setBackground(new Color(255, 102, 0));
		buttonhome8.setBounds(10, 11, 217, 45);
		panelpharmacy.add(buttonhome8);

		buttonback4 = new JButton("");
		buttonback4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				basic.arx12(panelinfo, panelpharmacy);
			}
		});
		buttonback4
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\windows-media-player-back-button-clipart (1).png")));
		buttonback4.setForeground(Color.WHITE);
		buttonback4.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonback4.setBackground(new Color(255, 102, 0));
		buttonback4.setBounds(245, 11, 53, 45);
		panelpharmacy.add(buttonback4);

		labeltoday = new JLabel("\u03A3\u0397\u039C\u0395\u03A1\u0391");
		labeltoday.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labeltoday.setHorizontalAlignment(SwingConstants.CENTER);
		labeltoday.setForeground(Color.WHITE);
		labeltoday.setBounds(20, 67, 503, 37);
		panelpharmacy.add(labeltoday);

		labeltomorrow = new JLabel("\u0391\u03A5\u03A1\u0399\u039F");
		labeltomorrow.setHorizontalAlignment(SwingConstants.CENTER);
		labeltomorrow.setForeground(Color.WHITE);
		labeltomorrow.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labeltomorrow.setBounds(20, 288, 503, 37);
		panelpharmacy.add(labeltomorrow);

		buttonadd3 = new JButton(
				"+\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonadd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adbu.add3(tabletoday);
			}
		});
		buttonadd3.setBackground(new Color(0, 0, 51));
		buttonadd3.setVisible(false);
		buttonadd3.setForeground(Color.WHITE);
		buttonadd3.setBounds(35, 67, 169, 22);
		panelpharmacy.add(buttonadd3);

		buttonaf3 = new JButton(
				"-\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonaf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.af3(tabletoday);
			}
		});
		buttonaf3.setBackground(new Color(0, 0, 51));
		buttonaf3.setVisible(false);
		buttonaf3.setForeground(Color.WHITE);
		buttonaf3.setBounds(340, 67, 169, 22);
		panelpharmacy.add(buttonaf3);

		buttonok4 = new JButton("");
		buttonok4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin.adaction6(tabletoday, tabletomorrow, stmt, conn, rs);
			}
		});
		buttonok4
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\ok-icon (1).png")));
		buttonok4.setBounds(318, 11, 53, 45);
		buttonok4.setVisible(false);
		panelpharmacy.add(buttonok4);

		buttonadd4 = new JButton(
				"+\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonadd4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.add2(tabletomorrow);
			}
		});
		buttonadd4.setForeground(Color.WHITE);
		buttonadd4.setBackground(new Color(0, 0, 51));
		buttonadd4.setVisible(false);
		buttonadd4.setBounds(35, 288, 169, 22);
		panelpharmacy.add(buttonadd4);

		buttonaf4 = new JButton(
				"-\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0393\u03C1\u03B1\u03BC\u03BC\u03AE\u03C2");
		buttonaf4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.af2(tabletomorrow);
			}
		});
		buttonaf4.setForeground(Color.WHITE);
		buttonaf4.setBackground(new Color(0, 0, 51));
		buttonaf4.setBounds(340, 288, 169, 22);
		buttonaf4.setVisible(false);
		panelpharmacy.add(buttonaf4);
		contentPane.add(panellogin);
		panellogin.setLayout(null);

		buttonhome10 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				basic.arx5(  panellogin, labelgreece, buttonguide, buttonmap, buttoninfo, buttonweather,
						 buttonlogin, buttonlogout);
			}
		});
		buttonhome10.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome10.setForeground(Color.WHITE);
		buttonhome10.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome10.setBackground(new Color(255, 102, 0));
		buttonhome10.setBounds(10, 11, 217, 45);
		panellogin.add(buttonhome10);

		JLabel labelusername = new JLabel("USERNAME:");
		labelusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelusername.setForeground(Color.WHITE);
		labelusername.setHorizontalAlignment(SwingConstants.CENTER);
		labelusername.setBounds(136, 216, 94, 22);
		panellogin.add(labelusername);

		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(136, 256, 94, 22);
		panellogin.add(lblPassword);

		textfieldusername = new JTextField();
		textfieldusername.setForeground(Color.WHITE);
		textfieldusername.setBackground(Color.BLACK);
		textfieldusername.setBounds(240, 216, 154, 20);
		panellogin.add(textfieldusername);
		textfieldusername.setColumns(10);

		textfieldpassword = new JTextField();
		textfieldpassword.setForeground(Color.WHITE);
		textfieldpassword.setBackground(Color.BLACK);
		textfieldpassword.setColumns(10);
		textfieldpassword.setBounds(240, 259, 154, 20);
		panellogin.add(textfieldpassword);

		buttonsubmit = new JButton("Submit");
		buttonsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=admin.adaction8(textfieldusername, labelgreece, panellogin,
						buttonmap, buttonguide, buttoninfo, buttonweather,
						buttonlogin, buttonlogout, textfieldpassword,
						tablecontact, buttonok2, buttonadd1, buttonaf1,
						tablesos, buttonok3, buttonadd2, buttonaf2, buttonok4,
						buttonadd3, buttonaf3, buttonadd4, buttonaf4,
						buttonok5, tabletoday, tabletomorrow, buttonadd5,
						buttonaf5, buttonadd6, buttonaf6, tabletodayhospital,
						tabletomorrowhospital, buttonok1, buttonconfirm1,
						buttondromologisi, buttonadd7, buttonaf7, labelphoto,
						tablemuseum, tablebeach, editormuseum, choicemuseum,
						flag, newline, stmt, conn, rs);
			}

		});
		buttonsubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonsubmit.setForeground(Color.WHITE);
		buttonsubmit.setBackground(new Color(102, 0, 0));
		buttonsubmit.setBounds(149, 302, 245, 23);
		panellogin.add(buttonsubmit);
		contentPane.add(panelinfo);
		panelinfo.setLayout(null);

		buttonhome4 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=basic.arx4(  panelinfo, buttonmap, panelsos, labelgreece, buttonweather,
						 buttonguide, buttonlogin, buttonlogout, i);
			}
		});

		buttonhome4.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome4.setForeground(Color.WHITE);
		buttonhome4.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome4.setBackground(new Color(255, 102, 0));
		buttonhome4.setBounds(10, 11, 217, 45);
		panelinfo.add(buttonhome4);

		buttonhospital = new JButton(
				"\u0395\u03A6\u0397\u039C\u0395\u03A1\u0395\u03A5\u039F\u039D\u03A4\u0391 \u039D\u039F\u03A3\u039F\u039A\u039F\u039C\u0395\u0399\u0391");
		buttonhospital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.action2(panelhospital, panelinfo, tabletodayhospital,
						tabletomorrowhospital, r,conn, stmt, rs);
			}
		});
		buttonhospital
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\Healthcare-Hospital-icon.png")));
		buttonhospital.setToolTipText("");
		buttonhospital.setHorizontalAlignment(SwingConstants.LEFT);
		buttonhospital.setForeground(Color.WHITE);
		buttonhospital.setBackground(new Color(0, 102, 255));
		buttonhospital.setBounds(10, 97, 503, 38);
		panelinfo.add(buttonhospital);

		buttonpharmacy = new JButton(
				"\u0395\u03A6\u0397\u039C\u0395\u03A1\u0395\u03A5\u039F\u039D\u03A4\u0391 \u03A6\u0391\u03A1\u039C\u0391\u039A\u0395\u0399\u0391");
		buttonpharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.action3(panelpharmacy, panelinfo, tabletoday,
						tabletomorrow, tablesos,conn, stmt, rs);

			}
		});
		buttonpharmacy
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\Pharmacy-Cross.png")));
		buttonpharmacy.setToolTipText("");
		buttonpharmacy.setHorizontalAlignment(SwingConstants.LEFT);
		buttonpharmacy.setForeground(Color.WHITE);
		buttonpharmacy.setBackground(new Color(0, 102, 255));
		buttonpharmacy.setBounds(10, 146, 503, 38);
		panelinfo.add(buttonpharmacy);

		buttonsos = new JButton(
				"\u03A4\u0397\u039B\u0395\u03A6\u03A9\u039D\u0391 \u0395\u039A\u03A4\u0391\u039A\u03A4\u0397\u03A3 \u0391\u039D\u0391\u0393\u039A\u0397\u03A3");
		buttonsos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.action4(panelsos, panelinfo, k, tablesos,conn, stmt, rs);
			}
		});
		buttonsos.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\icon.png")));
		buttonsos.setToolTipText("");
		buttonsos.setHorizontalAlignment(SwingConstants.LEFT);
		buttonsos.setForeground(Color.WHITE);
		buttonsos.setBackground(new Color(0, 102, 255));
		buttonsos.setBounds(10, 195, 503, 38);
		panelinfo.add(buttonsos);

		buttoncontact = new JButton(
				"\u0395\u03A0\u0399\u039A\u039F\u0399\u039D\u03A9\u039D\u0397\u03A3\u03A4\u0395 \u039C\u0391\u0396\u0399 \u039C\u0391\u03A3");
		buttoncontact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user.action5(panelcontact, panelinfo, tablecontact,conn, stmt, rs);

			}
		});
		buttoncontact.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\unnamed.png")));
		buttoncontact.setToolTipText("");
		buttoncontact.setHorizontalAlignment(SwingConstants.LEFT);
		buttoncontact.setForeground(Color.WHITE);
		buttoncontact.setBackground(new Color(0, 102, 255));
		buttoncontact.setBounds(10, 244, 503, 38);
		panelinfo.add(buttoncontact);

		final JLabel lblClock = new JLabel("Clock");
		lblClock.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClock.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClock.setForeground(Color.WHITE);
		lblClock.setBounds(644, 0, 130, 41);
		Clock time=new Clock();
		time.ora(lblClock);
		contentPane.add(lblClock);

		final JButton ButtonHelp = new JButton("");
		ButtonHelp
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\Button-Help-icon (1).png")));
		ButtonHelp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					if (Desktop.isDesktopSupported()) {
						try {
							Desktop.getDesktop()
									.open(new File(getClass().getResource(
											"myimages\\help.docx").toURI()));
						} catch (URISyntaxException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}

			}
		});
		ButtonHelp.setFocusPainted(false);
		ButtonHelp.setBackground(new Color(153, 0, 0));
		ButtonHelp.setForeground(Color.BLACK);
		ButtonHelp.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonHelp.setBounds(751, 507, 23, 35);
		contentPane.add(ButtonHelp);

		JButton buttongreek = new JButton("");
		buttongreek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lan.actiongreek(label1, label2, label3, label4, labelhelp,
						labeltoday, labeltomorrow, labeltodayhospital,
						labeltomorrowhospital, labelmapmessage,
						labelweathermessage, buttonhome1, buttonhome2,
						buttonhome3, buttonhome4, buttonhome5, buttonhome6,
						buttonhome7, buttonhome8, buttonhome9, buttonhome10,
						buttonmuseum, buttonbar, buttonbeach, buttonhotel,
						buttonhospital, buttonpharmacy, buttonsos,
						buttoncontact);
			}
		});
		buttongreek
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\Greece-icon.png")));
		buttongreek.setFont(new Font("Tahoma", Font.PLAIN, 8));
		buttongreek.setBounds(0, 0, 30, 20);
		contentPane.add(buttongreek);

		JButton buttonenglish = new JButton("");
		buttonenglish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				lan.actionen

				(label1, label2, label3, label4, labelhelp, labeltoday,
						labeltomorrow, labeltodayhospital,
						labeltomorrowhospital, labelmapmessage,
						labelweathermessage,

						buttonhome1, buttonhome2, buttonhome3, buttonhome4,
						buttonhome5,

						buttonhome6, buttonhome7, buttonhome8, buttonhome9,
						buttonhome10, buttonmuseum, buttonbar,

						buttonbeach, buttonhotel, buttonhospital,
						buttonpharmacy, buttonsos, buttoncontact);
			}
		});
		buttonenglish
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\United Kingdom(Great Britain).png")));
		buttonenglish.setBounds(31, 0, 30, 20);
		contentPane.add(buttonenglish);

		JButton buttongerman = new JButton("");
		buttongerman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lan.actiongerman

				(label1, label2, label3, label4, labelhelp, labeltoday,
						labeltomorrow, labeltodayhospital,
						labeltomorrowhospital, labelmapmessage,
						labelweathermessage,

						buttonhome1, buttonhome2, buttonhome3, buttonhome4,
						buttonhome5,

						buttonhome6, buttonhome7, buttonhome8, buttonhome9,
						buttonhome10, buttonmuseum, buttonbar,

						buttonbeach, buttonhotel, buttonhospital,
						buttonpharmacy, buttonsos, buttoncontact);
			
			}
		});
		buttongerman
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\Germany_Flag-icon.png")));
		buttongerman.setBounds(31, 21, 30, 20);
		contentPane.add(buttongerman);

		JButton buttonitalian = new JButton("");
		buttonitalian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lan.actionitalian

				(label1, label2, label3, label4, labelhelp, labeltoday,
						labeltomorrow, labeltodayhospital,
						labeltomorrowhospital, labelmapmessage,
						labelweathermessage,

						buttonhome1, buttonhome2, buttonhome3, buttonhome4,
						buttonhome5,

						buttonhome6, buttonhome7, buttonhome8, buttonhome9,
						buttonhome10, buttonmuseum, buttonbar,

						buttonbeach, buttonhotel, buttonhospital,
						buttonpharmacy, buttonsos, buttoncontact);
			}
		});
		buttonitalian
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\italy_icon.gif")));
		buttonitalian.setBounds(0, 21, 30, 20);
		contentPane.add(buttonitalian);

		buttonweather = new JButton("");
		buttonweather.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i == 1) {
					panelweather.setVisible(true);
					labelgreece.setVisible(false);
					buttonguide.setEnabled(false);
					buttonmap.setEnabled(false);
					buttoninfo.setEnabled(false);
					buttonlogin.setEnabled(false);
					buttonlogout.setEnabled(false);
					String usertext = "http://www.meteo.gr/meteoplus/cf.cfm?city_id=12";
					try {
						desktop1.getDesktop().browse(
								java.net.URI.create(usertext));
					} catch (Exception e1) {
						
					}
				}
				i = 2;
			}
		});
		buttonweather.setForeground(Color.WHITE);
		buttonweather
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\1d3ea0d0-eb02-4543-9b1c-a62369ddea75 (1).png")));
		buttonweather.setBounds(20, 320, 105, 110);
		contentPane.add(buttonweather);

		label3 = new JLabel("\u039A\u03B1\u03B9\u03C1\u03CC\u03C2");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(20, 441, 107, 20);
		contentPane.add(label3);

		buttonguide = new JButton("");
		buttonguide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i == 1) {
					labelgreece.setVisible(false);
					panelguide.setVisible(true);
					buttonmap.setEnabled(false);
					buttonweather.setEnabled(false);
					buttoninfo.setEnabled(false);
					buttonlogin.setEnabled(false);
					buttonlogout.setEnabled(false);
					i = 2;
				}
				i = 2;
			}
		});
		buttonguide.setForeground(Color.WHITE);
		buttonguide
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\menu-icon-attractions (1).png")));
		buttonguide.setBounds(20, 97, 105, 110);
		contentPane.add(buttonguide);

		label1 = new JLabel(
				"\u039F\u03B4\u03B7\u03B3\u03CC\u03C2 \u03A0\u03CC\u03BB\u03B7\u03C2");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label1.setBounds(20, 218, 107, 20);
		contentPane.add(label1);

		buttonmap = new JButton("");
		buttonmap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i == 1) {
					panelmap.setVisible(true);
					labelgreece.setVisible(false);
					buttonguide.setEnabled(false);
					buttonweather.setEnabled(false);
					buttoninfo.setEnabled(false);
					buttonlogin.setEnabled(false);
					buttonlogout.setEnabled(false);
					String usertext = "https://www.google.gr/maps/dir/%CE%A3%CE%A4.%CE%A3%CE%A5%CE%9D%CE%A4%CE%91%CE%93%CE%9C%CE%91%CE%A4%CE%9F%CE%A3//@37.9750102,23.7359221,16z/data=!4m8!4m7!1m5!1m1!1s0x14a1bd3ef06bb033:0xb5c7c124f470a07c!2m2!1d23.735684!2d37.975085!1m0";
					try {
						desktop1.getDesktop().browse(
								java.net.URI.create(usertext));
					} catch (Exception e1) {
						
					}
				}
				i = 2;
			}
		});
		buttonmap
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\Apps-Google-Maps-icon.png")));
		buttonmap.setForeground(Color.WHITE);
		buttonmap.setBounds(669, 97, 105, 110);
		contentPane.add(buttonmap);

		label2 = new JLabel(
				"\u03A7\u03AC\u03C1\u03C4\u03B7\u03C2 \u03A0\u03CC\u03BB\u03B7\u03C2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2.setBounds(644, 218, 150, 20);
		contentPane.add(label2);

		buttoninfo = new JButton("");
		buttoninfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i == 1) {
					labelgreece.setVisible(false);
					panelinfo.setVisible(true);
					buttonmap.setEnabled(false);
					buttonweather.setEnabled(false);
					buttonguide.setEnabled(false);
					buttonlogin.setEnabled(false);
					buttonlogout.setEnabled(false);
					i = 2;
				}
			}
		});
		buttoninfo
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\contact-us-icon-orange.png")));
		buttoninfo.setForeground(Color.WHITE);
		buttoninfo.setBounds(669, 320, 105, 110);
		contentPane.add(buttoninfo);

		label4 = new JLabel(
				"\u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label4.setBounds(625, 441, 187, 20);
		contentPane.add(label4);

		labelhelp = new JLabel("\u0392\u039F\u0397\u0398\u0395\u0399\u0391");
		labelhelp.setHorizontalAlignment(SwingConstants.RIGHT);
		labelhelp.setForeground(Color.RED);
		labelhelp.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelhelp.setBounds(652, 507, 89, 35);
		contentPane.add(labelhelp);

		labelgreece = new JLabel("");
		labelgreece
				.setIcon(new ImageIcon(getClass().getResource(
						"\\myimages\\Web-ExploreGreece-512.png")));
		labelgreece.setHorizontalAlignment(SwingConstants.LEFT);
		labelgreece.setBounds(147, 21, 512, 521);
		contentPane.add(labelgreece);

		panelmap = new JPanel();
		panelmap.setBackground(new Color(0, 0, 51));
		panelmap.setBounds(141, 0, 523, 571);
		contentPane.add(panelmap);
		panelmap.setLayout(null);
		panelmap.setVisible(false);

		buttonhome3 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=basic.arx3(  panelmap, labelgreece, buttonweather,
						 buttonguide, buttoninfo, buttonlogin, buttonlogout, i);

			}
		});
		buttonhome3.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome3.setForeground(Color.WHITE);
		buttonhome3.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome3.setBackground(new Color(255, 102, 0));
		buttonhome3.setBounds(10, 11, 217, 45);
		panelmap.add(buttonhome3);

		labelmap = new JLabel("");
		labelmap.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\google-maps.jpg")));
		labelmap.setBounds(32, 97, 481, 268);
		panelmap.add(labelmap);

		labelmapmessage = new JLabel("LOADING...");
		labelmapmessage.setFont(new Font("Tahoma", Font.PLAIN, 44));
		labelmapmessage.setHorizontalAlignment(SwingConstants.CENTER);
		labelmapmessage.setForeground(Color.WHITE);
		labelmapmessage.setBounds(32, 376, 481, 54);
		panelmap.add(labelmapmessage);

		panelweather = new JPanel();
		panelweather.setBounds(141, 0, 523, 571);
		contentPane.add(panelweather);
		panelweather.setBackground(new Color(0, 0, 51));
		panelweather.setVisible(false);
		panelweather.setLayout(null);

		buttonhome2 = new JButton(
				"\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		buttonhome2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BasicButtons home2=new BasicButtons();
				i=home2.arx2( panelweather, labelgreece, buttonmap, buttonguide,
						 buttoninfo, buttonlogin, buttonlogout, i);
			}
		});
		buttonhome2.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\Home.png")));
		buttonhome2.setBounds(10, 11, 217, 45);
		buttonhome2.setForeground(Color.WHITE);
		buttonhome2.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonhome2.setBackground(new Color(255, 102, 0));
		panelweather.add(buttonhome2);

		labelweather = new JLabel("");
		labelweather.setIcon(new ImageIcon(getClass().getResource(
				"myimages\\meteo.jpg")));
		labelweather.setBounds(10, 97, 503, 268);
		panelweather.add(labelweather);

		labelweathermessage = new JLabel("LOADING...");
		labelweathermessage.setFont(new Font("Tahoma", Font.PLAIN, 44));
		labelweathermessage.setForeground(Color.WHITE);
		labelweathermessage.setHorizontalAlignment(SwingConstants.CENTER);
		labelweathermessage.setBounds(10, 376, 503, 52);
		panelweather.add(labelweathermessage);

		JLabel labelclock = new JLabel("");
		labelclock
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\mitimezonesicon.png")));
		labelclock.setBounds(670, 5, 32, 32);
		contentPane.add(labelclock);

		buttonlogin = new JButton("Log In as Admin");
		buttonlogin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		buttonlogin.setHorizontalAlignment(SwingConstants.LEFT);
		buttonlogin
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\128632-simple-red-square-icon-business-key11-sc48.png")));
		buttonlogin.setToolTipText("");
		buttonlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adbu.adlogin( panellogin, buttonguide, buttoninfo, buttonmap, buttonweather);
			}
		});
		buttonlogin.setForeground(Color.WHITE);
		buttonlogin.setBackground(new Color(0, 0, 51));
		buttonlogin.setBounds(0, 548, 141, 23);
		contentPane.add(buttonlogin);

		buttonlogout = new JButton("Log Out");
		buttonlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=adbu.adlogout( buttonlogin, buttonlogout, tablecontact, buttonok2,
						 buttonadd1, buttonaf1, tablesos, buttonok3, buttonadd2, buttonaf2, buttonok4,
						 buttonadd3, buttonaf3, buttonadd4, buttonaf4, buttonok5, tabletoday, tabletomorrow
						, buttonadd5, buttonaf5, buttonadd6, buttonaf6, tabletodayhospital, tabletomorrowhospital, buttonok1,
						 buttonconfirm1, buttonadd7, buttonaf7, tablemuseum, tablebeach,
						 choicemuseum, flag);}
		});
		buttonlogout
				.setIcon(new ImageIcon(getClass().getResource(
						"myimages\\128632-simple-red-square-icon-business-key11-sc48.png")));
		buttonlogout.setToolTipText("");
		buttonlogout.setVisible(false);
		buttonlogout.setHorizontalAlignment(SwingConstants.LEFT);
		buttonlogout.setForeground(Color.WHITE);
		buttonlogout.setFont(new Font("Tahoma", Font.PLAIN, 10));
		buttonlogout.setBackground(new Color(0, 0, 51));
		buttonlogout.setBounds(0, 548, 141, 23);
		contentPane.add(buttonlogout);

	}
	
}
