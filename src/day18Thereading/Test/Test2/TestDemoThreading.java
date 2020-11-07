package day18Thereading.Test.Test2;

import day18Thereading.TH.ThreadDemo;

public class TestDemoThreading {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        ThreadDemo threadDemo1 = new ThreadDemo("Threading 1");
        threadDemo1.start();
        ThreadDemo threadDemo2 = new ThreadDemo("Threading 2");
        threadDemo2.start();
        System.out.println("==> Main thread stopped!!! ");
    }
}
