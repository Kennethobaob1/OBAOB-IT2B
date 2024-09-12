
package obaobit2b;

import java.util.ArrayList;
import java.util.Scanner;

public class ScholarshipApplication {

    static class Applicant {
        String name;
        int age;
        double gpa;
        String major;
        boolean eligible;

        Applicant(String name, int age, double gpa, String major) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.major = major;
            this.eligible = checkEligibility();
        }

        boolean checkEligibility() {
            // Example criteria: Age between 18 and 25, GPA of 3.0 or higher
            return age >= 18 && age <= 25 && gpa >= 3.0;
        }

        @Override
        public String toString() {
            return String.format("Name: %s, Age: %d, GPA: %.2f, Major: %s, Eligible: %b",
                    name, age, gpa, major, eligible);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Applicant> applicants = new ArrayList<>();

        System.out.println("Welcome to the Scholarship Application System!");

        while (true) {
            System.out.print("Enter applicant's name (or type 'exit' to quit): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter applicant's age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter applicant's GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter applicant's major: ");
            String major = scanner.nextLine();

            Applicant applicant = new Applicant(name, age, gpa, major);
            applicants.add(applicant);

            System.out.println("Applicant added successfully!");
            System.out.println();
        }

        System.out.println("Application Summary:");
        for (Applicant applicant : applicants) {
            System.out.println(applicant);
        }

        scanner.close();
    }
}

    
}
