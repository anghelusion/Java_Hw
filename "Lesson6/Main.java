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


//надеюсь все правильно это изменённый код 
