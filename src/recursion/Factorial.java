package recursion;

import java.util.Arrays;

public class Factorial {


    /**
     *
     *
     *  5! -> 5*4!
     *
     */


    public static void main(String[] args) {


        try{
            System.out.println(factorial(1));
            System.out.println(factorial(0));
            System.out.println(factorial(3));
            System.out.println(factorial(-3));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }





    }

    public static int factorial(int n) throws Exception {

        if(n == 0 || n==1)
            return 1;
        else if(n<0)
            throw new Exception("not valid input");
        else{
            return n*factorial(n-1);
        }
    }





}
