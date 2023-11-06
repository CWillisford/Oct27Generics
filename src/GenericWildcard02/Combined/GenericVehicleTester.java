package GenericWildcard02.Combined;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTester {

    public static <T> void copyAll(List<? extends T> source, List<? super T> destination){
        destination.addAll(source);
    }

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota",4));
        carList.add(new Car("Lexus",2));
        carList.add(new Car("Range Rover",4));
        carList.add(new Car("BMV",6));
        carList.add(new Car("Porsche",2));

        List<Motercycle> motercycleList = new ArrayList<>();
        motercycleList.add(new Motercycle("Harlet Davison",350));
        motercycleList.add(new Motercycle("Ducati",1000));
        motercycleList.add(new Motercycle("Yahama",550));

        List<Vehicle> destination = new ArrayList<>();

        GenericVehicleTester.copyAll(carList,destination);
        GenericVehicleTester.copyAll(motercycleList,destination);

        System.out.println(destination);
    }
}
