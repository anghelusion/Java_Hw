public class Main {
    public static void main(String[] args) {

    int a = 50;
    int b = 10;

        System.out.println("Сумма: " + sum(a, b));
        System.out.println("Разность: " + sub(a, b));
        System.out.println("умножение: " + mul(a, b));
        System.out.println("Деление: " + div(a, b));
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

          }



