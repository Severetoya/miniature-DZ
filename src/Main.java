public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "X", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArrayProcessor.processArray(correctArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = ArrayProcessor.processArray(wrongSizeArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = ArrayProcessor.processArray(wrongDataArray);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Задание 4
        try {
            int[] array = {1, 2, 3};
            System.out.println("Элемент за пределами массива: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
