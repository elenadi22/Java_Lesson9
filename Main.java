package Lesson9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов", LocalDate.of(2000, 10, 19), 4.9f));
        listStudents.add(new Student("Петров", LocalDate.of(2002, 12, 12), 5.0f));
        listStudents.add(new Student("Сидоров", LocalDate.of(1998, 1, 13), 3.1f));
        listStudents.add(new Student("Пушкин", LocalDate.of(1799, 10, 19), 4.9f));
        listStudents.add(new Student("Гоголь", LocalDate.of(1809, 12, 12), 5.0f));
        listStudents.add(new Student("Толстой", LocalDate.of(1828, 1, 13), 3.1f));

        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
            System.out.println("-------------------------------");
        
    }
}
