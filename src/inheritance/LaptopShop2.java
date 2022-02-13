package inheritance;

public class LaptopShop2 extends LaptopShop{

    protected static String printBill(Laptop soldLaptop){
        System.out.println(soldLaptop.getClass());
        return "sold2: " + soldLaptop.toString();
    }

}
