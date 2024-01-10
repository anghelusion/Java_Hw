
//        Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[8];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(50) + 1;
//        }
//        System.out.print("Исходный массив: ");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < array.length; i += 2) {
//            array[i] = 0;
//        }
//        System.out.print("Массив после замены: ");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}

//        Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // [10;99]
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}