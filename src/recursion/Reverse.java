package recursion;

public class Reverse {

    static boolean isPalRec(String str,
                            int s, int e)
    {
        // in the middle (or only 1 char in string)
        if (s == e)
            return true;

        // when not matching
        else if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // when matching, but need to proceed further, there are more chars to be matched
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str)
    {
        int n = str.length();
         if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    public static void main(String args[])
    {
        String str = "geeg";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }



}
