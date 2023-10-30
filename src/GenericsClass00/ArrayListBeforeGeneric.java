package GenericsClass00;

import java.util.ArrayList;

public class ArrayListBeforeGeneric {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add("Banana");
        list.add('a');
        list.add(true);

        System.out.println(list);

        ArrayListBeforeGeneric ab = new ArrayListBeforeGeneric();
        ab.print(list);
        ab.printTriple(list);


    }

    public int print(ArrayList<Integer> list) {
        int result = 1;
        for(Integer x : list){
            result *= 3;
        }
        return result;
    }
    public void printTriple(ArrayList<Integer> list){
        for(Integer x : list){
            System.out.println(x * 3);
        }
    }
}
