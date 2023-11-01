package GenericMethod;

import java.util.Arrays;
import java.util.List;
public class PrintGeneric {

    public <T> void print(List<T> list){
        System.out.println(list);
    }
}

class PrintGenericTester{
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Truong","Elizabeth","Kevin");
    }
}
