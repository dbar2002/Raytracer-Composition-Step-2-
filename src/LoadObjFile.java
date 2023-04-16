//Step 1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadObjFile {

    public static void main(String[] args) throws FileNotFoundException {
        // 1. Load OBJ File
        // 11. A Main Function to Run the Program
        Scanner scanner = new Scanner(new File("src/teapot.obj"));

        int vertexCount = 0;
        int faceCount = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("v ")) {
                vertexCount++;
            } else if (line.startsWith("f ")) {
                faceCount++;
            }
        }
        // Number of faces and vertices
        System.out.println("Number of faces: " + faceCount);
        System.out.println("Number of vertices: " + vertexCount);

    }
}

