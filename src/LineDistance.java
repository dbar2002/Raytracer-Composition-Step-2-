//Step 2

// Java program to find the Shortest
// Distance Between A line and a
// Given point.
public class LineDistance {
    private int x, y, z;

    // 3D Coordinates of the Vector
    public LineDistance(int x, int y, int z)
    {
        // Constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // ADD 2 Vectors
    public LineDistance add(LineDistance v)
    {
        int x1, y1, z1;
        x1 = x + v.x;
        y1 = y + v.y;
        z1 = z + v.z;
        return new LineDistance(x1, y1, z1);
    }
    // Subtract 2 vectors
    public LineDistance subtract(LineDistance v)
    {
        int x1, y1, z1;
        x1 = x - v.x;
        y1 = y - v.y;
        z1 = z - v.z;
        return new LineDistance(x1, y1, z1);
    }
    // Dot product of 2 vectors
    public int dotProduct(LineDistance v)
    {
        int x1, y1, z1;
        x1 = x * v.x;
        y1 = y * v.y;
        z1 = z * v.z;
        return (x1 + y1 + z1);
    }
    // Cross product of 2 vectors
    public LineDistance crossProduct(LineDistance v)
    {
        int x1, y1, z1;
        x1 = y * v.z - z * v.y;
        y1 = z * v.x - x * v.z;
        z1 = x * v.y - y * v.x;
        return new LineDistance(x1, y1, z1);
    }

    public float magnitude()
    {
        return (float)Math.sqrt(Math.pow(x, 2)
                + Math.pow(y, 2)
                + Math.pow(z, 2));
    }

    public String toString()
    {
        return x + "i " + (y >= 0 ? "+ " : "") + y + "j "
                + (z >= 0 ? "+ " : "") + z + "k";
    }

    // calculate shortest dist. from point to line
    public static float shortDistance(LineDistance line_point1,
                                      LineDistance line_point2,
                                      LineDistance point)
    {
        LineDistance AB = line_point2.subtract(line_point1);
        LineDistance AC = point.subtract(line_point1);
        float area = (AB.crossProduct(AC)).magnitude();
        float CD = area / AB.magnitude();
        return CD;
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Taking point C as (2, 2, 2)
        // Line Passes through A(4, 2, 1)
        // and B(8, 4, 2).
        LineDistance line_point1 = new LineDistance(4, 2, 1);
        LineDistance line_point2 = new LineDistance(8, 4, 2);
        LineDistance point = new LineDistance(2, 2, 2);

        System.out.println("Shortest Distance is : "
                + shortDistance(line_point1,
                line_point2,
                point));
    }
}
