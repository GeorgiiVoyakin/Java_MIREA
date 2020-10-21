package ru.mirea.ikbo1319.task13;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Василий", "Петров"));
        students.add(new Student("Иван", "Иванов"));
        students.add(new Student("Сергей", "Макаров"));
        students.add(new Student("Александр", "Самедов"));
        System.out.println("Origin array: ");
        System.out.println(students.toString());

        Collections.shuffle(students);
        System.out.println("Shuffled: ");
        System.out.println(students.toString());

        students.sort(new IdSorter());
        System.out.println("Sorted by ID: ");
        System.out.println(students.toString());

        students.sort(new SortingStudentsByGPA());
        System.out.println("Sorted by GPA: ");
        System.out.println(students.toString());
    }
}
