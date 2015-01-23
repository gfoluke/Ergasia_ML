import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class UserSql {

	
	

	public void action(Connection conn,java.sql.Statement stmt,ResultSet rs,JLabel labelphoto,JButton buttondromologisi
			,JEditorPane editormuseum,Choice choicemuseum,String newline) {
		labelphoto.setVisible(true);
		buttondromologisi.setEnabled(true);
		buttondromologisi.setVisible(true);
		editormuseum.setVisible(true);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from museums");
			String usertext1 = null;
			String descr;
			while (rs.next()) {
				String name4 = rs.getString("name");
				if (choicemuseum.getSelectedItem().equals(name4)) {
					usertext1 = rs.getString("pathphoto");
					labelphoto.setIcon(new ImageIcon(getClass().getResource("myimages\\"+usertext1)));
					try {
						//labelphoto.setIcon(new ImageIcon(getClass().getResource("myimages\\"+usertext1)));
						descr = rs.getString("description");
						editormuseum.setText(descr + newline + newline
								+ "address: " + rs.getString("address")
								+ newline + "distance: "
								+ rs.getString("meters") + "m" + newline
								+ "ticket: " + rs.getString("times") + newline
								+ "number: " + rs.getString("epikoinwnia"));
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
			String usertext2 = null;
			while (rs.next()) {
				String name5 = rs.getString("name");
				if (choicemuseum.getSelectedItem().equals(name5)) {
					usertext2 = rs.getString("pathphoto");
					labelphoto.setIcon(new ImageIcon(getClass().getResource("myimages\\"+usertext2)));
					try {
						//labelphoto.setIcon(new ImageIcon(getClass().getResource("myimages\\"+usertext2)));
						editormuseum
								.setText("address: " + rs.getString("address")
										+ newline + "distance: "
										+ rs.getString("distance") + "m");
					} catch (Exception e1) {
						System.out.println("error!!!");
					}
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	public int action1(JPanel panelguide, JPanel panelmuseum,
			JTable tablemuseum, JTable tablebeach, int flag, int shm,  Connection conn,java.sql.Statement stmt,ResultSet rs,Choice choicemuseum) {
		panelguide.setVisible(false);
		panelmuseum.setVisible(true);
		if (flag == 1) {
			tablemuseum.setVisible(false);
			tablebeach.setVisible(true);
		}
		int metr = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from beach");
			String na;
			while (rs.next()) {
				na = rs.getString("name");
				choicemuseum.add(na);
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from beach");
			String pathbeach;
			String namebeach;
			String addressbeach;
			String distancebeach;
			String linkbeach;
			while (rs.next()) {
				pathbeach = rs.getString("pathphoto");
				namebeach = rs.getString("name");
				addressbeach = rs.getString("address");
				distancebeach = rs.getString("distance");
				linkbeach = rs.getString("link");
				tablebeach.setValueAt(pathbeach, metr, 0);
				tablebeach.setValueAt(namebeach, metr, 1);
				tablebeach.setValueAt(addressbeach, metr, 2);
				tablebeach.setValueAt(distancebeach, metr, 3);
				tablebeach.setValueAt(linkbeach, metr, 4);
				metr++;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		while (metr < tablebeach.getRowCount()) {
			tablebeach.setValueAt("", metr, 0);
			tablebeach.setValueAt("", metr, 1);
			tablebeach.setValueAt("", metr, 2);
			tablebeach.setValueAt("", metr, 3);
			tablebeach.setValueAt("", metr, 4);
			metr++;
		}
		return shm = 2;
	}
	
	public void action2(JPanel panelhospital,JPanel panelinfo,JTable tabletodayhospital,JTable tabletomorrowhospital,int r
			,  Connection conn,java.sql.Statement stmt,ResultSet rs){
		panelhospital.setVisible(true);
		panelinfo.setVisible(false);
		try{
			int w=0;
            stmt=conn.createStatement();
            rs=stmt.executeQuery("select * from todayhospital");
            String die;String sta;String wra;String title;
            while(rs.next()){
            	title=rs.getString("name");
            	die =rs.getString("address");
            	sta = rs.getString("thl");
            	wra = rs.getString("wrario");
            	tabletodayhospital.setValueAt(title, w, 0);
            	tabletodayhospital.setValueAt(die, w, 1);
            	tabletodayhospital.setValueAt(sta, w, 2);
            	tabletodayhospital.setValueAt(wra, w, 3);
            	w++;
                } 
            while(w<tabletodayhospital.getRowCount()){
            	tabletodayhospital.setValueAt("", w, 0);
            	tabletodayhospital.setValueAt("", w, 1);
            	tabletodayhospital.setValueAt("", w, 2);
            	tabletodayhospital.setValueAt("", w, 3);
            	w++;
            }
        
        }catch(Exception e2){
            e2.printStackTrace();
        }
        try{
        	stmt=conn.createStatement();
            rs=stmt.executeQuery("select * from tomorrowhospital");
            String adddd;String nummm;String timeee;String namee;
            r=0;
            while(rs.next()){
            	namee =rs.getString("name");
            	adddd =rs.getString("address");
            	nummm = rs.getString("thl");
            	timeee = rs.getString("wrario");
            	tabletomorrowhospital.setValueAt(namee, r, 0);
            	tabletomorrowhospital.setValueAt(adddd, r, 1);
            	tabletomorrowhospital.setValueAt(nummm, r, 2);
            	tabletomorrowhospital.setValueAt(timeee, r, 3);
            	r++;
                }
            while(r<tabletomorrowhospital.getRowCount()){
            	tabletomorrowhospital.setValueAt("", r, 0);
            	tabletomorrowhospital.setValueAt("", r, 1);
            	tabletomorrowhospital.setValueAt("", r, 2);
            	tabletomorrowhospital.setValueAt("", r, 3);
            	r++;
            }
        }catch(Exception e3){
        	e3.printStackTrace();
        
        }
       
	}
	
	
	public void action3(JPanel panelpharmacy,JPanel panelinfo,JTable tabletoday,JTable tabletomorrow,JTable tablesos
			,  Connection conn,java.sql.Statement stmt,ResultSet rs){
		panelpharmacy.setVisible(true);
		panelinfo.setVisible(false);
        try{
        	int p=0;
            stmt=conn.createStatement();
            rs=stmt.executeQuery("select * from today");
            String add;
            String num;
            String time;
            while(rs.next()){
            	add =rs.getString("address");
            	num = rs.getString("thl");
            	time = rs.getString("time");
            	tabletoday.setValueAt(add, p, 0);
            	tabletoday.setValueAt(num, p, 1);
            	tabletoday.setValueAt(time, p, 2);
            	p++;
                } 
            while(p<tablesos.getRowCount()){
            	tabletoday.setValueAt("", p, 0);
            	tabletoday.setValueAt("", p, 1);
            	tabletoday.setValueAt("", p, 2);
            	p++;
            }
        
        }catch(Exception e2){
            e2.printStackTrace();
        }
        try{
        	int t=0;
        	stmt=conn.createStatement();
            rs=stmt.executeQuery("select * from tomorrow");
            String addd;
            String numm;
            String timee;
            while(rs.next()){
            	addd =rs.getString("address");
            	numm = rs.getString("thl");
            	timee = rs.getString("time");
            	tabletomorrow.setValueAt(addd, t, 0);
            	tabletomorrow.setValueAt(numm, t, 1);
            	tabletomorrow.setValueAt(timee, t, 2);
            	t++;
                }
            while(t<tablesos.getRowCount()){
            	tabletomorrow.setValueAt("", t, 0);
            	tabletomorrow.setValueAt("", t, 1);
            	tabletomorrow.setValueAt("", t, 2);
            	t++;
            }
        }catch(Exception e3){
        	e3.printStackTrace();
        
        }
	}
	
	
	public void action4(JPanel panelsos,JPanel panelinfo,int k,JTable tablesos
			,  Connection conn,java.sql.Statement stmt,ResultSet rs){
		panelsos.setVisible(true);
		panelinfo.setVisible(false);
		k=0;
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery("select * from sos");
            String onoma;
            String thl;
            while(rs.next()){
            	onoma =rs.getString("name");
            	thl = rs.getString("thl");
            	tablesos.setValueAt(onoma, k, 0);
            	tablesos.setValueAt(thl, k, 1);
            	k++;
                } 
            while(k<tablesos.getRowCount()){
            	tablesos.setValueAt("", k, 0);
            	tablesos.setValueAt("", k, 1);
            	k++;
            }
        
        }catch(Exception e2){
            e2.printStackTrace();
        }

	}
	
	
	public void action5(JPanel panelcontact,JPanel panelinfo,JTable tablecontact
			,  Connection conn,java.sql.Statement stmt,ResultSet rs){
		panelcontact.setVisible(true);
		panelinfo.setVisible(false);
		try {
			int v = 0;
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from contact");
			String title;
			String stoixeia;
			while (rs.next()) {
				title = rs.getString("title");
				stoixeia = rs.getString("info");
				tablecontact.setValueAt(title, v, 0);
				tablecontact.setValueAt(stoixeia, v, 1);
				v++;
			}
			while (v < tablecontact.getRowCount()) {
				tablecontact.setValueAt("", v, 0);
				tablecontact.setValueAt("", v, 1);
				v++;
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}

}
