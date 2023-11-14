package OOP4Piller.Encapsulation.encapPractice;

public class encap1 {
    private String name;
    private int age;
    private String country;

    public void set(String name){
        this.name  = name;
    }
    public String getn(){
        return name;
    }
    public void setage(int age){
        this.age  = age;
    }
    public int getAge(){
        return age;
    }
    public void setCountry(String country){
        this.country  = country;
    }
    public String getcountry(){
        return country;
    }
}
