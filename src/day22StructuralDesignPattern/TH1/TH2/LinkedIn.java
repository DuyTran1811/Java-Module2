package day22StructuralDesignPattern.TH1.TH2;

public class LinkedIn implements SocialShare {
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to LinkedIn: "+this.message);
    }
}
