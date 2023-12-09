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




    String str = new String("I study Basic Java!");
    public static void printChar(String str) {
        System.out.println(str.charAt(str.length() - 2));



        printChar(str);

        String subStr = str.substring(14, 18);
        System.out.println(subStr);

        String upperStr = str.toUpperCase();
        System.out.println(upperStr);

        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr);

    }

    }





