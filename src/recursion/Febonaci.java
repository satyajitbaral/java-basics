package recursion;

import java.util.Scanner;

public class Febonaci {


    public static void main(String[] args) {



        /**
         *
         * 0,1,1,2,3,5,8
         *
         *
         *
         *
         */



        System.out.println(fibonaci(2));
        System.out.println(fibonaci(3));
        System.out.println(fibonaci(4));
        System.out.println(fibonaci(5));
        System.out.println(fibonaci(6));



    }


    public static int fibonaci(int n){

        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }



}
