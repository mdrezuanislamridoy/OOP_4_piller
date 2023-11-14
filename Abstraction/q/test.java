package OOP4Piller.Abstraction.q;

public class test {
    public static void main(String[] args) {
        shape sp;
        sp= new triangle(33, 21);
        sp.rec();
        sp = new rectriangle(5, 6);
        sp.rec();
        sp = new circle(4);
        sp.rec();
    }
}
