package day9Testing.PhanLoaiTamGiac;

public class TriangleClassifier {
    public static String checkTriangleSide(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return "Không Phải Tam Giác";
        } else if (a == b && b == c) {
            return "Là Tam Giác Đều";
        } else if (a == b || a == c || b == c) {
            return "Là Tam Giác Cân";
        } else {
            return "là Tam Giác Lệch";
        }
    }
}
