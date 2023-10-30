package GenericMethod;

import java.util.Comparator;

public class Max {

    public <T extends Comparable<T>> T max(T[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        T max = arr[0];
        int index = 0,maxIndex = 0;
        for(T o : arr){
            if(o.compareTo(max) > 0) {
                max = o;
                maxIndex = index;
            }
            index++;
        }
        return max;
    }

    public <T> T max(T[] arr, Comparator<T> comp){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        T max = arr[0];
        for(T o : arr){
            if(comp.compare(o, max) > 0)
            {
                max = o;
            }
        }
        return max;
    }
}

class MaxTester {
    public static void main(String[] args) {
        Max m = new Max();
        Integer [] arr = {6,7,3,5,10};
        System.out.println(m.max(arr));

        m.max(arr,null);

        Comparator<Integer> comp = Comparator.naturalOrder();
        System.out.println(m.max(arr,comp));

    }
}
