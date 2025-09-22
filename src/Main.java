public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        // Задание 2
        int a = 10;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

        // Задание 3
        int value = 46;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

        // Задание 4
        int a1 = 15;
        int b1 = 10;
        if (a1 >= b1) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

        // Задание 5
        int num1 = 5;
        int num2 = 15;
        int sum1 = num1 + num2;
        if (sum1 >= 10 && sum1 <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Задание 6
        int number = 10;
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

        // Задание 7
        int number1 = 28;
        if (number1 < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Задание 8
        String str = "Why?";
        int times = 3;
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }

        // Задание 9
        int year = 2025;
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Задание 10
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();

        // Задание 11
        int[] emptyArray = new int[100];
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i + 1;
        }
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.print(emptyArray[i] + " ");
        }
        System.out.println();

        // Задание 12
        int[] arrayForTask12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayForTask12.length; i++) {
            if (arrayForTask12[i] < 6) {
                arrayForTask12[i] *= 2;
            }
        }
        for (int i = 0; i < arrayForTask12.length; i++) {
            System.out.print(arrayForTask12[i] + " ");
        }
        System.out.println();

        // Задание 13
        int[][] squareArray = new int[5][5];
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (i == j) {
                    squareArray[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        // Задание 14
        int len = 10;
        int initialValue = 7;
        int[] resultArray = new int[len];
        for (int i = 0; i < len; i++) {
            resultArray[i] = initialValue;
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
