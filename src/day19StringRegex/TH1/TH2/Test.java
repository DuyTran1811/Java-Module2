package day19StringRegex.TH1.TH2;

public class Test {
    public static AccountExample example;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        example = new AccountExample();
        for (String ac : validAccount) {
            boolean isvalid = example.validate(ac);
            System.out.println(" Account is " + ac + " Hop Le " + isvalid);
        }
        System.out.println(" ");
        for (String acc : invalidAccount) {
            boolean isvalid = example.validate(acc);
            System.out.println(" Account is " + acc + " Khong Hop Le " +isvalid);
        }
    }
}
