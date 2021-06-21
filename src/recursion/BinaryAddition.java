package recursion;

public class BinaryAddition {

    /**
     * 11111001111
     * 00000000110
     * -----------
     * 01
     */

    public static void main(String args[]) {

        int a = 111;
        int b = 111;

        int result = 0;
        int carry = 0;
        System.out.println(a);
        System.out.println(b);

        while (a > 0 || b > 0) {

            int unitPlaceOfFirst = a % 10;
            int unitPlaceOfSecond = b % 10;

            int[] res = addBinary(unitPlaceOfFirst, unitPlaceOfSecond);

            a = a / 10;
            b = b / 10;

            int unitOfResult = result%10;

            int[] res2 = addBinary(unitOfResult, res[1]);


            result = result * 10 + res[0];
            carry = res2[1];

        }


        System.out.println("-------");
        System.out.println(result);

    }


    public static int[] addBinary(int i, int j) {
        // on 0th index --> value
        // on 1st index --> carry
        if (i == 0 && j == 0) {
            return new int[]{0, 0};
        } else if (i == 0 && j == 1) {
            return new int[]{1, 0};
        } else if (i == 1 && j == 0) {
            return new int[]{1, 0};
        } else {
            return new int[]{1, 1};
        }
    }


}
