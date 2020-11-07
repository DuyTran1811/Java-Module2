package day19StringRegex.TH1.TH2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountExampleTest {
    AccountExample accountExample = new AccountExample();

    @Test
    @DisplayName("123abc_")
    void tes1() {
        String regex = "123abc_";
        assertTrue(accountExample.validate(regex));
    }

    @Test
    @DisplayName("_abc123")
    void tes2() {
        String regex = "_abc123";
        assertTrue(accountExample.validate(regex));
    }
    @Test
    @DisplayName("______")
    void tes3(){
        String regex = "______";
        assertTrue(accountExample.validate(regex));
    }
    @Test
    @DisplayName("123456")
    void tes4(){
        String regex = "123456";
        assertTrue(accountExample.validate(regex));
    }
    @Test
    @DisplayName("abcdefg")
    void tes5(){
        String regex = "abcdefg";
        assertTrue(accountExample.validate(regex));
    }
    @Test
    @DisplayName(".@")
    void tes6(){
        String regex = ".@";
        assertFalse(accountExample.validate(regex));
    }
    @Test
    @DisplayName("12345")
    void tes7(){
        String regex = "12345";
        assertFalse(accountExample.validate(regex));
    }
    @Test
    @DisplayName("1234_")
    void tes8(){
        String regex = "1234_";
        assertFalse(accountExample.validate(regex));
    }
    @Test
    @DisplayName("abcde")
    void tes9(){
        String regex = "abcde";
        assertFalse(accountExample.validate(regex));
    }
}