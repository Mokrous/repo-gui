/**
 * Java 1 HomeWork_4
 * author Mokrous Aleksei
 * version 30.12.2021
 * */
import java.util.Scanner;
import java.util.Random;
public class HomeWork_4 {
    public static char[][] map;                 // игровое поле
    public static final int SIZE = 5;           // размер поля
    public static final int DOTS_TO_WIN = 4;    // колво фишек в ряд для победы
    public static final char DOT_EMPTY = '•';   //пустая ячейка
    public static final char DOT_X = 'X';       //крестик
    public static final char DOT_O = 'O';       //нолик
    public static void main(String[] agrs) {
        initMap();
        printMap();

        while (true) { // сама игра, поочередности ходы ч и р, с проверкой после каждого хода на конец игры
            humanTurn(); // ход человека
            printMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn(); // ход робота
            printMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил T-1000");
                break;
            }
            if (isMapFull()) { // проверка на ничью
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");


    }
    public static void initMap() {  // создаем поле 3*3
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; // заполняем поле переменой (точками)
            }
        }
    }
    public static void printMap() {     // вывод таблицы
        for (int i = 0; i <= SIZE; i++) { // ввод первой строки
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {  // Ход игрока
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;   // преобразование в диапозон 0-2
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y)); // ввод до тех пор, пока не поставит в корректную ячейку

        map[y][x] = DOT_X;      // поместить в ячейку нашего поля крестик
    }
    public static void aiTurn() { // ход робота
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1)); // преобразование в строчку
        map[y][x] = DOT_O; // компьютер сходил 0
    }

    public static boolean isCellValid(int x, int y) { // проверка на ввод не корректных координат
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false; // проверка границ
        if (map[y][x] == DOT_EMPTY) return true; // проверка, что ячейка пустая иее можно занять
        return false;
    }

    public static boolean isWinner(char symb) { // проверка на совпадение 3 к ряду
        boolean first = true;
        boolean second = true;
        for(int i = 0; i < SIZE; i++)
        {
            first &= map[i][i]==symb;
            second &= map[i][(SIZE-1)-i] ==symb;
            if (map[i][1]==symb&&map[i][2]==symb&&map[i][3]==symb&&map[i][4]==symb) return true;
            if (map[i][0]== symb&&map[i][1]==symb&&map[i][2]==symb&&map[i][3]==symb) return true;
            if (map[1][i]==symb&&map[2][i]==symb&&map[3][i]==symb&&map[4][i]==symb) return true;
            if (map[0][i]== symb&&map[1][i]==symb&&map[2][i]==symb&&map[3][i]==symb) return true;
        }
        return first||second;



    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
