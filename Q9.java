import java.text.DateFormat;
import java.util.*;
public class Q9{
	public static void main(String[] args) throws RuntimeException{
		Date d1 = new Date();
		System.out.println("Today's date is "+ d1.toString());
		Locale locAmerican = new Locale("am","ch");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locAmerican);
		System.out.println("Today is in American Language in USA Format : "+ df.format(d1));
	}
}
