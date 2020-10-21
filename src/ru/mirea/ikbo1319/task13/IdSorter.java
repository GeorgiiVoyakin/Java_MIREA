package ru.mirea.ikbo1319.task13;

import java.util.Comparator;

public class IdSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getIDNumber(), o2.getIDNumber());
    }
}
