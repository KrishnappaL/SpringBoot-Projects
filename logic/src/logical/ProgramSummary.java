package logical;

import java.util.Scanner;

public class ProgramSummary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input
        int totalStudents = scnr.nextInt(); // Total number of students
        int textbooksPerStudent = scnr.nextInt(); // Number of textbooks needed per student
        double costPerTextbook = scnr.nextDouble(); // Cost of one textbook
        double lateRequestPercentage = scnr.nextDouble(); // Expected percentage of late textbook requests

        // Calculate number of textbooks required
        int totalTextbooks = totalStudents * textbooksPerStudent;

        // Calculate total cost
        double totalCost = totalTextbooks * costPerTextbook;

        // Output
        System.out.println("This order will support " + totalStudents + " students, each needing " + textbooksPerStudent + " textbooks.");
        System.out.println("Total textbooks needed: " + totalTextbooks);
        System.out.println("You will need to order " + totalTextbooks + " textbooks for a total cost of $" + String.format("%.2f", totalCost) + ".");

        // Input for late requests
        double lateRequestMultiplier = 1.0 + (lateRequestPercentage / 100.0);
        double lateRequestTextbooks = totalTextbooks * lateRequestMultiplier;
        int roundedLateRequestTextbooks = (int) Math.ceil(lateRequestTextbooks);
        double lateRequestCost = roundedLateRequestTextbooks * costPerTextbook;

        System.out.println("Allowing for late textbook requests, you should order: " + roundedLateRequestTextbooks + " textbooks for a cost of $" + String.format("%.2f", lateRequestCost) + ".");
    }
}
