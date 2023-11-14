package OOP4Piller.Inheritance.superK;

public class sp2 extends sp1 {
    // @Override
    // void display(){
    // super.display();
    // System.out.println("this is sp2");
    // }
    // sp2(){
    // super();
    // System.out.println("this is b");
    // }

    int gear;

    sp2(String color, double width, int gear) {
        super(width, color);
        this.gear = gear;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("gear is " + gear);
    }
}
