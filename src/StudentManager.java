public class StudentManager {
    private Student[] students;
    private int size;

    public StudentManager(int capacity) {
        this.students = new Student[capacity];
        this.size = 0;
    }

    public void addStudent(Student student) {
        if (size < students.length) {
            students[size++] = student;
        }
    }

    public void removeStudentsWithLowAverageGrade() {
        for (int i = 0; i < size; i++) {
            if (students[i].getAverageGrade() < 3) {
                removeStudent(i--);
            }
        }
    }

    public void promoteStudents() {
        for (int i = 0; i < size; i++) {
            if (students[i].getAverageGrade() >= 3) {
                students[i].setCourse(students[i].getCourse() + 1);
            }
        }
    }

    public void printStudents(int course) {
        System.out.println("Студенты " + course + "-го курса:");
        for (int i = 0; i < size; i++) {
            if (students[i].getCourse() == course) {
                System.out.println(students[i].getName());
            }
        }
    }

    private void removeStudent(int index) {
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--size] = null;
    }
}
