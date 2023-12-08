import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int result1 = number / 100;
        int result2 = (number / 10) % 10;
        int result3 = number % 10;
        System.out.println("Число " + number + " -> " + result1 + ", " + result2 + ", " + result3);


        String stringVariable = "Hello, World!";
        System.out.println("String: " + stringVariable);

        char charVariable = 'G';
        int intVariable = 89;
        byte byteVariable = 4;
        short shortVariable = 56;
        float floatVariable = 4.7333436f;
        double doubleVariable = 4.355453532;
        long longVariable = 12121;


        System.out.println("char: " + charVariable);
        System.out.println("int: " + intVariable);
        System.out.println("byte: " + byteVariable);
        System.out.println("short: " + shortVariable);
        System.out.println("float: " + floatVariable);
        System.out.println("double: " + doubleVariable);
        System.out.println("long: " + longVariable);


    }
   }

