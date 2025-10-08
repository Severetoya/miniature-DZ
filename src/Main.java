public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager(10);

        manager.addStudent(new Student("Иванов Иван", "ИВТ-101", 1, new double[]{4.0, 5.0, 3.0}));
        manager.addStudent(new Student("Петров Петр", "ИВТ-101", 1, new double[]{2.0, 2.0, 3.0}));
        manager.addStudent(new Student("Сидоров Сидор", "ИВТ-102", 2, new double[]{5.0, 4.0, 5.0}));
        manager.addStudent(new Student("Алексеев Алексей", "ИВТ-102", 2, new double[]{3.0, 3.0, 3.0}));
        manager.addStudent(new Student("Николаев Николай", "ИВТ-103", 3, new double[]{2.0, 2.0, 2.0}));

        System.out.println("Список всех студентов до изменений:");
        manager.printStudents(1);
        manager.printStudents(2);
        manager.printStudents(3);

        manager.removeStudentsWithLowAverageGrade();
        manager.promoteStudents();

        System.out.println("\nСписок всех студентов после изменений:");
        manager.printStudents(1);
        manager.printStudents(2);
        manager.printStudents(3);
        manager.printStudents(4);
    }
}
