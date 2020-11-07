package day19StringRegex.TH1;

public class Test {
    public static EmailExample example;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        example = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = example.validate(email);
            System.out.println("Email is " + email + " Hop Le " + isvalid);
        }
        System.out.println("  ");
        for (String email : invalidEmail) {
            boolean isvali = example.validate(email);
            System.out.println("Email is " + email + " Khong Hop le " + isvali);
        }
    }
}
