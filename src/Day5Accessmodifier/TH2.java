package Day5Accessmodifier;

public class TH2 {
    public static class Student {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        Student(int r, String n) {
            rollno = r;
            name = n;
        }

        static void change() {
            college = " NoName:";
        }

        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }
}
class TestStaticMethod{
    public static void main(String[] args) {
        TH2.Student.change();
        TH2.Student s1 = new TH2.Student(111,"Nguyen Van A");
        TH2.Student s2 = new TH2.Student(222,"Nguyen Van B");
        TH2.Student s3 = new TH2.Student(333,"Nguyen Van C");
        s1.display();
        s2.display();
        s3.display();
    }
}
