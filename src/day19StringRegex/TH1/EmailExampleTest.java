package day19StringRegex.TH1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailExampleTest {
    EmailExample emailExample = new EmailExample();

    @Test
    @DisplayName("@gmail.com")
    void test1() {
        String regex = "@gmail.com";
        assertFalse(emailExample.validate(regex));
    }

    @Test
    @DisplayName("A@gmail.com")
    void test2() {
        String regex = "a@gmail.com";
        assertTrue(emailExample.validate(regex));
    }

    @Test
    @DisplayName("ab@yahoo.com")
    void test3() {
        String regex = "ab@yahoo.com";
        assertTrue(emailExample.validate(regex));
    }

    @Test
    @DisplayName("abc@hotmail.com")
    void test4() {
        String regex = "abc@hotmail.com";
        assertTrue(emailExample.validate(regex));
    }
    @Test
    @DisplayName("ab@gmail.")
    void test5(){
        String regex = "ab@gmail.";
        assertFalse(emailExample.validate(regex));
    }
    @Test
    @DisplayName("@#abc@gmail.com")
    void test6(){
        String regex = "@#abc@gmail.com";
        assertFalse(emailExample.validate(regex));
    }
}