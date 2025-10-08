public class ArrayProcessor {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: количество строк не равно 4.");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неверный размер массива: количество столбцов не равно 4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format("Неверные данные в ячейке [%d][%d]: '%s'", i, j, array[i][j]));
                }
            }
        }
        return sum;
    }
}
