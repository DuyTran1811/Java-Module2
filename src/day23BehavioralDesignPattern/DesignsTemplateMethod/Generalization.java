package day23BehavioralDesignPattern.DesignsTemplateMethod;

abstract class Generalization {
    void findSolution() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }

    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }

    abstract void stepTwo();

    abstract void stepThree();

    void stepFour() {
        System.out.println("Generalization.stepFour");
    }
}
