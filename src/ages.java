import java.nio.channels.ShutdownChannelGroupException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class ages {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)+ " is the current time/date"); // 2016/11/16 12:08:43
		String a = dateFormat.format(date);
		String year = a.substring(0, 4);
		String month = a.substring(5, 7);
		String day = a.substring(8, 9);
		int Y = Integer.parseInt((year));
		int M = Integer.parseInt((month));
				
		String yInput = JOptionPane.showInputDialog("year of birth (not saved)");
		String mInput = JOptionPane.showInputDialog("month of birth (not saved)");
		
		int yInput1 = Integer.parseInt((yInput));
		int mInput1 = Integer.parseInt((mInput));
		
		int yAns = Y - yInput1;
		int mAns = M - mInput1;
		
		// month to year
		if (mAns < 0) {
			mAns = mAns + 12;
			yAns = yAns - 1;
		}	
			System.out.println("You are " + yAns + " years and " + mAns + " months years old!");
		JOptionPane.showMessageDialog(null, "You are " + yAns + " years and " + mAns + " months years old!");
	}

}
