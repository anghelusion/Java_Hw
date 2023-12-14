//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.



public class CanBuyFood {
    private boolean isEdekaOpen;
    private boolean isReweOpen;

    public CanBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
        this.isEdekaOpen = isEdekaOpen;
        this.isReweOpen = isReweOpen;
    }

    public boolean canBuy() {
        return isEdekaOpen || isReweOpen;
    }

    public static void main(String[] args) {
        CanBuyFood canBuyFood = new CanBuyFood(true, false);

        System.out.println("Я могу купить еду, это " + canBuyFood.canBuy());
    }
}

