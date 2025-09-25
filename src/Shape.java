// Задание 2
public interface Shape {
    double calculatePerimeter(); // Метод для расчета периметра
    double calculateArea();      // Метод для расчета площади

    default void printInfo() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
    }

    String getFillColor();

    String getBorderColor();
}

