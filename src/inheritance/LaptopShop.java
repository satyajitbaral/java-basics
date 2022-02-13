package inheritance;

public class LaptopShop {

    public static void main(String[] args) {
        //Laptop laptop = new Laptop(4,"i3");

        //System.out.println(printBill(laptop));

        //Laptop laptop2 = new MidTypeLaptop(12,"i5");


        Laptop laptop2 = new MidTypeLaptop();
        System.out.println(printBill(laptop2));



        System.out.println(laptop2.configure());

    }

    protected static String printBill(Laptop soldLaptop){

        //System.out.println(5/0);

        System.out.println(soldLaptop.getClass());

        return "sold: " + soldLaptop.toString();
    }

}
