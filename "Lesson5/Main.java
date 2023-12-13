import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double m = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double n = scanner.nextDouble();

        double mDiff = Math.abs(m - 10);
        double nDiff = Math.abs(n - 10);
         if (mDiff < nDiff) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (nDiff < mDiff) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа " + m + " и " + n + " расположены на одинаковом расстоянии от 10.");
        }
    }
}
      

//import java.util.Random;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Random random = new Random();
//
//        int n = random.nextInt(28800 + 1);
//
//        System.out.println("Случайное число: " + n);
//
//        int hours = n / 3600;

//        switch (hours) {
//            case 0:
//                System.out.println("Рабочий день закончился.");
//                break;
//            case 1:
//                System.out.println("Остался 1 час.");
//                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("Осталось " + hours + " часа.");
//                break;
//            default:
//                System.out.println("Осталось более " + hours + " часов.");
//                break;
//        }
//    }
//}
