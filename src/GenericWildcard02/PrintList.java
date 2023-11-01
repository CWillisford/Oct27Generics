package GenericWildcard02;

import java.util.List;

public class PrintList {
    public static void main(List<?> list) {
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}

class PrintListTester{
    public static void main(String[] args) {
        PrintList pl = new PrintList();

        List<String> list = List.of("Gabe","Connor","Holly");
    }
}