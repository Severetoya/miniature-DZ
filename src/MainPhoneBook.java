public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(10);

        phoneBook.add("Иванов", "+79123456789");
        phoneBook.add("Петров", "+79234567890");
        phoneBook.add("Сидоров", "+79345678901");
        phoneBook.add("Иванов", "+79456789012");

        System.out.print("Номера Иванова: ");
        printPhoneNumbers(phoneBook.get("Иванов"));
        System.out.print("Номера Петрова: ");
        printPhoneNumbers(phoneBook.get("Петров"));
        System.out.print("Номера Сидорова: ");
        printPhoneNumbers(phoneBook.get("Сидоров"));
        System.out.print("Номера Кузнецова: ");
        printPhoneNumbers(phoneBook.get("Кузнецов"));
    }

    private static void printPhoneNumbers(String[] phoneNumbers) {
        if (phoneNumbers.length == 0 || phoneNumbers[0] == null) {
            System.out.println("Нет номеров");
            return;
        }
        for (String phoneNumber : phoneNumbers) {
            if (phoneNumber != null) {
                System.out.print(phoneNumber + " ");
            }
        }
        System.out.println();
    }
}
