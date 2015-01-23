import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class AdminSql {
	


	public void adaction(Choice choicemuseum,java.sql.Statement stmt,Connection conn,ResultSet rs){
		try {
			stmt = conn.createStatement();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from museums");
			String usertext = null;
			while (rs.next()) {
				String name4 = rs.getString("name");
				if (choicemuseum.getSelectedItem().equals(name4)) {
					usertext = rs.getString("linkgooglemaps");

					try {
						java.awt.Desktop.getDesktop().browse(
								java.net.URI.create(usertext));
					} catch (Exception e1) {
						System.out.println("error!!!");
					}
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from beach");
			String usertext3 = null;
			while (rs.next()) {
				String name6 = rs.getString("name");
				if (choicemuseum.getSelectedItem().equals(name6)) {
					usertext3 = rs.getString("link");

					try {
						java.awt.Desktop.getDesktop().browse(
								java.net.URI.create(usertext3));
					} catch (Exception e1) {
						System.out.println("error!!!");
					}
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	public void adaction2(JTable tablemuseum,JTable tablebeach,java.sql.Statement stmt,Connection conn,ResultSet rs){
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM museums");
			int sa = 0;
			String path2;
			String name3;
			String description2;
			String address2;
			String meters2;
			String times2;
			String epikoinwnia2;
			String link2;
			while (sa < tablemuseum.getRowCount()) {
				path2 = (String) tablemuseum.getModel().getValueAt(sa,
						0);
				name3 = (String) tablemuseum.getModel().getValueAt(sa,
						1);
				description2 = (String) tablemuseum.getModel()
						.getValueAt(sa, 2);
				address2 = (String) tablemuseum.getModel().getValueAt(
						sa, 3);
				meters2 = (String) tablemuseum.getModel().getValueAt(
						sa, 4);
				times2 = (String) tablemuseum.getModel().getValueAt(sa,
						5);
				epikoinwnia2 = (String) tablemuseum.getModel()
						.getValueAt(sa, 6);
				link2 = (String) tablemuseum.getModel().getValueAt(sa,
						7);
				stmt.executeUpdate("INSERT INTO museums VALUES ('"
						+ path2 + "','" + name3 + "','" + description2
						+ "','" + address2 + "','" + meters2 + "','"
						+ times2 + "','" + epikoinwnia2 + "','" + link2
						+ "')");
				sa++;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM museums WHERE name IS NULL");
			stmt.executeUpdate("DELETE FROM museums WHERE name=''");
			stmt.executeUpdate("DELETE FROM museums WHERE name=' '");
			stmt.executeUpdate("DELETE FROM museums WHERE name='null'");
			stmt.executeUpdate("DELETE FROM museums WHERE address IS NULL");
			stmt.executeUpdate("DELETE FROM museums WHERE address=''");
			stmt.executeUpdate("DELETE FROM museums WHERE address=' '");
			stmt.executeUpdate("DELETE FROM museums WHERE address='null'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM beach");
			int ath = 0;
			String pathbeach2;
			String namebeach2;
			String addressbeach2;
			String distancebeach2;
			String linkbeach2;
			while (ath < tablebeach.getRowCount()) {
				pathbeach2 = (String) tablebeach.getModel().getValueAt(
						ath, 0);
				namebeach2 = (String) tablebeach.getModel().getValueAt(
						ath, 1);
				addressbeach2 = (String) tablebeach.getModel()
						.getValueAt(ath, 2);
				distancebeach2 = (String) tablebeach.getModel()
						.getValueAt(ath, 3);
				linkbeach2 = (String) tablebeach.getModel().getValueAt(
						ath, 4);
				stmt.executeUpdate("INSERT INTO beach VALUES ('"
						+ pathbeach2 + "','" + namebeach2 + "','"
						+ addressbeach2 + "','" + distancebeach2
						+ "','" + linkbeach2 + "')");
				ath++;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM beach WHERE name IS NULL");
			stmt.executeUpdate("DELETE FROM beach WHERE name=''");
			stmt.executeUpdate("DELETE FROM beach WHERE name=' '");
			stmt.executeUpdate("DELETE FROM beach WHERE name='null'");
			stmt.executeUpdate("DELETE FROM beach WHERE address IS NULL");
			stmt.executeUpdate("DELETE FROM beach WHERE address=''");
			stmt.executeUpdate("DELETE FROM beach WHERE address=' '");
			stmt.executeUpdate("DELETE FROM beach WHERE address='null'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public void adaction3(JTable tablecontact,java.sql.Statement stmt,Connection conn,ResultSet rs){
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM contact");
			int s = 0;
			String title2;
			String stoixeia2;
			while (s < tablecontact.getRowCount()) {
				title2 = (String) tablecontact.getModel().getValueAt(s,
						0);
				stoixeia2 = (String) tablecontact.getModel()
						.getValueAt(s, 1);
				stmt.executeUpdate("INSERT INTO contact VALUES ('"
						+ title2 + "','" + stoixeia2 + "')");
				s++;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM contact WHERE info IS NULL");
			stmt.executeUpdate("DELETE FROM contact WHERE info=''");
			stmt.executeUpdate("DELETE FROM contact WHERE info=' '");
			stmt.executeUpdate("DELETE FROM contact WHERE info='null'");
			stmt.executeUpdate("DELETE FROM contact WHERE title IS NULL");
			stmt.executeUpdate("DELETE FROM contact WHERE title=''");
			stmt.executeUpdate("DELETE FROM contact WHERE title=' '");
			stmt.executeUpdate("DELETE FROM contact WHERE title='null'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public int adaction4(JPanel panelguide,JTable tablemuseum,JPanel panelmuseum,JTable tablebeach,int shm,Choice choicemuseum,int flag
			,java.sql.Statement stmt,Connection conn,ResultSet rs){
		panelguide.setVisible(false);
		panelmuseum.setVisible(true);
		if (flag == 1) {
			tablemuseum.setVisible(true);
			tablebeach.setVisible(false);
		}
		int pa = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from museums");
			String namemuseum1;
			while (rs.next()) {
				namemuseum1 = rs.getString("name");
				choicemuseum.add(namemuseum1);
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from museums");
			String pathmuseum;
			String namemuseum2;
			String descriptionmuseum;
			String addressmuseum;
			String metersmuseum;
			String timesmuseum;
			String epikoinwniamuseum;
			String linkmuseum;
			while (rs.next()) {
				pathmuseum = rs.getString("pathphoto");
				namemuseum2 = rs.getString("name");
				descriptionmuseum = rs.getString("description");
				addressmuseum = rs.getString("address");
				metersmuseum = rs.getString("meters");
				timesmuseum = rs.getString("times");
				epikoinwniamuseum = rs.getString("epikoinwnia");
				linkmuseum = rs.getString("linkgooglemaps");
				tablemuseum.setValueAt(pathmuseum, pa, 0);
				tablemuseum.setValueAt(namemuseum2, pa, 1);
				tablemuseum.setValueAt(descriptionmuseum, pa, 2);
				tablemuseum.setValueAt(addressmuseum, pa, 3);
				tablemuseum.setValueAt(metersmuseum, pa, 4);
				tablemuseum.setValueAt(timesmuseum, pa, 5);
				tablemuseum.setValueAt(epikoinwniamuseum, pa, 6);
				tablemuseum.setValueAt(linkmuseum, pa, 7);
				pa++;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		while (pa < tablemuseum.getRowCount()) {
			tablemuseum.setValueAt("", pa, 0);
			tablemuseum.setValueAt("", pa, 1);
			tablemuseum.setValueAt("", pa, 2);
			tablemuseum.setValueAt("", pa, 3);
			tablemuseum.setValueAt("", pa, 4);
			tablemuseum.setValueAt("", pa, 5);
			tablemuseum.setValueAt("", pa, 6);
			tablemuseum.setValueAt("", pa, 7);
			pa++;
		}
		return shm = 1;
	}
	
	
	
	public void adaction5(JTable tabletodayhospital,JTable tabletomorrowhospital,java.sql.Statement stmt,Connection conn,ResultSet rs ){
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM todayhospital");
			int h = 0;
			String name5;
			String address5;
			String thl5;
			String time5;
			while (h <= tabletodayhospital.getRowCount()) {
				name5 = (String) tabletodayhospital.getModel()
						.getValueAt(h, 0);
				address5 = (String) tabletodayhospital.getModel()
						.getValueAt(h, 1);
				thl5 = (String) tabletodayhospital.getModel()
						.getValueAt(h, 2);
				time5 = (String) tabletodayhospital.getModel()
						.getValueAt(h, 3);
				if (name5 != " " || address5 != " " || thl5 != " "
						|| time5 != " ") {
					stmt.executeUpdate("INSERT INTO todayhospital VALUES ('"
							+ name5
							+ "','"
							+ address5
							+ "','"
							+ thl5
							+ "','" + time5 + "')");
					h++;
				}
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM tomorrowhospital");
			int g = 0;
			String name6;
			String address6;
			String thl6;
			String time6;
			while (g <= tabletomorrowhospital.getRowCount()) {
				name6 = (String) tabletomorrowhospital.getModel()
						.getValueAt(g, 0);
				address6 = (String) tabletomorrowhospital.getModel()
						.getValueAt(g, 1);
				thl6 = (String) tabletomorrowhospital.getModel()
						.getValueAt(g, 2);
				time6 = (String) tabletomorrowhospital.getModel()
						.getValueAt(g, 3);
				if (name6 != " " || address6 != " " || thl6 != " "
						|| time6 != " ") {
					stmt.executeUpdate("INSERT INTO tomorrowhospital VALUES ('"
							+ name6
							+ "','"
							+ address6
							+ "','"
							+ thl6
							+ "','" + time6 + "')");
					g++;
				}
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM todayhospital WHERE address IS NULL");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE address=''");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE address=' '");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE address='null'");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE address IS NULL");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE address=''");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE address=' '");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE address='null'");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE name IS NULL");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE name=''");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE name=' '");
			stmt.executeUpdate("DELETE FROM todayhospital WHERE name='null'");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE name IS NULL");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE name=''");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE name=' '");
			stmt.executeUpdate("DELETE FROM tomorrowhospital WHERE name='null'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public void adaction6(JTable tabletoday,JTable tabletomorrow,java.sql.Statement stmt,Connection conn,ResultSet rs){
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM today");
			int b = 0;
			String address3;
			String thl3;
			String time3;
			while (b <= tabletoday.getRowCount()) {
				address3 = (String) tabletoday.getModel().getValueAt(b,
						0);
				thl3 = (String) tabletoday.getModel().getValueAt(b, 1);
				time3 = (String) tabletoday.getModel().getValueAt(b, 2);
				if (address3 != " " || thl3 != " " || time3 != " ") {
					stmt.executeUpdate("INSERT INTO today VALUES ('"
							+ address3 + "','" + thl3 + "','" + time3
							+ "')");
					b++;
				}
			}
			

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM tomorrow");
			int c = 0;
			String address4;
			String thl4;
			String time4;
			while (c <= tabletomorrow.getRowCount()) {
				address4 = (String) tabletomorrow.getModel()
						.getValueAt(c, 0);
				thl4 = (String) tabletomorrow.getModel().getValueAt(c,
						1);
				time4 = (String) tabletomorrow.getModel().getValueAt(c,
						2);
				if (address4 != " " || thl4 != " " || time4 != " ") {
					stmt.executeUpdate("INSERT INTO tomorrow VALUES ('"
							+ address4 + "','" + thl4 + "','" + time4
							+ "')");
					c++;
				}
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM today WHERE address IS NULL");
			stmt.executeUpdate("DELETE FROM today WHERE address=''");
			stmt.executeUpdate("DELETE FROM today WHERE address=' '");
			stmt.executeUpdate("DELETE FROM today WHERE address='null'");
			stmt.executeUpdate("DELETE FROM tomorrow WHERE address IS NULL");
			stmt.executeUpdate("DELETE FROM tomorrow WHERE address=''");
			stmt.executeUpdate("DELETE FROM tomorrow WHERE address=' '");
			stmt.executeUpdate("DELETE FROM tomorrow WHERE address='null'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
	
	
	public void adaction7(JTable tablesos,java.sql.Statement stmt,Connection conn,ResultSet rs){
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM sos");
			int u = 0;
			String title3;
			String stoixeia3;
			while (u <= tablesos.getRowCount()) {
				title3 = (String) tablesos.getModel().getValueAt(u, 0);
				stoixeia3 = (String) tablesos.getModel().getValueAt(u,
						1);
				stmt.executeUpdate("INSERT INTO sos VALUES ('" + title3
						+ "','" + stoixeia3 + "')");
				u++;
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt.executeUpdate("DELETE FROM sos WHERE name IS NULL");
			stmt.executeUpdate("DELETE FROM sos WHERE name=''");
			stmt.executeUpdate("DELETE FROM sos WHERE name=' '");
			stmt.executeUpdate("DELETE FROM sos WHERE name='null'");
			stmt.executeUpdate("DELETE FROM sos WHERE thl IS NULL");
			stmt.executeUpdate("DELETE FROM sos WHERE thl=''");
			stmt.executeUpdate("DELETE FROM sos WHERE thl=' '");
			stmt.executeUpdate("DELETE FROM sos WHERE thl='null'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	public int adaction8(JTextField textfieldusername,JLabel labelgreece,JPanel panellogin,JButton buttonmap,JButton buttonguide,JButton buttoninfo,
			JButton buttonweather,JButton buttonlogin,JButton buttonlogout,JTextField textfieldpassword,JTable tablecontact,JButton buttonok2,
			JButton buttonadd1,JButton buttonaf1,JTable tablesos,JButton buttonok3,JButton buttonadd2,JButton buttonaf2,JButton buttonok4,
			JButton buttonadd3,JButton buttonaf3,JButton buttonadd4,JButton buttonaf4,JButton buttonok5,JTable tabletoday,JTable tabletomorrow
			,JButton buttonadd5,JButton buttonaf5,JButton buttonadd6,JButton buttonaf6,JTable tabletodayhospital,JTable tabletomorrowhospital,JButton buttonok1,
			JButton buttonconfirm1,JButton buttondromologisi,JButton buttonadd7,JButton buttonaf7,JLabel labelphoto,JTable tablemuseum,JTable tablebeach,
			JEditorPane editormuseum,Choice choicemuseum,int flag,String newline,java.sql.Statement stmt,Connection conn,ResultSet rs){
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from login");
			String on;
			String password;
			while (rs.next()) {
				on = rs.getString("user");
				password = rs.getString("password");
				if (textfieldusername.getText().equals(on)
						&& textfieldpassword.getText().equals(password)) {
					labelgreece.setVisible(true);
					panellogin.setVisible(false);
					buttonmap.setEnabled(true);
					buttonguide.setEnabled(true);
					buttoninfo.setEnabled(true);
					buttonweather.setEnabled(true);
					buttonlogin.setVisible(false);
					buttonlogout.setVisible(true);
					textfieldusername.setText("");
					textfieldpassword.setText("");
					tablecontact.setEnabled(true);
					buttonok2.setVisible(true);
					buttonadd1.setVisible(true);
					buttonaf1.setVisible(true);
					tablesos.setEnabled(true);
					buttonok3.setVisible(true);
					buttonadd2.setVisible(true);
					buttonaf2.setVisible(true);
					buttonok4.setVisible(true);
					buttonadd3.setVisible(true);
					buttonaf3.setVisible(true);
					buttonadd4.setVisible(true);
					buttonaf4.setVisible(true);
					tabletoday.setEnabled(true);
					tabletomorrow.setEnabled(true);
					buttonok5.setVisible(true);
					buttonadd5.setVisible(true);
					buttonaf5.setVisible(true);
					buttonadd6.setVisible(true);
					buttonaf6.setVisible(true);
					tabletodayhospital.setEnabled(true);
					tabletomorrowhospital.setEnabled(true);
					buttonok1.setEnabled(false);
					buttonconfirm1.setVisible(true);
					labelphoto.setVisible(false);
					editormuseum.setVisible(false);
					buttondromologisi.setVisible(false);
					tablemuseum.setVisible(true);
					choicemuseum.setEnabled(false);
					buttonadd7.setVisible(true);
					buttonaf7.setVisible(true);
					tablebeach.setVisible(true);
					flag = 1;
				} else {
					JOptionPane.showMessageDialog(null,
							"Wrong username or password..." + newline
									+ "Try Again", "Error",
							JOptionPane.ERROR_MESSAGE);
					textfieldusername.setText("");
					textfieldpassword.setText("");
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return flag;
	}

}

