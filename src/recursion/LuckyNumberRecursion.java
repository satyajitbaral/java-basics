package recursion;

public class LuckyNumberRecursion {

    private static int counter =2;

    public static void main(String[] args) {

        System.out.println("is lucky:" + isLucky(19));

    }


    static boolean isLucky(int n)
    {
        if(counter > n)
            return true;
        if(n%counter == 0)
            return false;

        /*calculate next position of input no.
        Variable "next_position" is just for
        readability of the program we can
        remove it and update in "n" only */
        int next_position = n - (n/counter);

        counter++;
        return isLucky(next_position);
    }



}



