import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;


public class Clock {
	public void ora(final JLabel lblClock){
		

	Thread roloi = new Thread() {
		public void run() {
			for (;;) {
				Calendar cal = new GregorianCalendar();
				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH);
				month++;
				int year = cal.get(Calendar.YEAR);
				int seconds = cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				lblClock.setText("<html>" + "" + hour + ":" + minute + ":"
						+ seconds + "  <br>  " + day + "/" + month + "/"
						+ year + "</html>");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	roloi.start();

}
}
