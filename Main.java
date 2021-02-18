import java.util.Scanner;

/**
 * The Hello World Program
 * @author Joanna Shorinde 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Ask the user for their name
    System.out.println("Please enter your name:");

    // Creating a Scanner for user input
    Scanner input = new Scanner(System.in);

    // Declare and initialize the name variable
    String name = input.nextLine();

    // Say hello to the user
    System.out.println("Hello " + name);

    // Ask the user when they were born
    System.out.println("Please enter the year you were born:");

    // Create the variable to store the birth year
    int birthYear = input.nextInt();

    // Calculate the approximate age 
    final int CURRENT_YEAR = 2021;
    int age = CURRENT_YEAR - birthYear;

    // Tell the user their age
    System.out.println ("You are approximately " + age + " years old.");
    
  }
}
