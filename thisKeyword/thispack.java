package OOP4Piller.thisKeyword;

public class thispack {
    String name;
    int age, phn;

    thispack(String name, int age) {
        this.name = name;
        this.age = age;
    }

    thispack(String name, int age, int phn) {
        this(name, age);
        this.phn = phn;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    void display2() {
        this.display();
        System.out.println(phn);
    }
}
