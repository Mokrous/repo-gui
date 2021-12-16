class JavaHomeWorkOne {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    static void checkSumSign() {
        int a = 5;
        int b = 10;
        System.out.println("Sum is " + (a + b >= 0 ? "positive" : "negative"));
    }
    static void printColor() {
        int value = 120;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }
    static void compareNumbers() {
        int a = -15;
        int b = 30;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }
}
