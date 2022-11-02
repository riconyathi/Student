package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students in your Class");
        int studentNumber = scanner.nextInt();
        String[] students = new String[studentNumber];
        int[] studentAges = new int[studentNumber];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student name :");
            students[i] = scanner.next();
            System.out.println("Enter student age :");
            studentAges[i] = scanner.nextInt();
        }

        for (int i = 0; i < students.length ; i++) {
            if(studentAges[i] >= 15){
                System.out.println(students[i]+" can be give vacine because age is :" + studentAges[i]);
            }
        }

    }
}