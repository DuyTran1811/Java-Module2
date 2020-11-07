package day17BinaryFileSerialization.THCoppyfile.BT2;

import java.io.*;
import java.util.Date;

public class Copy {
    public static void main(String[] args) {
        String inputFile = "/Users/turtle/Documents/LearJavaModule-2/src/day17BinaryFileSerialization/THCoppyfile/ThienDangJoliPoli.mp3";
        String outputFile = "/Users/turtle/Documents/LearJavaModule-2/src/day17BinaryFileSerialization/THCoppyfile/BT2/ThienDangJoliPoli.mp3";
        try {
            File file = new File(inputFile);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            final int SIZE = 8 * 1024;
            byte[] buffe = new byte[SIZE];
            long start = new Date().getTime();
            while ((fileInputStream.read(buffe)) != -1) {
                fileOutputStream.write(buffe);
            }
            long end = new Date().getTime();
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("Copy File" + inputFile.substring(inputFile.lastIndexOf("\\") + 1) + "Successfully!");
            System.out.println("Time to complete: " + (end + start) + " ms ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
