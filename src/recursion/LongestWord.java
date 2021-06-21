package recursion;

import java.util.Scanner;

public class LongestWord {

  public static void main(String[] args) {

    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter the sentence:");
    //    String str = sc.nextLine();

    System.out.println(longestWord("the quick brown-fox jump over the lazy dog"));

    //    sc.close();

  }

  private static String longestWord(String str) {
    if (str.indexOf(' ') == -1) { // IF sentence only has one word
      return str;
    }
    int spaceLocation = str.indexOf(' ');
    String firstWord = str.substring(0, spaceLocation);
    String rest = str.substring(spaceLocation + 1);
    String secondWord = longestWord(rest);
    return firstWord.length() >= secondWord.length() ? firstWord : secondWord;
  }
}
