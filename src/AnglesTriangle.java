//Step 8

//Java program for finding all angles of a triangle

class AnglesTriangle {
    // function for finding the angle
    static double angle_triangle(int x1, int x2, int x3,
                                 int y1, int y2, int y3, int z1, int z2, int z3)
    {

        int num = (x2-x1)*(x3-x1)+(y2-y1)*(y3-y1)+(z2-z1)*(z3-z1) ;

        double den = Math.sqrt(Math.pow((x2-x1),2)+
                Math.pow((y2-y1),2)+Math.pow((z2-z1),2))*
                Math.sqrt(Math.pow((x3-x1),2)+
                        Math.pow((y3-y1),2)+Math.pow((z3-z1),2)) ;

        double angle = Math.acos(num / den)*(180.0/3.141592653589793238463) ;

        return angle ;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x1 = -1;
        int y1 = 3;
        int z1 = 2;
        int x2 = 2;
        int y2 = 3;
        int z2 = 5;
        int x3 = 3;
        int y3 = 5;
        int z3 = -2;
        double angle_A = angle_triangle(x1, x2, x3, y1,
                y2, y3, z1, z2, z3);
        double angle_B = angle_triangle(x2, x3, x1,
                y2, y3, y1, z2, z3, z1);
        double angle_C = angle_triangle(x3, x2, x1,
                y3, y2, y1, z3, z2, z1);
        System.out.println("Angles are :");
        System.out.println("angle A = "+angle_A+" degree");
        System.out.println("angle B = "+angle_B+" degree");
        System.out.println("angle C = "+angle_C+" degree");
    }
}
// This code is contributed by mits
