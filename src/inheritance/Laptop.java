package inheritance;

public abstract class Laptop {

    int ramSize;
    protected String processorType;
    private String configureMessage;

    public Laptop(int ramSize, String processorType) {

        this.ramSize = ramSize;
        this.processorType = processorType;
        this.configureMessage = configure();

    }

    public Laptop() {
    }

    protected String configure(){
        return "base Laptop with ram:" + ramSize + "GB & processor type:" + processorType;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ramSize=" + ramSize +
                ", processorType='" + processorType + '\'' +
                ", configureMessage='" + configureMessage + '\'' +
                '}';
    }

     public abstract void color();

}
