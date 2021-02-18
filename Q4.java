import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Em{
	private String Name;
	private double age;
	double salary;
	public void setName(String name , double age , double salary ){
		this.Name = name;
		this.age = age;
		this.salary = salary;
	}
	 public String toString(){
	        return "Name " + Name + " - " +"Salary"+" - "+ salary +" - "+"age"+ " - " + age + "\n";
	    }
	
}
class SalarySorter implements Comparator<Em>{
    public int compare(Em a, Em b) {
    	double sal1 = a.salary;
    	double sal2 = b.salary;
    	if(a.salary > b.salary) {
    		return 1;
    	}
    	else if(a.salary < b.salary) {
    		return -1;
    	}
		return 0;       
    }
}
public class Q4{
	public static void main(String[] args) {
		Em p1 = new Em();
		Em p2 = new Em();
		Em p3 = new Em();
		Em p4 = new Em();
		p1.setName("Vaishali Kaushik", 21 , 5000);
		p2.setName("Tejas Bhatia", 22 , 400000);
		p3.setName("Yash Sharma", 23 , 6000);
		p4.setName("Somya Agrawal", 19 , 500);
		ArrayList<Em> Q4 = new ArrayList<Em>();
        Q4.add(p1);
        Q4.add(p2);
        Q4.add(p3);
		Q4.add(p4);
        System.out.println("unsorting array list\n"+Q4); 
        Collections.sort(Q4, new SalarySorter());
        System.out.println("sorting array list\n"+Q4);
	}
}