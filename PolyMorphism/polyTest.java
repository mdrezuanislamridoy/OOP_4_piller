package OOP4Piller.PolyMorphism;

public class polyTest {
    public static void main(String[] args) {
        //compile time polymorphism ---->  Method overloading
        
        // poly po= new poly();
        // po.add();
        // po.add(4, 6);
        // po.add(6.67, 7.77, 77.9);
        
        // run time polymorphism

        // poly po= new poly();
        // poly pop= new polyCk(7.3,4.5);

        // System.out.println(po.Shape());
        // System.out.println(pop.Shape());


        // Run time polymorphism  / dinamic method dispass

        // poly p = new poly();
        //  p.display();
        // // polyCk t= new polyCk();
        // p= new polyCk(); //reference variable of poly class
        // p.display();
        

        poly[] s= new poly[2];
        
        s[0]= new poly();
        
        System.out.println(s[0].area());

        s[1]= new polyCk(11,21);
        System.out.println(s[1].area());

        for ( int i = 0;i<s.length;i++){
            System.out.println(s[i].area());
        }
    }
}
