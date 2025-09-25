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
