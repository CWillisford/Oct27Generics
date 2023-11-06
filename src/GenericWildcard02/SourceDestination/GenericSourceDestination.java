package GenericWildcard02.SourceDestination;

import java.util.ArrayList;
import java.util.List;

public class GenericSourceDestination {
    public static <T,U> void processing(List<? extends T> source, List<? super U> destination){
        for(T x : source){
           U newProcessValue = (U)x;
           destination.add(newProcessValue);
        }
    }
}

class GenericSourceDestinationTester{
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);

        List<Number> destination = new ArrayList<>();
        GenericSourceDestination.processing(sourceList,destination);

        System.out.println(destination);
    }
}
