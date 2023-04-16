//Step 2

// Java Program to Illustrate Absolute Method
// of Math Class

// Importing all Math classes
// from java.lang package
import java.lang.Math;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Custom integer input received from user
        int n = -7;

        // Printing value before applying absolute function
        System.out.println(
                "Without applying Math.abs() method : " + n);

        // Applying absolute math function and
        // storing it in integer variable
        int value = Math.abs(n);

        // Printing value after applying absolute function
        System.out.println(
                "With applying Math.abs() method : " + value);
    }
}
