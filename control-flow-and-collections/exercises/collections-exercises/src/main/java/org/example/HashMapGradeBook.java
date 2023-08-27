package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradeBook {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student name (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID number: ");
                int idNumber = input.nextInt();
                students.put(idNumber, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
        }

    }
}
