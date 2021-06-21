package recursion;

import java.util.*;
class palindromeRecursive
{
    Scanner sc = new Scanner (System.in);
    static int s =0;
    static int c = -1;

    public static int reverse (int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        c++;
        int d = n/10;
        n /= 10;
        System.out.println(s);
        s = s + (int)Math.pow(10,c)*d + reverse (n);
        System.out.println(s);
        return s;
    }

    public static void main(String args[])
    {
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();
        int r = reverse (n);
        if (r == 0)
        {
            System.out.println("Wrong input");
        }
        else if (r == n)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}