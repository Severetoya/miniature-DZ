// Задание 1
public class Main {
    public static void main(String[] args) {
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

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
    }
}
