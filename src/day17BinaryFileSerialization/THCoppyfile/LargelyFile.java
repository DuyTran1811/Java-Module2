package day17BinaryFileSerialization.THCoppyfile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class LargelyFile {
    public static void main(String[] args) {
        File srcFile = new File("/Users/turtle/Documents/LearJavaModule-2/src/day17BinaryFileSerialization/THCoppyfile/ImagefromiOS.png");
        File destFile = new File("/Users/turtle/Documents/LearJavaModule-2/src/day17BinaryFileSerialization/THCoppyfile/1ImagefromiOS.png");
        copyFileUsingStream(srcFile,destFile);
    }
    private static void copyFileUsingStream(File source, File dest){
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) >0){
                os.write(buffer,0,length);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void copyFileUsingJava7Files(File src, File dest) throws IOException {
        Files.copy(src.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
