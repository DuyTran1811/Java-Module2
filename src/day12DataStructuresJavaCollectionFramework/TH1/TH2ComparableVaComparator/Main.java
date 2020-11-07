package day12DataStructuresJavaCollectionFramework.TH1.TH2ComparableVaComparator;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student =new Student("Kien",38,"HN");
        Student student1 =new Student("Nam",26,"ND");
        Student student2 =new Student("Anh",22,"HP");
        Student student3 =new Student("Tung",33,"HN");


        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st:list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("SO sanh Theo Tuoi Nho Truoc Lon Sau");
        for (Student st:list) {
            System.out.println(st.toString());
        }
    }
}
