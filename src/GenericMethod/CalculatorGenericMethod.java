package GenericMethod;

public class CalculatorGenericMethod {
    public <T extends Number> double add(T[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("The array cannot be null or empty");
        }
        double sum = 0;
        for(T x : arr){
            sum += x.doubleValue();
        }
        return sum;
    }
}

