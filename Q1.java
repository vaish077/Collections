import java.util.ArrayList;
import java.util.List;
public class Q1{
    public static void main(String[] args){
        List<Float> list = new ArrayList<Float>();
        float add = 0;
        list.add(5.15f);
        list.add(10.0f);
        list.add(4.2f);
        list.add(1.9f);
        list.add(9.7f);

        for(Float element : list) {
            add = add + element;
        }
        System.out.println(add);
    }
}

