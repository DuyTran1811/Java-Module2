package day9Testing.PhanLoaiTamGiac;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {
    @Test
    public void checkTriangleSide1() {
        int a = 2, b = 2, c = 3;
        System.out.println(TriangleClassifier.checkTriangleSide(a,b,c));
    }
}