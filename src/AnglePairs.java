//Step 7

// Java program for the above approach
import java.util.*;

class AnglePairs{

    // Function to find the angle
// between the two lines
    static void calculateAngle(int x1, int y1, int z1,
                               int x2, int y2, int z2,
                               int x3, int y3, int z3)
    {

        // Find direction ratio of line AB
        int ABx = x1 - x2;
        int ABy = y1 - y2;
        int ABz = z1 - z2;

        // Find direction ratio of line BC
        int BCx = x3 - x2;
        int BCy = y3 - y2;
        int BCz = z3 - z2;

        // Find the dotProduct
        // of lines AB & BC
        double dotProduct = ABx * BCx +
                ABy * BCy +
                ABz * BCz;

        // Find magnitude of
        // line AB and BC
        double magnitudeAB = ABx * ABx +
                ABy * ABy +
                ABz * ABz;
        double magnitudeBC = BCx * BCx +
                BCy * BCy +
                BCz * BCz;

        // Find the cosine of the
        // angle formed by line
        // AB and BC
        double angle = dotProduct;
        angle /= Math.sqrt(magnitudeAB * magnitudeBC);

        // Find angle in radian
        angle = (angle * 180) / 3.14;

        // Print the angle
        System.out.printf("%.4f", Math.abs(angle));
    }

    // Driver code
    public static void main(String[] args)
    {

        // Given coordinates
        // Points A
        int x1 = 1, y1 = 3, z1 = 3;

        // Points B
        int x2 = 3, y2 = 4, z2 = 5;

        // Points C
        int x3 = 5, y3 = 6, z3 = 9;

        // Function Call
        calculateAngle(x1, y1, z1,
                x2, y2, z2,
                x3, y3, z3);
    }
}

// This code is contributed by offbeat
