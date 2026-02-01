package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the Student's name : ");
        String studentName = scanner.nextLine();

        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();


        System.out.println("Enter the names of the subjects: ");
        while (true) {
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            if (subject.equalsIgnoreCase("stop")) {
                break;
            }
            subjects.add(subject);
        }

        int sum = 0;


        System.out.println("Enter the grade of the subject: ");
        for (String subject : subjects) {

            int grade = scanner.nextInt();
            grades.add(grade);
            sum += grade;
        }


        double average =  (double) sum / subjects.size();


        System.out.println("Student: " + studentName);
        System.out.println("Subjects and grades:");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i) + " — " + grades.get(i));
        }
        System.out.println("Average grade: "+ average);
    }
}










