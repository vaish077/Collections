import java.util.*;
class S{ 
	Stack<Integer> s; 
	Integer minElement; 
    S() { s = new Stack<Integer>(); } 
    void getMin(){
		if (s.isEmpty()) 
			System.out.println("Stack empty");
		else
			System.out.println("Min" + minElement); 
	}
     void pop(){ 
		if (s.isEmpty()){ 
			System.out.println("Stack empty"); 
			return; 
		}
		System.out.print("Pop"); 
		Integer t = s.pop(); 
         if (t < minElement){ 
			System.out.println(minElement); 
			minElement = 2*minElement - t; 
		}
		else
			System.out.println(t); 
	} 
     void push(Integer x){ 
		if (s.isEmpty()){ 
			minElement = x; 
			s.push(x); 
			System.out.println("Push" + x); 
			return; 
		} 
         if (x < minElement){ 
			s.push(2*x - minElement); 
			minElement = x; 
		} 
         else
            s.push(x); 
            System.out.println("Push" + x); 
	} 
}; 
public class Q7{ 
	public static void main(String[] args){ 
        S s = new S(); 
		s.push(4); 
		s.push(6); 
		s.getMin(); 
		s.push(1); 
		s.push(0); 
		s.getMin(); 
		s.pop();  
} 
}