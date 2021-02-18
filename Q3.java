import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Oc{
	 HashMap<Character,Integer> uni(String str) {
		int num = 0;
		HashMap<Character,Integer> arr = new HashMap<Character,Integer>();
		for(char ch : str.toCharArray()) {
			if(arr.containsKey(ch)) {
				arr.put(ch, arr.get(ch) + 1); 
			}
			else {
				arr.put(ch, 1); 
			}
		}
		return arr;
	}
}
public class Q3{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		Oc u1 = new Oc();
		HashMap<Character,Integer> val = u1.uni(str);
		System.out.println("Unique Charracters in a String "+val);		
	}
}