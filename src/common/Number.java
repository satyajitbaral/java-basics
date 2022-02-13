package common;

import java.util.*;
class Number
{
    Scanner sc = new Scanner (System.in);
    int binary (int n)
    {

        /*
         START
         create an empty string
         create an int variable to keep the remainder
         run the input through a loop till number becomes 0
           take the remainder by dividing the number with 2
           divide the number with 2 and update the number variable with the result
           add the remainder to the string
         end loop
         convert the string to an int
         return the converted string
         END
         */

        String s = "";
        int d;

        while ( n > 0)
        {
            d = n % 2;
            n/= 2;
            s = s + d;
        }

        s.trim();
        int r = Integer.parseInt(s);
        return r;
    }

    int octal (int n)
    {

        String s = " ";
        int d;

        while ( n > 0)
        {
            d = n % 8;
            n/= 8;
            s = s + d + " ";
        }

        s.trim();
        int r = Integer.parseInt(s);
        return r;
    }

    String hexadecimal (int n)
    {

        String s = " ";
        int d;
        while ( n > 0)
        {
            d = n % 16;

            n/= 16;

            if ( d == 10)
            {
                s = s + "A";
            }

            if ( d == 11)
            {
                s = s + "B";
            }

            if ( d == 12)
            {
                s = s + "C";
            }

            if ( d == 13)
            {
                s = s + "D";
            }

            if ( d == 14)
            {
                s = s + "E";
            }

            if ( d == 15)
            {
                s = s + "F";
            }

            if ( d < 10)
            {
                s = s + d + " ";
            }

        }
        s.trim();
        return s;
    }

    void main ()
    {
        System.out.println("Enter a decimal number to be converted");
        int n = sc.nextInt();
        System.out.println("MENU");
        System.out.println("To which base will the number be converted to");
        System.out.println("1. Binary Conversion");
        System.out.println("2. Octal Conversion");
        System.out.println("3. Hexadecimal Conversion");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1: System.out.println(n + " in Binary is: " + binary(n));
                break;
            case 2: System.out.println(n + " in Octal is: " + octal(n));
                break;
            case 3: System.out.println(n + " in Hexadecimal is: " + hexadecimal(n));
                break;
            default: System.out.println("Choice does not exist");
                break;
        }
    }
}