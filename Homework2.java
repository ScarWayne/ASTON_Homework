import java.util.Arrays;

public class Homework2 {
    /*
    1) Создайте метод printThreeWords(), 
    который при вызове должен отпечатать в столбец три слова: 
    Orange, Banana, Apple
    */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*
    2)  Создайте метод checkSumSign(), в теле которого объявите две int 
    переменные a и b, и инициализируйте их любыми значениями, 
    которыми захотите. Далее метод должен просуммировать эти переменные, 
    и если их сумма больше или равна 0, то вывести в консоль сообщение 
    “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    */

    public static void checkSumSign() {
        
        int a = -6;
        int b = 5; 

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*
    3) Создайте метод printColor() в теле которого задайте 
    int переменную value и инициализируйте ее любым значением. 
    Если value меньше 0 (0 включительно), то в консоль метод 
    должен вывести сообщение “Красный”, если лежит в пределах от 0 
    (0 исключительно) до 100 (100 включительно), то “Желтый”, 
    если больше 100 (100 исключительно) - “Зеленый”;
    */

    public static void printColor() {
        
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный");

        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");

        } else {
            System.out.println("Зеленый");
        }
    }

    /*
    4) Создайте метод compareNumbers(), 
    в теле которого объявите две int переменные a и b, 
    и инициализируйте их любыми значениями, которыми захотите. 
    Если a больше или равно b, то необходимо вывести в консоль 
    сообщение “a >= b”, в противном случае “a < b”;
    */

    public static void compareNumbers() {
        
        int a = 10;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }

    /*
    5) Напишите метод, принимающий на вход два целых числа и проверяющий, 
    что их сумма лежит в пределах от 10 до 20 (включительно), 
    если да – вернуть true, в противном случае – false.
    */

    public static boolean checkSum(int x, int y) {

        return x + y >= 10 && x + y <= 20;
        
    }

    /*
    6) Напишите метод, которому в качестве параметра 
    передается целое число, метод должен напечатать в консоль, 
    положительное ли число передали или отрицательное. 
    Замечание: ноль считаем положительным числом.
    */

    public static void checkNumber(int x) {

        if (x >= 0)  {
            System.out.println("Вы передали положительное число");

        } else {
            System.out.println("Вы передали отрицательное число");

        }

    }

    /*
    7) Напишите метод, которому в качестве параметра передается целое число. 
    Метод должен вернуть true, если число отрицательное, и вернуть false 
    если положительное. Замечание: ноль считаем положительным числом.
    */

    public static boolean numberIsNegative(int x) {
        
        return x < 0;
    }

    /*
    8) Напишите метод, которому в качестве аргументов 
    передается строка и число, метод должен отпечатать 
     консоль указанную строку, указанное количество раз;
    */

     public static void stringQuantity(String str, int n) {

        for(int i = 0; i < n; i++ ){
            System.out.println(str);
        }
     }

     /*
     9) Напишите метод, который определяет, является ли год високосным, 
     и возвращает boolean (високосный - true, не високосный - false). 
     Каждый 4-й год является високосным, кроме каждого 100-го, 
     при этом каждый 400-й – високосный.
     */
    public static boolean yearIsLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /*
    10) Задать целочисленный массив, состоящий из элементов 0 и 1. 
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */

    public static void changeNumber() {
        
        int [] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < numbers.length; i++) {
            
            if(numbers[i] == 0) {

               numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    /*
    11) Задать пустой целочисленный массив длиной 100. 
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void fillArrayWithNumbers(){
        
        int nums [] = new int[100];
        int m = 0;

        for(int n = 0; n < 100; n++) {
            nums[n] = ++m;
        }
        System.out.println(Arrays.toString(nums));
    }
    /*
    12) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, 
    и числа меньшие 6 умножить на 2;
    */
    public static void numbLessThenSix() {
        int numbers [] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 6) {
                numbers[i] *= 2;
                
            } 
            
        }
        System.out.println(Arrays.toString(numbers));
    }
    /*
    13) Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, 
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: 
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
     */

    public static void squareArray(){

        int [][] arr = new int [5][5];
            for(int x = 0; x < arr.length; x++) {
                for(int y = 0; y < arr.length; y++)  {
                    arr[x][y] = x + y;
                                                                             
                    if((x == y) || (x + y == arr.length - 1)) {
                        arr[x][y] = 1;                      

                    }
                System.out.print(arr[x][y] + " ");
                }
            System.out.println();
            }
    }
    /*
    14) Написать метод, принимающий на вход два аргумента: len и initialValue, 
    и возвращающий одномерный массив типа int длиной len, 
    каждая ячейка которого равна initialValue.
     */
    public static int[] createArrayWithOneNumber(int len, int initialValue){
        
        int [] array  = new int [len];
        for(int n = 0; n < len; n++){
            array[n] = initialValue;
        }
        return array; 
    }
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSum(10, 7));
        checkNumber(0);
        System.out.println(numberIsNegative(0));
        stringQuantity("Кря", 5);
        System.out.println(yearIsLeap(400));
        changeNumber();
        fillArrayWithNumbers();
        numbLessThenSix();
        squareArray();
        System.out.println(Arrays.toString(createArrayWithOneNumber(5, 7)));

    }
}

