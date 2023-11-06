package GenericWildcard02.Combined;

public class Car extends Vehicle{

    private int numOfDoors;

    public Car(String brand, int nD){
        super(brand);
        this.numOfDoors=nD;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return getBrand() + ", number of doors: " + numOfDoors ;
    }
}
