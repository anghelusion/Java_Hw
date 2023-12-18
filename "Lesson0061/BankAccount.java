import java.util.List;
import java.util.ArrayList;
public class BankAccount {
    public static void main(String[] args) {
        int n = 21;
        int numberOfDays = numberOfDaysToWithdraw(n);
        System.out.println("Количество дней, необходимых для снятия всех денег из банка: " + numberOfDays);
    }

    public static int numberOfDaysToWithdraw(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        int currentSum = n;
        int numberOfDays = 0;
        for (int divisor : divisors) {
            if (divisor > 1) {
                currentSum -= divisor;
                numberOfDays++;
            }
        }
        if (currentSum == 1) {
            numberOfDays++;
        }

        return numberOfDays;

    }


    }


