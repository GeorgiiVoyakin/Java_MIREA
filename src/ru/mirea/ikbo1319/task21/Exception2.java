package ru.mirea.ikbo1319.task21;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        try {
            exceptionDemo();
        } catch (Exception e) {
            System.err.println("Dividing by zero !");
        } finally {
            System.out.println("finally"); // блок выполнится в любом случае
        }
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i );
    }
}
