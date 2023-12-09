//import java.util.Scanner;

//public class Main {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое слово:");
//        String word1 = scanner.nextLine();
//
//        System.out.println("Введите второе слово:");
//        String word2 = scanner.nextLine();
//
//        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
//            System.out.println("Количество букв в словах должно быть четным.");
//            return;
//        }
//
//        int length1 = word1.length() / 2;
//        String firstHalf1 = word1.substring(0, length1);
//
//        int length2 = word2.length() / 2;
//        String secondHalf2 = word2.substring(length2);
//
//        String combinedWord = firstHalf1 + secondHalf2;
//
//        System.out.println("Результат: " + combinedWord);
//}
//        }





import java.util.Scanner;

    public class Main {

        public static void add(int a, int b) {
            System.out.println("Сумма: " + (a + b));
        }

        public static int addReturn(int a, int b) {
            return a + b;
        }

        public static void sub(int a, int b) {
            System.out.println("Разность: " + (a - b));
        }
        public static int subReturn(int a, int b) {
            return a - b;
        }

        public static void mul(int a, int b) {
            System.out.println("Произведение: " + (a * b));
        }

        public static int mulReturn(int a, int b) {
            return a * b;
        }

        public static void div(int a, int b) {
            System.out.println("Деление: " + (a / b));
        }
        public static int divReturn(int a, int b) {
            return a / b;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            int a = scanner.nextInt();

            System.out.println("Введите второе число:");
            int b = scanner.nextInt();

            add(a, b);
            sub(a, b);
            mul(a, b);
            div(a, b);

            System.out.println("Сумма с возвратом: " + addReturn(a, b));
            System.out.println("Разность с возвратом: " + subReturn(a, b));
            System.out.println("Произведение с возвратом: " + mulReturn(a, b));
            System.out.println("Деление с возвратом: " + divReturn(a, b));
        }
    }






