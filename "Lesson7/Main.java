//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CanBuyFood canBuyFood = new CanBuyFood(true, false);

        boolean canBuy = canBuyFood.canBuy();

        System.out.println("Я могу купить еду, это " + canBuy);




        }
    }




