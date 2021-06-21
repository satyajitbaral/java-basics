package recursion;

public class Hcf {

  public static void main(String[] args) {

    System.out.println(hcf(45, 27));
    System.out.println(hcf(21, 8));
    System.out.println(hcf(4900, 490));
  }

  private static int hcf(int a, int b) {
    if (a % b == 0) return b;
    return hcf(b, a % b);
  }
}
