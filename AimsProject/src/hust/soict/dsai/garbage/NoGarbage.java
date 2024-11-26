package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        // Corrected the file path
        String filename = "src/hust/soict/dsai/garbage/garbage.txt";

        long startTime, endTime;

        try {
            // Read all bytes from the file
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();

            // Use StringBuffer for string concatenation
            StringBuffer outputStringBuffer = new StringBuffer();
            for (byte b : inputBytes) {
                outputStringBuffer.append((char) b);
            }

            endTime = System.currentTimeMillis();
            System.out.println("NoGarbage Time: " + (endTime - startTime) + " ms");
            System.out.println("Processed Content Length: " + outputStringBuffer.length());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
