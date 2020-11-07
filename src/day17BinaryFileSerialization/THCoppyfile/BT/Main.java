package day17BinaryFileSerialization.THCoppyfile.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            FileManager prt = new FileManager();
            List<ProductManagement> list = new ArrayList<>();
            ProductManagement productss = new ProductManagement("Duy Blue","Hang",12,"Hang Tuan");
            list.add(productss);
            //ghi file
            prt.writeFile(list);
            //đọc file
            List<ProductManagement> prod = prt.readFile();
            System.out.println(prod.get(0).toString());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Xong!");
    }
}
