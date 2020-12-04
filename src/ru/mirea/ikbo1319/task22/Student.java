package ru.mirea.ikbo1319.task22;

import ru.mirea.ikbo1319.task13.SortingStudentsByGPA;

import java.util.ArrayList;

public class Student extends ru.mirea.ikbo1319.task13.Student implements Sortable{
    static private final ArrayList<Student> students = new ArrayList<>();

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        students.add(this);
    }

    @Override
    public  void sort() {
        students.sort(new SortingStudentsByGPA());
    }

    @Override
    public  Student find(String firstName, String lastName) throws Exception {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) & student.getLastName().equals(lastName)) {
                return student;
            }
        }
        throw new Exception("Студент отсутствует !");
    }
}
