package GenericWildcard02.LowerboundedWildcard;

import java.util.ArrayList;
import java.util.List;

//lowerbounded wildcard is <? super subclass>
public class LowerboundedwildcardDemo {

    public void add(List<? super Integer> list){
        for(Object x : list){
            list.add((Integer)x);
        }
    }

    public void addPrimativeType(List<? super Integer> list){
        //can we add primative type values
        //1 to 10
        Integer x;
        for(int i=1;i<=10;i++){
            list.add(i);
        }

    }

    public int sum(List<? super Integer> list){
        int sum = 0;
        for(Object x : list){
            sum += (Integer)x;
        }
        return sum;
    }
}

class LowerboundedTester{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //list.addPrim
    }
}
