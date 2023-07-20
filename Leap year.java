import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Enter the year as input
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();
    boolean isLeapYear;

    // divisible by 4
    isLeapYear = (year % 4 == 0);

    // divisible by 4, not by 100, or divisible by 400
    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

    if (isLeapYear) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}
