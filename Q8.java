import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q8{
	public static void main(String[] args){
		Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        df.getDateInstance();
	    String strDate = df.format(d1);
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);

	}
}
