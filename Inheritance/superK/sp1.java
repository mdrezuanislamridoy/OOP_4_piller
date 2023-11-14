package OOP4Piller.Inheritance.superK;

public class sp1 {
    // void display(){
    // System.out.println("this is sp1");
    // }

    // sp1(){
    // System.out.println("this is a");
    // }
    // }

    String color;
    double width;

    sp1(double width, String color) {
        this.color = color;
        this.width = width;

    }

    void attribute() {
        System.out.println("color is " + color);
        System.out.println("width is " + width);
    }

}
