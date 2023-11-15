package GenericMethod;

import GenericWildcard02.PrintList;

import java.util.Arrays;
import java.util.List;
public class PrintGeneric {

    public <T> void print(List<T> list){
        System.out.println("From generic method");
        System.out.println(list);
    }
}

class PrintGenericTester{
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Dawson","Carson","Aaron","Rylan");
        List<Integer> intList = Arrays.asList(1,2,3,4);
        PrintGeneric pg = new PrintGeneric();
        pg.print(strList);
        pg.print(intList);
    }
}
