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
		    	System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		    	String a = dateFormat.format(date);
		    	String year = a.substring(0, 3);
		    	
		    	Integer.parseInt(dateFormat.format(date));
		    }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
