public class PhoneBook {
    private Entry[] entries;
    private int size;

    public PhoneBook(int capacity) {
        this.entries = new Entry[capacity];
        this.size = 0;
    }

    public void add(String surname, String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (entries[i].surname.equals(surname)) {
                entries[i].addPhoneNumber(phoneNumber);
                return;
            }
        }
        if (size < entries.length) {
            entries[size++] = new Entry(surname, phoneNumber);
        }
    }

    public String[] get(String surname) {
        for (int i = 0; i < size; i++) {
            if (entries[i].surname.equals(surname)) {
                return entries[i].phoneNumbers;
            }
        }
        return new String[0];
    }

    private static class Entry {
        private String surname;
        private String[] phoneNumbers;
        private int size;

        public Entry(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumbers = new String[10];
            this.phoneNumbers[0] = phoneNumber;
            this.size = 1;
        }

        public void addPhoneNumber(String phoneNumber) {
            if (size < phoneNumbers.length) {
                phoneNumbers[size++] = phoneNumber;
            }
        }
    }
}
