package common;

import java.util.Scanner;

public class BinaryAddition {

  public static void main(String[] args) {
    long num1, num2;
    int i = 0, carry = 0;
    int[] sum = new int[10];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first binary number: ");
    num1 = scanner.nextLong();
    System.out.print("Enter second binary number: ");
    num2 = scanner.nextLong();

    while (num1 != 0 || num2 != 0) {
      sum[i++] = (int) ((num1 % 10 + num2 % 10 + carry) % 2);
      carry = (int) ((num1 % 10 + num2 % 10 + carry) / 2);
      num1 = num1 / 10;
      num2 = num2 / 10;
    }
    // check if there is a carry remaining then place it in the next element of the array
    if (carry != 0) {
      sum[i] = carry;
    }

    System.out.print("Output: ");
    while (i >= 0) {
      System.out.print(sum[i--]);
    }
    System.out.print("\n");
  }
}
