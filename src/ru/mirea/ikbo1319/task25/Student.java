package ru.mirea.ikbo1319.task25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Student {
    private final String firstName;
    private final String lastName;
    private static int currentId = 0;
    private final int iDNumber;
    private final int math;
    private final int english;
    private final int computerScience;
    private final int PE;
    private final int Java;
    private final double GPA;
    private final Date birthDate;

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        currentId++;
        iDNumber = currentId;
        Random generator = new Random();
        math = generator.nextInt(5) + 1;
        english = generator.nextInt(5) + 1;
        computerScience = generator.nextInt(5) + 1;
        PE = generator.nextInt(5) + 1;
        Java = generator.nextInt(5) + 1;
        GPA = (math + english + computerScience + PE + Java) / 5.0;

        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public int getComputerScience() {
        return computerScience;
    }

    public int getPE() {
        return PE;
    }

    public int getJava() {
        return Java;
    }

    public double getGPA() {
        return GPA;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String toString(String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA='" + GPA + '\'' +
                ", iDNumber=" + iDNumber +
                ", birthDay=" +
                df.format(birthDate) +
                '}';
    }
}

