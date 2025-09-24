public class Main {
    public static void main(String[] args) {
        printThreeWords(); // Задание 1

        int a = 10;
        int b = -5;
        checkSumSign(a, b); // Задание 2

        int value = 46;
        printColor(value); // Задание 3

        int a1 = 15;
        int b1 = 10;
        compareNumbers(a1, b1); // Задание 4

        int num1 = 5;
        int num2 = 15;
        boolean sumBetween10And20 = isSumBetween10And20(num1, num2);
        System.out.println(sumBetween10And20); // Задание 5

        int number = 10;
        printNumberSign(number); // Задание 6

        int number1 = -28;
        boolean isNumNegative = isNegative(number1);
        System.out.println(isNumNegative); // Задание 7

        String str = "Why?";
        int times = 3;
        printStringMultipleTimes(str, times); // Задание 8

        int year = 2025;
        boolean isYearLeap = isLeapYear(year);
        System.out.println(isYearLeap); // Задание 9

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertBinaryArray(binaryArray); // Задание 10
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();

        int[] emptyArray = createAndFillArray(100); // Задание 11
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.print(emptyArray[i] + " ");
        }
        System.out.println();

        int[] arrayForTask12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyIfLessThan6(arrayForTask12); // Задание 12
        for (int i = 0; i < arrayForTask12.length; i++) {
            System.out.print(arrayForTask12[i] + " ");
        }
        System.out.println();

        int[][] squareArray = createAndFillDiagonalArray(5); // Задание 13
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        int len = 10;
        int initialValue = 7;
        int[] resultArray = createArray(len, initialValue); // Задание 14
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 6
    public static void printNumberSign(int num) {
        if (num >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Задание 7
    public static boolean isNegative(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 8
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // Задание 9
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 10
    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    // Задание 11
    public static int[] createAndFillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Задание 12
    public static void multiplyIfLessThan6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }

    // Задание 13
    public static int[][] createAndFillDiagonalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    // Задание 14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
