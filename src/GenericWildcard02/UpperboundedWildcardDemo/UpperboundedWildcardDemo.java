package GenericWildcard02.UpperboundedWildcardDemo;

import java.util.*;

public class UpperboundedWildcardDemo {
    public long factorial(List<? extends Number> list){
        long result = 1;

        for(int i=3;i >= 1;i-- ){
            list.add(Long.valueOf(i));
            result *= list.get(i).longValue();
        }

        return result;
    }
}

class Tester{
    public static void main(String[] args) {

        UpperboundedWildcardDemo ub = new UpperboundedWildcardDemo();
        List<Long> list = new ArrayList<Long>();

        Long result = ub.factorial(list);
        System.out.println(result);
    }
}