package OOP4Piller.Encapsulation.encapPractice;

public class encap2 {
    public static void main(String[] args) {
        encap1 Encap= new encap1();
        Encap.set("Ridoy"); 
        Encap.setCountry("Bd"); 
        Encap.setage(18); 

        System.out.println(Encap.getn());
        System.out.println(Encap.getcountry());
        System.out.println(Encap.getAge());
    }
}
