/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Exam;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class leapmonth {
 public static void main(String[] args) {
        // Declare variables
        int year;
        int month;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user for year and month
        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        month = input.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
        } else {
            // Determine if the year is a leap year
            boolean isLeapYear = (year % 4 == 0);
            isLeapYear = isLeapYear && (year % 100 != 0);
            isLeapYear = isLeapYear || (year % 400 == 0);

            // Display the result
            if (isLeapYear) {
                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println("The year " + year + " is not a leap year.");
            }
        }

        // Close the scanner
        input.close();
    }   
}
