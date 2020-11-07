package day19StringRegex.TH1.BT2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexphoneNumber {
    private static final String REGEXPHONENUMBER = "\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)";

    public RegexphoneNumber() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEXPHONENUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
