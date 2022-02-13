package inheritance;

public class MidTypeLaptop extends Laptop{

    int ramSize=8;

    public MidTypeLaptop(int ramSize, String processorType) {
        super(ramSize, processorType);
    }

    public MidTypeLaptop(){
    }

//    protected String configure(){
//        return "base Laptop with ram:" + ramSize + "GB & processor type:" + processorType;
//    }


    protected String configure(){
        return "midtype Laptop with ram:" + ramSize + "GB & processor type:" + processorType;
    }

    public void color() {
        System.out.println("brown");
    }
}
