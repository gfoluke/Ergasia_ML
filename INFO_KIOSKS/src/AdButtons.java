import java.awt.*;

import javax.swing.*;
public class AdButtons {
	

	public void adlogin(JPanel panellogin,JButton buttonguide,JButton buttoninfo,JButton buttonmap,JButton buttonweather){
		panellogin.setVisible(true);
		buttonguide.setEnabled(false);
		buttoninfo.setEnabled(false);
		buttonmap.setEnabled(false);
		buttonweather.setEnabled(false);
	}
	
	public int adlogout(
			JButton buttonlogin,JButton buttonlogout,JTable tablecontact,JButton buttonok2,
			JButton buttonadd1,JButton buttonaf1,JTable tablesos,JButton buttonok3,JButton buttonadd2,JButton buttonaf2,JButton buttonok4,
			JButton buttonadd3,JButton buttonaf3,JButton buttonadd4,JButton buttonaf4,JButton buttonok5,JTable tabletoday,JTable tabletomorrow
			,JButton buttonadd5,JButton buttonaf5,JButton buttonadd6,JButton buttonaf6,JTable tabletodayhospital,JTable tabletomorrowhospital,JButton buttonok1,
			JButton buttonconfirm1,JButton buttonadd7,JButton buttonaf7,JTable tablemuseum,JTable tablebeach,
			Choice choicemuseum,int flag){
		buttonlogin.setVisible(true);
		buttonlogout.setVisible(false);
		tablecontact.setEnabled(false);
		buttonadd1.setVisible(false);
		buttonaf1.setVisible(false);
		buttonok2.setVisible(false);
		tablesos.setEnabled(false);
		buttonadd2.setVisible(false);
		buttonaf2.setVisible(false);
		buttonok3.setVisible(false);
		buttonok4.setVisible(false);
		buttonadd3.setVisible(false);
		buttonaf3.setVisible(false);
		buttonadd4.setVisible(false);
		buttonaf4.setVisible(false);
		tabletoday.setEnabled(false);
		tabletomorrow.setEnabled(false);
		buttonok5.setVisible(false);
		buttonadd4.setVisible(false);
		buttonaf4.setVisible(false);
		buttonadd5.setVisible(false);
		buttonaf5.setVisible(false);
		buttonadd6.setVisible(false);
		buttonaf6.setVisible(false);
		tabletodayhospital.setEnabled(false);
		tabletomorrowhospital.setEnabled(false);
		buttonok1.setEnabled(true);
		buttonconfirm1.setVisible(false);
		tablemuseum.setVisible(false);
		choicemuseum.setEnabled(true);
		buttonadd7.setVisible(false);
		buttonaf7.setVisible(false);
		tablebeach.setVisible(false);
		return flag = 0;
	}
	
	public void add1(JTable tablesos){
		tablesos.setBounds(tablesos.getX(), tablesos.getY(),
				tablesos.getWidth(), tablesos.getHeight() + 16);
	}
	

	public void add2(JTable tabletomorrow){
		tabletomorrow.setBounds(tabletomorrow.getX(),
				tabletomorrow.getY(), tabletomorrow.getWidth(),
				tabletomorrow.getHeight() + 16);
	}
	
	public void add3(JTable tabletoday){
		tabletoday.setBounds(tabletoday.getX(), tabletoday.getY(),
				tabletoday.getWidth(), tabletoday.getHeight() + 16);
	}
	
	public void add4(JTable tabletomorrowhospital){
		tabletomorrowhospital.setBounds(tabletomorrowhospital.getX(),
				tabletomorrowhospital.getY(),
				tabletomorrowhospital.getWidth(),
				tabletomorrowhospital.getHeight() + 16);
	}
	public void add5(JTable tabletodayhospital){
		tabletodayhospital.setBounds(tabletodayhospital.getX(),
				tabletodayhospital.getY(),
				tabletodayhospital.getWidth(),
				tabletodayhospital.getHeight() + 16);
	}
	public void add6(JTable tablecontact){
		tablecontact.setBounds(tablecontact.getX(),
				tablecontact.getY(), tablecontact.getWidth(),
				tablecontact.getHeight() + 16);
	}
	public void add7(JTable tablemuseum,JTable tablebeach,int shm){
		if (shm == 1) {
			tablemuseum.setBounds(tablemuseum.getX(),
					tablemuseum.getY(), tablemuseum.getWidth(),
					tablemuseum.getHeight() + 16);
		} else if (shm == 2) {
			tablebeach.setBounds(tablebeach.getX(), tablebeach.getY(),
					tablebeach.getWidth(), tablebeach.getHeight() + 16);
		}
	}
	
	
	//------------------------------------------------------------------------------
	
	public void af1(JTable tablesos){
		tablesos.setBounds(tablesos.getX(), tablesos.getY(),
				tablesos.getWidth(), tablesos.getHeight() - 16);
	}
	

	public void af2(JTable tabletomorrow){
		tabletomorrow.setBounds(tabletomorrow.getX(),
				tabletomorrow.getY(), tabletomorrow.getWidth(),
				tabletomorrow.getHeight() - 16);
	}
	
	public void af3(JTable tabletoday){
		tabletoday.setBounds(tabletoday.getX(), tabletoday.getY(),
				tabletoday.getWidth(), tabletoday.getHeight() - 16);
	}
	
	public void af4(JTable tabletomorrowhospital){
		tabletomorrowhospital.setBounds(tabletomorrowhospital.getX(),
				tabletomorrowhospital.getY(),
				tabletomorrowhospital.getWidth(),
				tabletomorrowhospital.getHeight() - 16);
	}
	public void af5(JTable tabletodayhospital){
		tabletodayhospital.setBounds(tabletodayhospital.getX(),
				tabletodayhospital.getY(),
				tabletodayhospital.getWidth(),
				tabletodayhospital.getHeight() - 16);
	}
	public void af6(JTable tablecontact){
		tablecontact.setBounds(tablecontact.getX(),
				tablecontact.getY(), tablecontact.getWidth(),
				tablecontact.getHeight() - 16);
	}
	public void af7(JTable tablemuseum,JTable tablebeach,int shm){
		if (shm == 1) {
			tablemuseum.setBounds(tablemuseum.getX(),
					tablemuseum.getY(), tablemuseum.getWidth(),
					tablemuseum.getHeight() - 16);
		} else if (shm == 2) {
			tablebeach.setBounds(tablebeach.getX(), tablebeach.getY(),
					tablebeach.getWidth(), tablebeach.getHeight() - 16);
		}
	}
}


