// Задание 1
class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String country, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронировано" : "Не забронировано"));
        System.out.println();
    }
}
// Задание 2
public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Пикачу Плюшевый", "15.01.2025",
                "The Pokémon Company", "Japan", 1999, true);
        productsArray[1] = new Product("Чармандер Фигурка", "10.02.2025",
                "Bandai", "Japan", 1299, false);
        productsArray[2] = new Product("Бульбазавр Карточка", "20.03.2025",
                "Pokémon Center", "USA", 499, true);
        productsArray[3] = new Product("Сквиртл Плюшевый", "05.04.2025",
                "Nintendo", "Japan", 1599, false);
        productsArray[4] = new Product("Иви Набор", "12.05.2025",
                "Takara Tomy", "Japan", 2999, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}
// Задание 3
class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }
public class Attraction {
    private String name;
    private String workingHours;
    private double price;

    public Attraction(String name, String workingHours, double price) {
        this.name = name;
        this.workingHours = workingHours;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Аттракцион: " + name);
        System.out.println("Время работы: " + workingHours);
        System.out.println("Стоимость: " + price);
        System.out.println();
    }
}
}
