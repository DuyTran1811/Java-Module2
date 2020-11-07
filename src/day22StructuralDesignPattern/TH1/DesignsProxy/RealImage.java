package day22StructuralDesignPattern.TH1.DesignsProxy;

public class RealImage implements Image {
    private String url;

    public RealImage(String url) {
        this.url = url;
        System.out.println("Image Loaded: " + this.url);
    }

    @Override
    public void showImage() {
        System.out.println("Image showed: " + this.url);
    }
}
