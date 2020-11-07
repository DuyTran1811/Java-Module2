package day19StringRegex.TH1.BT2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexphoneNumberTest {
RegexphoneNumber regexphoneNumber = new RegexphoneNumber();
    @Test
    @DisplayName("(84)-(0978489648)")
    void validate() {
        String regex = "(84)-(0978489648)";
        assertTrue(regexphoneNumber.validate(regex));
    }
}