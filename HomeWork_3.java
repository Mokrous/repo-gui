import java.util.Arrays;

/**
 * Java 1 HomeWork_3
 * author Mokrous Aleksei
 * version 27.12.2021
 * */

public class HomeWork_3 {
    public static void main(String[] args) {
        // Задание_1
        System.out.println("Task_1");
        int [] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array));
        changeZeroeAndOne(array);
        System.out.println(Arrays.toString(array));
        // Задание_2
        System.out.println(" ");
        System.out.println("Task_2");
        int[] array2;
        array2 = new int[101];
        fillArray2(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(" ");
        System.out.println("Task_3");
        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] array_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array_3));
        doubleNumbersLessThanSix(array_3);
        System.out.println(Arrays.toString(array_3));
        System.out.println(" ");
        System.out.println("Task_4");
        int[][] doubleArr = new int[4][4];
        fillArr4(doubleArr);
        System.out.println(" ");
        System.out.println("Task_5");
        int[] input = fillArr5(5, 18);
        System.out.println(Arrays.toString(input));

    }
     static void changeZeroeAndOne(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = 1 - inputArray[i];
        }
    }

     static void fillArray2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (i);
        }
    }
    static void doubleNumbersLessThanSix(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i]<6) ? (inputArray[i]*2) : inputArray[i];
        }
    }
    public static void fillArr4(int[][] doubleArr) {
        int n = doubleArr.length;
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                doubleArr[i][j] = 2;
                if (i == j) {doubleArr[i][j] = 1;}
                if (i == n-j-1) {doubleArr[i][j] = 1;}
            }
        }
        for (int i = 0; i < doubleArr.length; i++){
            System.out.println(Arrays.toString(doubleArr[i]));
        }
    }
    public static int[] fillArr5(int len, int initialValue) {
        int[] vvod;
        vvod = new int[len];
        for (int i = 0; i < vvod.length; i++) {
            vvod[i] = initialValue;
        }
        return vvod;
    }
}
