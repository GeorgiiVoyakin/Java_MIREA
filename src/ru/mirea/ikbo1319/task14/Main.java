package ru.mirea.ikbo1319.task14;

import ru.mirea.ikbo1319.task13.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Василий", "Петров"));
        students.add(new Student("Иван", "Иванов"));
        students.add(new Student("Сергей", "Макаров"));
        students.add(new Student("Александр", "Самедов"));

        System.out.println(linearSearch(2, students));
        if (linearSearch(10, students) == null) {
            System.out.println("OK");
        }

        System.out.println(binarySearchRecursive(4, students, 0, students.size() - 1));
        System.out.println(binarySearchIter(1, students, 0, students.size() - 1));

        Collections.shuffle(students);
        System.out.print("Before quick sort: ");
        System.out.println(students.toString());
        long startTime = System.nanoTime();
        quickSort(students, 0, students.size() - 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.print("After quick sort: ");
        System.out.println(students.toString());
        System.out.println("Nano seconds: " + duration);

        Collections.shuffle(students);
        System.out.print("Before merge sort: ");
        System.out.println(students.toString());
        startTime = System.nanoTime();
        mergeSort(students);
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.print("After merge sort: ");
        System.out.println(students.toString());
        System.out.println("Nano seconds: " + duration);
    }

    public static Student linearSearch(int id, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getIDNumber() == id) {
                return student;
            }
        }
        return null;
    }

    public static Student binarySearchRecursive(int id, ArrayList<Student> students, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return null;
        }

        if (id == students.get(middle).getIDNumber()) {
            return students.get(middle);
        } else if (id < students.get(middle).getIDNumber()) {
            return binarySearchRecursive(id, students, low, middle - 1);
        } else {
            return binarySearchRecursive(id, students, middle + 1, high);
        }
    }

    public static Student binarySearchIter(int id, ArrayList<Student> students, int low, int high) {
        Student student = null;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (students.get(mid).getIDNumber() < id) {
                low = mid + 1;
            } else if (students.get(mid).getIDNumber() > id) {
                high = mid - 1;
            } else if (students.get(mid).getIDNumber() == id) {
                student = students.get(mid);
                break;
            }
        }
        return student;
    }

    public static void quickSort(ArrayList<Student> students, int low, int high) {
        if (students.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = students.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (Integer.compare(students.get(i).getIDNumber(), opora.getIDNumber()) == -1) {
                i++;
            }

            while (Integer.compare(students.get(j).getIDNumber(), opora.getIDNumber()) == 1) {
                j--;
            }

            if (i <= j) {//меняем местами
                Collections.swap(students, i, j);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }

    public static void mergeSort(ArrayList<Student> students) {
        if (students.size() < 2) {
            return;
        }
        int middle = students.size() / 2;
        ArrayList<Student> left = new ArrayList<>(middle);
        ArrayList<Student> right = new ArrayList<>(students.size() - middle);

        for (int i = 0; i < middle; i++) {
            left.add(i, students.get(i));
        }
        for (int i = middle; i < students.size(); i++) {
            right.add(i - middle, students.get(i));
        }

        mergeSort(left);
        mergeSort(right);

        students.clear();
        merge(students, left, right);
    }

    public static void merge(ArrayList<Student> students, ArrayList<Student> left, ArrayList<Student> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getIDNumber() <= right.get(j).getIDNumber()) {
                students.add(k++, left.get(i++));
            }
            else {
                students.add(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            students.add(k++, left.get(i++));
        }
        while (j < right.size()) {
            students.add(k++, right.get(j++));
        }
    }
}
