package GenericWildcard02.Combined;

public class Motercycle extends Vehicle{

    private int cc;

    public Motercycle(String brand, int cc) {
        super(brand);
        this.cc=cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Motercycle{" +
                "cc=" + cc +
                '}';
    }
}
