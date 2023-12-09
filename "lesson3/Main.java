public class Main {

    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        printChar(str);

        String subStr = str.substring(14, 18);
        System.out.println(subStr);

        String upperStr = str.toUpperCase();
        System.out.println(upperStr);

        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr);
    }

    public static void printChar(String str) {
        System.out.println(str.charAt(str.length() - 2));
    }
}