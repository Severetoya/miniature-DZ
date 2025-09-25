public class ShapesMain {
    public static void main(String[] args) {
      
        Circle circle = new Circle(5, "Красный", "Чёрный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Зелёный");
        Triangle triangle = new Triangle(3, 4, 5, "Жёлтый", "Оранжевый");

        System.out.println("Характеристики круга:");
        circle.printInfo();

        System.out.println("Характеристики прямоугольника:");
        rectangle.printInfo();

        System.out.println("Характеристики треугольника:");
        triangle.printInfo();
    }
}
