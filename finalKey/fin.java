package OOP4Piller.finalKey;
//final public class fin{}
//final class cannot be inherited /extend
public class fin {
    String name;
    final String Univercity = "KPI"; // cannot be changed
    final int fee; // blank final variable
    static final int year; // static blanck final variable

    static {
        year = 2023; // static blank final only can initialise in static method
    }

    fin() {
        fee = 1200; // blank final var only can initialise in constructor

    }

    // void display() {
    //     System.out.println(name);
    //     System.out.println(Univercity);
    //     System.out.println(year);
    //     System.out.println(fee);

    // }


    // final method cannot be over written

    final void display(){
        //final method cannot be e override but it can be inherited

        System.out.println(name);
        System.out.println(Univercity);
    }

}
