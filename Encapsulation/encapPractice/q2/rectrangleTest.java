package OOP4Piller.Encapsulation.encapPractice.q2;

public class rectrangleTest {
    public static void main(String[] args) {
        rectrangle rect = new rectrangle();
        rect.setH(11);

        rect.setW(5);

        double height = rect.getH();
        System.out.println("heigt is " + height);
        double width = rect.getW();
        System.out.println("Width is " + width);

        System.out.println("rectrangle area is " + height * width);

    }
}
