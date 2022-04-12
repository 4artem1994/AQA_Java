public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 11;
        int b = 33;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("red");
        } else if (value >= 1 && value <= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    private static void checkSumSign() {
        int a = -1;
        int b = -2;
        if (a + b >= 0) {
            System.out.println("sum is positive");
        } else {
            System.out.println("sum is negative");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}


