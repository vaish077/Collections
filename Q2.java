import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Uni{
	 ArrayList<Character> uni(String str){
		 int num = 0;
		 ArrayList<Character> arr = new ArrayList<Character>();
		 for(char ch : str.toCharArray()){
			if(arr.contains(ch)){
			}
			else{
				arr.add(ch);
			}
		}
		return arr;
	}
}
public class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		Uni u1 = new Uni();
		ArrayList<Character> val = u1.uni(str);
		System.out.println("Unique Charracters in a String "+val);
		}
     }