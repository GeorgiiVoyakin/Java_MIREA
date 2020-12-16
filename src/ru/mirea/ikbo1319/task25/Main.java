package ru.mirea.ikbo1319.task25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    private static void func_1(){
        Calendar calendar = new GregorianCalendar(2001, Calendar.DECEMBER, 3);
        Student student = new Student("Иван", "Иванов", calendar.getTime());
        System.out.println(student.toString("yyyy-MM-dd"));
    }
    private static void func_2(){
        System.out.print("Введите дату в формате год-месяц-число часы:минуты\n");
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = df.parse(dateStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(df.format(date));
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    private static void func_3(){
        Calendar calendar = new GregorianCalendar(2020, Calendar.NOVEMBER, 17, 9, 56);
        Date dateTake = calendar.getTime();
        Date dateDone = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Воякин \nДата получения: " + df.format(dateTake) + "\nДата сдачи: " + df.format(dateDone));
    }

    public static void main(String[] args) {
        System.out.println("<----1---->");
        func_1();
        System.out.println("<----2---->");
        func_2();
        System.out.println("<----3---->");
        func_3();
    }
}
