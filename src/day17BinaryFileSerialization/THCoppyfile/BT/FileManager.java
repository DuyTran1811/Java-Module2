package day17BinaryFileSerialization.THCoppyfile.BT;

import java.io.*;
import java.util.List;

public class FileManager {
    private static final String pathFileTo = "/Users/turtle/Documents/LearJavaModule-2/src/day17BinaryFileSerialization/THCoppyfile/UserList.txt";
    private final File file1 = new File(pathFileTo);

    public void writeFile(List<ProductManagement> products) throws IOException {
        FileOutputStream fis = new FileOutputStream(pathFileTo);
        ObjectOutputStream obj = new ObjectOutputStream(fis);
        obj.writeObject(products);
        obj.close();
        fis.close();
    }

    public List<ProductManagement> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file1);
        ObjectInputStream ios = new ObjectInputStream(fileInputStream);
        return (List<ProductManagement>) ios.readObject();
    }
}
