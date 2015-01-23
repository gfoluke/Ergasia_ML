import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class BasicButtons {
	
	public int arx1(JLabel labelgreece,JPanel panelmuseum,JButton buttonmap,JButton buttoninfo,JButton buttonweather,
			JLabel labelphoto,JButton buttondromologisi,JEditorPane editormuseum,
			Choice choicemuseum,JButton buttonlogin,JButton buttonlogout,int i){
		labelgreece.setVisible(true);
		panelmuseum.setVisible(false);
		buttonmap.setEnabled(true);
		buttoninfo.setEnabled(true);
		buttonweather.setEnabled(true);
		labelphoto.setVisible(false);
		buttondromologisi.setEnabled(false);
		editormuseum.setVisible(false);
		choicemuseum.removeAll();
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		buttondromologisi.setVisible(false);
		return i = 1;
	}

	public int arx2(JPanel panelweather,JLabel labelgreece,JButton buttonmap,JButton buttonguide,
			JButton buttoninfo,JButton buttonlogin,JButton buttonlogout,int i){
		panelweather.setVisible(false);
		labelgreece.setVisible(true);
		buttonmap.setEnabled(true);
		buttonguide.setEnabled(true);
		buttoninfo.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM safari.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM opera.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i = 1;

	}
	
	public int arx3(JPanel panelmap,JLabel labelgreece,JButton buttonweather,
			JButton buttonguide,JButton buttoninfo,JButton buttonlogin,JButton buttonlogout,int i){
		panelmap.setVisible(false);
		labelgreece.setVisible(true);
		buttonweather.setEnabled(true);
		buttonguide.setEnabled(true);
		buttoninfo.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM safari.exe");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /F /IM opera.exe");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return i = 1;
	}
	
	public int arx4(JPanel panelinfo,JButton buttonmap,JPanel panelsos,JLabel labelgreece,JButton buttonweather,
			JButton buttonguide,JButton buttonlogin,JButton buttonlogout,int i){
		labelgreece.setVisible(true);
		panelinfo.setVisible(false);
		buttonmap.setEnabled(true);
		buttonguide.setEnabled(true);
		buttonweather.setEnabled(true);
		panelsos.setVisible(false);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		return i = 1;
		
	}
	
	
	public void arx5(JPanel panellogin,JLabel labelgreece,JButton buttonguide,JButton buttonmap,JButton buttoninfo,JButton buttonweather,
			JButton buttonlogin,JButton buttonlogout){
		panellogin.setVisible(false);
		labelgreece.setVisible(true);
		buttonguide.setEnabled(true);
		buttonmap.setEnabled(true);
		buttoninfo.setEnabled(true);
		buttonweather.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
	
	}
	
	
	public int arx6(JLabel labelgreece,JButton buttonguide,JButton buttonmap,JButton buttonweather,
			JButton buttonlogin,JButton buttonlogout,JPanel panelsos,int i){
		labelgreece.setVisible(true);
		panelsos.setVisible(false);
		buttonmap.setEnabled(true);
		buttonguide.setEnabled(true);
		buttonweather.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		return i = 1;
	}
	public int arx7(JLabel labelgreece,JButton buttonguide,JButton buttonmap,JButton buttonweather,
			JButton buttonlogin,JButton buttonlogout,int i,JPanel panelpharmacy){
		labelgreece.setVisible(true);
		panelpharmacy.setVisible(false);
		buttonmap.setEnabled(true);
		buttonguide.setEnabled(true);
		buttonweather.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		return i = 1;
	}
	public int arx8(JLabel labelgreece,JButton buttonguide,JButton buttonmap,JButton buttonweather,
			JButton buttonlogin,JButton buttonlogout,int i,JPanel panelhospital){
		panelhospital.setVisible(false);
		labelgreece.setVisible(true);
		buttonmap.setEnabled(true);
		buttonguide.setEnabled(true);
		buttonweather.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		return i = 1;
	}
	
	public int arx9(JLabel labelgreece,JButton buttonmap,JButton buttonweather,
			JButton buttonlogin,JButton buttonlogout,int i,JPanel panelguide,JButton buttoninfo){
		panelguide.setVisible(false);
		labelgreece.setVisible(true);
		buttonmap.setEnabled(true);
		buttonweather.setEnabled(true);
		buttoninfo.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		return i = 1;
	}
	public int arx10(JLabel labelgreece,JButton buttonmap,JButton buttonweather,
			JButton buttonlogin,JButton buttonlogout,int i,
			JPanel panelguide,JButton buttoninfo,JPanel panelcontact,JButton buttonguide){
		labelgreece.setVisible(true);
		panelcontact.setVisible(false);
		buttonmap.setEnabled(true);
		buttonguide.setEnabled(true);
		buttonweather.setEnabled(true);
		buttonlogin.setEnabled(true);
		buttonlogout.setEnabled(true);
		return i = 1;
	}
	
	public void arx11(JPanel panelsos,JPanel panelinfo){
		panelsos.setVisible(false);
		panelinfo.setVisible(true);
	}
	public void arx12(JPanel panelinfo,JPanel panelpharmacy){
		panelinfo.setVisible(true);
		panelpharmacy.setVisible(false);
	}
	public void arx13(JPanel panelhospital,JPanel panelinfo){
		panelhospital.setVisible(false);
		panelinfo.setVisible(true);
	}
	
	public int arx14(JPanel panelcontact,JPanel panelinfo ,int l){
		panelcontact.setVisible(false);
		panelinfo.setVisible(true);
		return l = 0;
	}
	
	public void arx15(JPanel panelmuseum,JPanel panelguide,JLabel labelphoto,
			JButton buttondromologisi,JEditorPane editormuseum,Choice choicemuseum){
		panelmuseum.setVisible(false);
		panelguide.setVisible(true);
		labelphoto.setVisible(false);
		buttondromologisi.setEnabled(false);
		editormuseum.setVisible(false);
		buttondromologisi.setVisible(false);
		choicemuseum.removeAll();
	}
}
