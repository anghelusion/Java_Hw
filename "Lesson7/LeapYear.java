import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
     
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            boolean isLeapYear = false;

            if (year % 4 == 0) {
                isLeapYear = true;
            } else if (year % 100 == 0) {
                isLeapYear = false;
            } else if (year % 400 == 0) {
                isLeapYear = true;
            }

            System.out.println("Год " + year + " високосный? " + isLeapYear);
        }


    }


