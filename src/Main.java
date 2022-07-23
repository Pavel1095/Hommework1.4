public class Main {
    public static void main(String[] args) {
    //  Задание 1
        int currentNum = 0;
        while (currentNum < 10) {
            System.out.print(++currentNum + " ");
        }
        System.out.println();
        for (; currentNum > 0; currentNum --) {
            System.out.print(currentNum + " ");
        }
    }
}