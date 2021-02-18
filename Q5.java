import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Student{
    String FirstName;
    double age;
    double score;

    public Student(String firstName, double age, double score){
        FirstName = firstName;
        this.age = age;
        this.score = score;
    }
}
class Score_And_Name_comaparator implements Comparator{
    public int compare(Object o1, Object o2) {
        Student s=(Student)o1;
        Student s1=(Student)o2;

        if(s.score<s1.score)
            return -1;
        else if(s.score > s1.score)
            return 1;
        else if(s.score==s1.score)
        {
            if(s.FirstName.compareTo(s1.FirstName)<1)
                return -1;
            else if(s.FirstName.compareTo(s1.FirstName)>1)
                return 1;
            else
                return 0;
        }
        return 0;
    }
}
public class Q5 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Vaishali",22,90));
        list.add(new Student("Tejas",23,82));
        list.add(new Student("Somya",21,95));
        list.add(new Student("Prabhleen",19,70));
        list.add(new Student("Suyash",24,60));
        Collections.sort(list, new Score_And_Name_comaparator());
        for(Student s:list)
            System.out.println(s.FirstName+" is "+s.age+" years old and scored "+s.score+" marks.");
    }
}
