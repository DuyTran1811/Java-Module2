package day23BehavioralDesignPattern.DesignsCommand;

public class Light {
    private boolean on;
    public void switchOn(){
        on = true;
        System.out.print("On ");
    }
    public void switchOff(){
        on = false;
        System.out.print("Off ");
    }
}
