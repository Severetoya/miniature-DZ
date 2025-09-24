// Задание 1
abstract class Animal {
    protected static int animalCount = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть. В миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. Максимум 10 м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске: " + foodAmount);
    }
}

// Задание 2
interface Shape {
    double calculatePerimeter();
    double calculateArea();

    default void printInfo() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
    }
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Круг:");
        Shape.super.printInfo();
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границ: " + borderColor);
        System.out.println();
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Прямоугольник:");
        Shape.super.printInfo();
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границ: " + borderColor);
        System.out.println();
    }
}

class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public void printInfo() {
        System.out.println("Треугольник:");
        Shape.super.printInfo();
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границ: " + borderColor);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Cat catBarsik = new Cat("Барсик");
        Cat catMurzik = new Cat("Мурзик");
        Dog dogBobik = new Dog("Бобик");

        catBarsik.run(150);
        catBarsik.swim(5);
        dogBobik.run(400);
        dogBobik.swim(5);

        Bowl bowl = new Bowl(30);
        Cat[] cats = {catBarsik, catMurzik, new Cat("Васька"), new Cat("Рыжик")};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + (cat.isFull() ? " сыт." : " голоден."));
        }

        bowl.addFood(20);

        System.out.println("Всего животных: " + Animal.animalCount);
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        System.out.println("\nЗадание 2");
        Circle circle = new Circle(3, "Красный", "Чёрный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Зелёный");
        Triangle triangle = new Triangle(3, 4, 5, "Жёлтый", "Оранжевый");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
